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
					System.out.println("���ȴ���list��");
					break;
				}
				printList(); 
				break;
			}
			default: System.out.println("����:���������룡");
			}
			
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ�ã�");
	}

	public static int menu() {
		int choose = 0;
		System.out.println("*********WTU�γ̹���ϵͳ*********");
		System.out.println("1. Create Attendance List");
		System.out.println("2. Print Attendance List");
		System.out.println();
		System.out.println("3. Exit");
		System.out.println("******************************");
		System.out.print("����������ѡ��:");
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void createList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ��:");
		int year = scan.nextInt();
		System.out.println("������ѧ��(1or2):");
		int semester = scan.nextInt();
		
		System.out.println("������γ̴���:");
		String subjectID = scan.next();
		System.out.println("������γ�����:");
		String subjectName = scan.next();
		Subject sub = new Subject(subjectID, subjectName);
		
		System.out.println("������ѧ��1ѧ��:");
		String stu1_studentID = scan.next();
		System.out.println("������ѧ��1����:");
		String stu1_studentName = scan.next();
		System.out.println("������ѧ��2ѧ��:");
		String stu2_studentID = scan.next();
		System.out.println("������ѧ��2����:");
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
