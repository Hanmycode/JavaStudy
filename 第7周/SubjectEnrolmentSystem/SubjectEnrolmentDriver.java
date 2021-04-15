package SubjectEnrolmentSystem;

import java.util.Scanner;

public class SubjectEnrolmentDriver {
	public static Enrolment enrol = null;
	public static int count = 0;
	private static boolean flag = false;
	
	public static void main(String[] args) {
		int choose = menu();
		while(choose != 5) {
			switch(choose) {
			case 1: creatSubject();  break;
			case 2: addStudent();    break;
			case 3: deleteStudent(); break;
			case 4: printDetails();  break;
			default: System.out.println("错误:请重新输入！");
			choose = menu();
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用！");
	}
	
	public static int menu() {
		int choose = 0;
		System.out.println("*********WTU选课系统*********");
		System.out.println("1. 创建课程");
		System.out.println("2. 选课");
		System.out.println("3. 退选");
		System.out.println("4. 打印名单");
		System.out.println("5. 退出");
		System.out.println("****************************");
		System.out.print("请输入您的选择(1~5):");
		
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
	
	public static boolean creatSubject() {
		if(flag) {
			Scanner scan = new Scanner(System.in);
			System.out.println("课程已存在，是否重新创建(y/n):");
			System.out.print("请输入您的选择:");
			String xuanze = scan.next();
			
			if(xuanze.equals("y")) {
				System.out.println("请输入课程代码:");
				String subjectID = scan.next();
				System.out.println("请输入课程名称:");
				String subjectName = scan.next();
				System.out.println("请输入最大容量:");
				int maxNumber = scan.nextInt();
				
				Subject sub = new Subject(subjectID, subjectName, maxNumber);
				enrol = new Enrolment(sub, maxNumber);
				
				System.out.println("创建课程成功! 信息如下:");
				System.out.println(enrol.getSub().toString());
				return true;
			}
			else
				return true;
			
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入课程代码:");
		String subjectID = scan.next();
		System.out.println("请输入课程名称:");
		String subjectName = scan.next();
		System.out.println("请输入最大容量:");
		int maxNumber = scan.nextInt();
		
		Subject sub = new Subject(subjectID, subjectName, maxNumber);
		enrol = new Enrolment(sub, maxNumber);
		
		System.out.println("创建课程成功! 信息如下:");
		System.out.println(enrol.getSub().toString());
		flag = true;
		return true;
		
	}
	
	public static boolean addStudent() {
		if(!flag) {
			System.out.println("错误:请先创建课程!");
			return false;
		}
		if(count>=enrol.getStuList().length) {
			System.out.println("错误:该课程已满,请您选择其他课程!");
			return false;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生的学号:");
		String id = scan.next();
		System.out.println("请输入学生的姓名:");
		String name = scan.next();
		Student stu = new Student(id, name);
	
		enrol.getStuList()[count] = stu;
		count++;
		System.out.println("恭喜你,选课成功!");
		printDetails();
		return true;
	}
	
	public static boolean deleteStudent() {
		if(!flag) {
			System.out.println("错误:请先创建课程!");
			return false;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入要退选学生的学号:");
		String id = scan.next();
		int index = -1;
		for(int i=0;i<enrol.getStuList().length&&enrol.getStuList()[i]!=null;i++) {
			if(enrol.getStuList()[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index<0) {
			System.out.println("错误:学号为"+id+"的学生未选择该课程!");
			return false;
		}
		enrol.getStuList()[index] = null;
		for(int i=index;i<count-1;i++) {
			enrol.getStuList()[i] = enrol.getStuList()[i+1]; //前移覆盖
		}
		count--;
		enrol.getStuList()[count] = null;
		System.out.println("退选成功!");
		printDetails();
		return true;
	}
	
	public static void printDetails() {
		if(!flag) {
			System.out.println("错误:请先创建课程!");
		}
		else {
			System.out.println("选课表如下:");
			System.out.println(enrol.toString());
			System.out.println("已选人数:" + count);
			System.out.println("======================================\n");
		}
	}
	
}
