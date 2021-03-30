package ClassList;

import java.util.Scanner;

public class ClassListDriver {
	
	private static ClassList list = null;
	private static boolean flag = false;
	
	public static void main(String[] args) {
		int choose = menu();
		while(choose != 3) {
			switch(choose) {
			case 1: createList(); break;
			case 2: { 
				if(flag == false) {
					System.out.println("请先创建list！");
					break;
				}
				printList(); 
				break;
			}
			default: System.out.println("错误:请重新输入！");
			}
			
			choose = menu();
		}
		System.out.println("欢迎下次使用！");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("*********WTU课程管理系统*********");
		System.out.println("1. Create Attendance List");
		System.out.println("2. Print Attendance List");
		System.out.println();
		System.out.println("3. Exit");
		System.out.println("******************************");
		System.out.print("请输入您的选择:");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void createList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学年:");
		int year = scan.nextInt();
		System.out.println("请输入学期(1or2):");
		int semester = scan.nextInt();
		
		System.out.println("请输入课程代码:");
		String subjectID = scan.next();
		System.out.println("请输入课程名称:");
		String subjectName = scan.next();
		Subject sub = new Subject(subjectID, subjectName);
		
		System.out.println("请输入学生1学号:");
		String stu1_studentID = scan.next();
		System.out.println("请输入学生1姓名:");
		String stu1_studentName = scan.next();
		System.out.println("请输入学生2学号:");
		String stu2_studentID = scan.next();
		System.out.println("请输入学生2姓名:");
		String stu2_studentName = scan.next();
		Student stu1 = new Student(stu1_studentID, stu1_studentName);
		Student stu2 = new Student(stu2_studentID, stu2_studentName);
		
		list = new ClassList(semester, year, sub, stu1, stu2);
		
		flag = true;
		
	}

	public static void printList() {
		System.out.println(list.toString());
		
	}

}
