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
			default: System.out.println("����:���������룡");
			choose = menu();
			}
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ�ã�");
	}
	
	public static int menu() {
		int choose = 0;
		System.out.println("*********WTUѡ��ϵͳ*********");
		System.out.println("1. �����γ�");
		System.out.println("2. ѡ��");
		System.out.println("3. ��ѡ");
		System.out.println("4. ��ӡ����");
		System.out.println("5. �˳�");
		System.out.println("****************************");
		System.out.print("����������ѡ��(1~5):");
		
		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}
	
	public static boolean creatSubject() {
		if(flag) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�γ��Ѵ��ڣ��Ƿ����´���(y/n):");
			System.out.print("����������ѡ��:");
			String xuanze = scan.next();
			
			if(xuanze.equals("y")) {
				System.out.println("������γ̴���:");
				String subjectID = scan.next();
				System.out.println("������γ�����:");
				String subjectName = scan.next();
				System.out.println("�������������:");
				int maxNumber = scan.nextInt();
				
				Subject sub = new Subject(subjectID, subjectName, maxNumber);
				enrol = new Enrolment(sub, maxNumber);
				
				System.out.println("�����γ̳ɹ�! ��Ϣ����:");
				System.out.println(enrol.getSub().toString());
				return true;
			}
			else
				return true;
			
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������γ̴���:");
		String subjectID = scan.next();
		System.out.println("������γ�����:");
		String subjectName = scan.next();
		System.out.println("�������������:");
		int maxNumber = scan.nextInt();
		
		Subject sub = new Subject(subjectID, subjectName, maxNumber);
		enrol = new Enrolment(sub, maxNumber);
		
		System.out.println("�����γ̳ɹ�! ��Ϣ����:");
		System.out.println(enrol.getSub().toString());
		flag = true;
		return true;
		
	}
	
	public static boolean addStudent() {
		if(!flag) {
			System.out.println("����:���ȴ����γ�!");
			return false;
		}
		if(count>=enrol.getStuList().length) {
			System.out.println("����:�ÿγ�����,����ѡ�������γ�!");
			return false;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ����ѧ��:");
		String id = scan.next();
		System.out.println("������ѧ��������:");
		String name = scan.next();
		Student stu = new Student(id, name);
	
		enrol.getStuList()[count] = stu;
		count++;
		System.out.println("��ϲ��,ѡ�γɹ�!");
		printDetails();
		return true;
	}
	
	public static boolean deleteStudent() {
		if(!flag) {
			System.out.println("����:���ȴ����γ�!");
			return false;
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("������Ҫ��ѡѧ����ѧ��:");
		String id = scan.next();
		int index = -1;
		for(int i=0;i<enrol.getStuList().length&&enrol.getStuList()[i]!=null;i++) {
			if(enrol.getStuList()[i].getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index<0) {
			System.out.println("����:ѧ��Ϊ"+id+"��ѧ��δѡ��ÿγ�!");
			return false;
		}
		enrol.getStuList()[index] = null;
		for(int i=index;i<count-1;i++) {
			enrol.getStuList()[i] = enrol.getStuList()[i+1]; //ǰ�Ƹ���
		}
		count--;
		enrol.getStuList()[count] = null;
		System.out.println("��ѡ�ɹ�!");
		printDetails();
		return true;
	}
	
	public static void printDetails() {
		if(!flag) {
			System.out.println("����:���ȴ����γ�!");
		}
		else {
			System.out.println("ѡ�α�����:");
			System.out.println(enrol.toString());
			System.out.println("��ѡ����:" + count);
			System.out.println("======================================\n");
		}
	}
	
}
