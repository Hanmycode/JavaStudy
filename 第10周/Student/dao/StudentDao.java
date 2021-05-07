package Student.dao;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

import Student.vo.Result;
import Student.vo.Student;

public class StudentDao {
	
	//1.输入，并将数据以某种数据类型进行存放
	public static ArrayList<Student> inputFromKeyBoard() {
		ArrayList<Student> stuList = new ArrayList<Student>();
		
		Scanner scan = new Scanner(System.in);
		String info = "";
		
		while(!(info = scan.nextLine()).equals("end")) {
			String stuArray[] = info.split(",|，");
			Student stu = new Student(stuArray[0], stuArray[1], stuArray[2], stuArray[3]);
			stuList.add(stu);
		}
		return stuList; //返回学生集合类
	}
	
	//2.处理，将处理的结果进行保存
	//--统计每个性别的人数
	public static int statisticByGender(ArrayList<Student> stuList, String gender) {
		int count = 0;
		for(Student stu : stuList) {
			if(stu.getGender().equals(gender))
				count++;
		}
		return count;
	}
	
	//--统计省份信息
	public static  ArrayList<Result> statisticProvince(ArrayList<Student> stuList) {
		ArrayList<Result> resultList = new ArrayList<Result>();
		
		for(Student stu : stuList) {
			String province = stu.getProvince();
			String name = stu.getName();
			
			int index = isProvinceExist(resultList, province);
			if(index!=-1) {
				Result oldResilt = resultList.get(index);
				oldResilt.setCount(oldResilt.getCount()+1);
				oldResilt.setNames(oldResilt.getNames()+","+name);
				resultList.set(index, oldResilt);
			} else {
				Result result = new Result(province, 1, name);
				resultList.add(result);
			}
		}
		return resultList;
	}
	
	//--在结果集合中查询该省份是否存在
	public static int isProvinceExist(ArrayList<Result> resultList, String province) {
		int index = -1;
		for(int i=0;i<resultList.size();i++) {
			Result result = resultList.get(i);
			if(result.getProvince().equals(province)) {
				index = i;
				return index;
			}
		}
		return index;
	}
	
	//3.输出 显示
	public static void output(ArrayList<Student> stuList, ArrayList<Result> resultList) {
		int totalCount = stuList.size();
		
		int maleCount = statisticByGender(stuList, "男");
		int femaleCount = statisticByGender(stuList, "女");
		
		System.out.println("总人数:"+totalCount);
		System.out.println("其中男:"+maleCount+"人,"+new Formatter().format("%.2f", maleCount*100.0f/totalCount)+"%, 女:"+femaleCount+"人,"
				+ new Formatter().format("%.2f", femaleCount*100.0f/totalCount) +"%");
		
		for(Result result : resultList) {
			System.out.println(result.toString());
		}
	}
}
