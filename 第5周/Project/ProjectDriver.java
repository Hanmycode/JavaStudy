package week5;

import java.util.Scanner;

public class ProjectDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//键盘输入相关信息
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入项目名称:");
		String projecetName = scan.next();
		
		System.out.println("请输入项目预算:");
		double budget  = scan.nextDouble();
		
		System.out.println("请输入项目员工1姓名:");
		String emp1Name = scan.next();
		System.out.println("请输入项目员工1部门:");
		String emp1Department = scan.next();
		System.out.println("请输入项目员工1底薪:");
		double emp1Salary = scan.nextDouble();
		
		System.out.println("请输入项目员工2姓名:");
		String emp2Name = scan.next();
		System.out.println("请输入项目员工2部门:");
		String emp2Department = scan.next();
		System.out.println("请输入项目员工2底薪:");
		double emp2Salary = scan.nextDouble();
		
		
		Employee emp1 = new Employee(emp1Department, emp1Name, emp1Salary);
		Employee emp2 = new Employee(emp2Department, emp2Name, emp2Salary);
		
		Project pro = new Project(projecetName, budget, emp1, emp2);
		//pro.uddateBudget();
		
		System.out.println("新预算=" + pro.getBudget());
		System.out.println("项目信息\n" + pro.toString());
		
		
	}

}
