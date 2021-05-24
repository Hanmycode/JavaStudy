package StudentScore.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import StudentScore.vo.Course;
import StudentScore.vo.Result;
import StudentScore.vo.Student;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Dao {
	
	
	public static ArrayList<Student> inputStudent(){
		ArrayList<Student> stuList = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		String aLine = "";
		while(!(aLine= scan.nextLine()).equals("end")){
			String arr[] = aLine.split(",|锛�");
			String id = arr[0];
			String name = arr[1];
			String gender = arr[2];			
			Student stu = new Student(id,name,gender);
			stuList.add(stu);
		}		
		return stuList;
	}

	public static ArrayList<Student> importStudentFromTxt(){
		ArrayList<Student> stuList = new ArrayList<Student>();
		try {
			File file = new File("src/date_file/student.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bf = new BufferedReader(fr);
			String aLine = "";
			while((aLine= bf.readLine())!=null){
				String arr[] = aLine.split(",|锛�");
				String id = arr[0];
				String name = arr[1];
				String gender = arr[2];	
				Student stu = new Student(id,name,gender);
				stuList.add(stu);
			}
//			System.out.println("缁撴潫");
			bf.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return stuList;
	}

		public static ArrayList<Student> importStudentFromExcel(){
			ArrayList<Student> stuList = new ArrayList<Student>();
			try{
				File file = new File("src/date_file/000.xls");
				Workbook workbook = Workbook.getWorkbook(file);
				Sheet sheet = workbook.getSheet(1);				
				int columns = sheet.getColumns();
				int row = sheet.getRows();
				for(int i=0 ;i<row;i++){
					Cell cell = sheet.getCell(0,i);
					String id=cell.getContents();
					cell = sheet.getCell(1,i);
					String name = cell.getContents();
					cell = sheet.getCell(2,i);
					String gender = cell.getContents();	
					
					Student stu = new Student(id,name,gender);
					stuList.add(stu);

				}							
			}			
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			return stuList;
		}
	
	
	public static ArrayList<Course> inputCourse(){
		ArrayList<Course> couList = new ArrayList<Course>();
		Scanner scan = new Scanner(System.in);
		String aLine = "";
		while(!(aLine= scan.nextLine()).equals("end")){
			String arr[] = aLine.split(",|锛�");
			String id = arr[0];
			String course = arr[1];
			String genders = arr[2];
			float gender = Float.parseFloat(genders);
			Course cou = new Course(id,course,gender);
			couList.add(cou);
		}		
		return couList;
	}

	public static ArrayList<Course> importCourseFromTxt(){
		ArrayList<Course> couList = new ArrayList<Course>();
		try {
					File file = new File("src/xx.txt");
					FileReader fr = new FileReader(file);
					BufferedReader bf = new BufferedReader(fr);
					String aLine = "";
					while((aLine= bf.readLine())!=null){
						String arr[] = aLine.split(",|锛�");
						String id = arr[0];
						String course = arr[1];
						String genders = arr[2];
						float gender = Float.parseFloat(genders);
						Course cou = new Course(id,course,gender);
						couList.add(cou);
					}
					bf.close();
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}			
				return couList;
			}
			
	public static ArrayList<Course> importCourseFromExcel(){
		ArrayList<Course> couList = new ArrayList<Course>();
		try{
			File file = new File("src/xxx.xls");
			Workbook workbook = Workbook.getWorkbook(file);
			Sheet sheet = workbook.getSheet(2);				
			int columns = sheet.getColumns();
			int row = sheet.getRows();
			for(int i=0 ;i<row;i++){
				Cell cell = sheet.getCell(0,i);
				String id=cell.getContents();
				cell = sheet.getCell(1,i);
				String course = cell.getContents();
				cell = sheet.getCell(2,i);
				String genders = cell.getContents();	
				float gender = Float.parseFloat(genders);					
				Course cou = new Course(id,course,gender);
				couList.add(cou);

			}							
		}			
		catch (Exception e) {
			e.printStackTrace();
		}		
		return couList;
	}		
		

	public static ArrayList<Student> processByStudent(ArrayList<Student> stuList,ArrayList<Course> couList){
		ArrayList<Student> list3 = new ArrayList<Student>();
		for (Student student : stuList) {
			int count = 0;
			float sum = 0;
			String id = student.getId();
			for (Course course : couList) {
				if(id.equals(course.getId())) {
					sum +=course.getGrade();
					count++;
				}				
			}

			float avg = sum / count;
			student.setGrade(avg);
			list3.add(student);
		}		
		return list3;
	}

		public static ArrayList<Result> processByCourse(ArrayList<Course> couList){
			ArrayList<Result> list4 = new ArrayList<Result>();
			for (Course course : couList) {
				int index = find(list4,course.getCourse());				
				if(index == -1) {
					Result result = new Result(course.getCourse(),0);
					list4.add(result);
				}				
			}
			int num1=list4.size();          
			for(int i=0;i < num1; i++) {
				Result result =list4.get(i);
				int count = 0;
				float sum = 0;
				String courseName = result.getCourse();
				for (Course course : couList) {
					if(courseName.equals(course.getCourse())) {
						sum += course.getGrade();
						count++;
					}				
				}
				float avg = sum / count;
				result.setGrade(avg);
				list4.add(result);
			}
			return list4;
		}
		
		private static int find(ArrayList<Result> list4,String course) {
			int index = -1;
			for (int i = 0; i < list4.size(); i++) {
				if(list4.get(i).getCourse().equals(course)) {
					index = i;
					break;
				}				
			}
			
			return index;
		}
	
	public static void printAll(ArrayList<Student> stuList, ArrayList<Result> resList){
		System.out.println("鎸夊鐢熺粺璁★細");
		System.out.println("瀛﹀彿\t濮撳悕\t鎬у埆\t骞冲潎鍒�");
		for (Student student : stuList) {
			System.out.println(student.toString());
		}
		System.out.println("鎸夎绋嬬粺璁★細");
		System.out.println("璇剧▼\t骞冲潎鍒�");
		for (Result result : resList) {
			System.out.println(result.toString());
		}
		
	}

	public static void writeTxt(ArrayList<Student> stuList, ArrayList<Result> resList){
		FileWriter fw = null;
		try {
		
		File f=new File("src/date_file/result.txt");
		fw = new FileWriter(f, true);
		} catch (IOException e) {
		e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(fw);
		pw.println("*****************************");
		pw.println("\n\t\t"+"杩藉姞鍐呭\n");
		pw.println("*****************************");
		pw.flush();		
//		File file = new File("src/date_file/result.txt");
		try{
//			FileWriter fw = new FileWriter(file);
//			PrintWriter pw = new PrintWriter(fw);
			
			pw.println("鎸夊鐢熺粺璁★細");
			pw.println("瀛﹀彿\t濮撳悕\t鎬у埆\t骞冲潎鍒�");
			for (Student student : stuList) {
				pw.println(student.toString());
			}
			pw.println("鎸夎绋嬬粺璁★細");
			pw.println("璇剧▼\t骞冲潎鍒�");
			for (Result result : resList) {
				pw.println(result.toString());
			}
			fw.flush();
			pw.close();
			fw.close();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	
	
	
}
