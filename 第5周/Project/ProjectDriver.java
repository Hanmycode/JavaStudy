package week5;

import java.util.Scanner;

public class ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������������Ϣ
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ŀ����:");
		String projecetName = scan.next();
		
		System.out.println("��������ĿԤ��:");
		double budget  = scan.nextDouble();
		
		System.out.println("��������ĿԱ��1����:");
		String emp1Name = scan.next();
		System.out.println("��������ĿԱ��1����:");
		String emp1Department = scan.next();
		System.out.println("��������ĿԱ��1��н:");
		double emp1Salary = scan.nextDouble();
		
		System.out.println("��������ĿԱ��2����:");
		String emp2Name = scan.next();
		System.out.println("��������ĿԱ��2����:");
		String emp2Department = scan.next();
		System.out.println("��������ĿԱ��2��н:");
		double emp2Salary = scan.nextDouble();
		
		
		Employee emp1 = new Employee(emp1Department, emp1Name, emp1Salary);
		Employee emp2 = new Employee(emp2Department, emp2Name, emp2Salary);
		
		Project pro = new Project(projecetName, budget, emp1, emp2);
		//pro.uddateBudget();
		
		System.out.println("��Ԥ��=" + pro.getBudget());
		System.out.println("��Ŀ��Ϣ\n" + pro.toString());
		
		
	}

}
