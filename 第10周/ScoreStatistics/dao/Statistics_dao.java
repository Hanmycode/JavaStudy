package ScoreStatistics.dao;

import java.util.ArrayList;
import java.util.Scanner;

import ScoreStatistics.vo.CourseResult;
import ScoreStatistics.vo.CourseTotal;
import ScoreStatistics.vo.ScoreInfomation;
import ScoreStatistics.vo.StudentInfomation;
import ScoreStatistics.vo.StudentResult;


public class Statistics_dao {
	//输入
	public static ArrayList<StudentInfomation> inputStuInfo() {
		ArrayList<StudentInfomation> stuInfo = new ArrayList<StudentInfomation>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		while (!data.equals("end")) 
		{
			String array[] = data.split(",|，");
			StudentInfomation stu = new StudentInfomation(array[0], array[1], array[2]);
			stuInfo.add(stu);
			data = scan.nextLine();
		}
		return stuInfo;
	}

	public static ArrayList<ScoreInfomation> inputScore() {
		ArrayList<ScoreInfomation> scoreInfo = new ArrayList<ScoreInfomation>();
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		while (!data.equals("end")) 
		{
			String array[] = data.split(",|，");
			ScoreInfomation score = new ScoreInfomation(array[0], array[1], Integer.parseInt(array[2]));// 将string换成int

			scoreInfo.add(score);
			data = scan.nextLine();
		}
		return scoreInfo;
	}

	//处理
	public static ArrayList<StudentResult> getStuResult(ArrayList<StudentInfomation> stuInfo,ArrayList<ScoreInfomation> scoreInfo) {
		ArrayList<StudentResult> stuResult = new ArrayList<StudentResult>();
		for (int i = 0; i < stuInfo.size(); i++) {
			StudentInfomation stuInfo_X = stuInfo.get(i);
			
			double avg = 0, sum = 0, count = 0;
			for (i = 0; i < scoreInfo.size(); i++) {
				if (scoreInfo.get(i).getId().equals(stuInfo_X.getId())) {
					sum += scoreInfo.get(i).getGrade();
					count++;
				}
			}
			avg = sum/count;
			
			StudentResult result = new StudentResult(stuInfo_X.getId(), stuInfo_X.getName(), stuInfo_X.getGender(), avg);
			stuResult.add(result);
		}
		return stuResult;
	}
	
	public static int isExist(String s, ArrayList<CourseTotal> courseTot) {
		int index = -1;
		for (int i = 0; i < courseTot.size(); i++) {
			if (courseTot.get(i).getCourse().equals(s)) {
				return i;
			}
		}
		return index;
	}
	
	public static ArrayList<CourseResult> disposeCla(ArrayList<ScoreInfomation> scoreInfo) {
		ArrayList<CourseResult> courseResult = new ArrayList<CourseResult>();
		ArrayList<CourseTotal> courseTotal = new ArrayList<CourseTotal>();

		for (int i = 0; i < scoreInfo.size(); i++) {
			int index = isExist(scoreInfo.get(i).getCourse(), courseTotal);
			if (index != -1) {
				CourseTotal cours_to = courseTotal.get(index);
				cours_to.setTotal(cours_to.getTotal() + scoreInfo.get(i).getGrade());
				cours_to.setNum(cours_to.getNum()+1);
				courseTotal.set(index,cours_to);
			} 
			else {
				CourseTotal cours_to = new CourseTotal(scoreInfo.get(i).getCourse(), scoreInfo.get(i).getGrade(), 1);
				courseTotal.add(cours_to);
			}

		}

		for (int i = 0; i < courseTotal.size(); i++) {
			CourseTotal coutot = courseTotal.get(i);
			CourseResult coures = new CourseResult(coutot.getCourse(), coutot.getTotal() / coutot.getNum());
			courseResult.add(coures);
		}

		return courseResult;
	}


	//输出
	public static StringBuffer output(ArrayList<StudentResult> stuResult, ArrayList<CourseResult> coursrResult) {
		StringBuffer display = new StringBuffer();
		display.append("按学生统计：\n");
		display.append("学号\t姓名\t性别\t平均分\n");
		for (int i = 0; i < stuResult.size(); i++) {
			display.append(stuResult.get(i).toString());
			display.append("\n");
		}
		display.append("\n按课程统计：");
		display.append("\n课程\t平均分\n");
		for (int i = 0; i < coursrResult.size(); i++) {
			display.append(coursrResult.get(i).toString());
			display.append("\n");
		}
		return display;
	}
}
