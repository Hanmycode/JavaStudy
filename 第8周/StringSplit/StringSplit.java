package StringSplit;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("请一次性输入学生的基本信息,格式如下:");
//		System.out.println("学号,姓名,性别,出生日期");
//		Scanner scan = new Scanner(System.in);
//		
//		String data = scan.next();
//		String array[] = data.split(",|，");
//		String id = array[0];
//		String name = array[1];
//		String sex = array[2];
//		String birth = array[3];
//		
//		Student stu = new Student(id, name, sex, birth);
//		
//		System.out.println(stu.toString());
		
		
//		//1.输入运算表达式
//		Scanner scan = new Scanner(System.in);
//		String express = scan.nextLine();
//		
//		//2.分离出操作数  
//		
//		//后缀式
//		String array[] = express.split("[+\\-*/]"); 
//		//String array[] = express.split("\\+|\\-|\\*|/");
//		
//		//3.将字符串转换为数字
//		float data1 = Float.parseFloat(array[0].trim());
//		float data2 = Float.parseFloat(array[1].trim());
//		
//		char operateCode = express.charAt(array[0].length());
//		
//		double result = 0;
//		switch(operateCode) {
//		case '+': result = data1+data2; break;
//		case '-': result = data1-data2; break;
//		case '*': result = data1*data2; break;
//		case '/': result = data1/data2; break;
//		default: System.out.println("不支持该运算!");
//		}
//		
//		String info = express + "=" + result;
//		System.out.println(info);		
//		
		
				

		

		
		
		
		
		Scanner scan = new Scanner(System.in);
		String express = scan.next();
		
		int pos1 = express.indexOf("(");
		
		String operateCode = express.substring(0, pos1);
		
		int pos2, pos3;
		double number1, number2 = 0;
		pos3 = express.indexOf(")");
		
		if(operateCode.equals("doubleMe")) {
			String operateNumber = express.substring(pos1+1, pos3);
			number1 = Double.parseDouble(operateNumber);
		}
		
		else {
			pos2 = express.indexOf(",");
			String operateNumber1 = express.substring(pos1+1, pos2);
			String operateNumber2 = express.substring(pos2+1, pos3);
			number1 = Double.parseDouble(operateNumber1);
			number2 = Double.parseDouble(operateNumber2);
		}
		
		double result = 0;
		switch(operateCode) {
		case "add": result = number1+number2; break;
		case "sub": result = number1-number2; break;
		case "max": result = number1>number2?number1:number2; break;
		case "min": result = number1<number2?number1:number2;break;
		case "doubleMe": result = number1*2; break;
		default: System.out.println("不支持该运算!");
		}
		
		String info = express + "=" + result;
		System.out.println(info);
		
		
		
		
		
	}
	
	

	
	
}
