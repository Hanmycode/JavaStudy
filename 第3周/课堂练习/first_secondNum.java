package week3;

import java.util.Scanner;

public class first_secondNum {
	public static int firstNum,secondNum;
	public static void main(String[] args) {
		int choose = menu();
		while(choose!=6){
			switch(choose){
			case 1:input2Num(); break;
			case 2:oddNumber(); break;
			case 3:sumOfEvenNum(); break;
			case 4:numAndSquare1and10(); break;
			case 5:sumOfSquareOfOddNum(); break;
			default:System.out.println("输入无效，请重新选择!");
			}
			choose = menu();
		}
		System.out.println("程序已退出，欢迎再次使用！");
	}

	/*
	 * 完成菜单的显示，返回用户输入的选择(1~5)
	 */
	public static int menu() {
		int choice = 0;
		System.out.println("========first_secondNum========");
		System.out.println("1.Input two integers(firstNum<secondNum)");
		System.out.println("2.Output all the odd numbers between firstNum and secondNum");
		System.out.println("3.Output the sum of all the even numbers between firstNum and secondNum");
		System.out.println("4.Output all the numbers and their squares between 1 and 10");
		System.out.println("5.Output the sum of the squares of all the odd numbers between firstNum and secondNum");
		System.out.println("6.Exit");
		System.out.println("Please choose(1~6)");
		
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}



	public static void input2Num() {
		System.out.print("Enter the firstNum(firstNum<secondNum)");
		Scanner scan = new Scanner(System.in);
		firstNum = scan.nextInt();
		System.out.print("Enter the secondNum(firstNum<secondNum)");
		secondNum = scan.nextInt();
	}

	public static void oddNumber() {
		System.out.print("All the odd numbers between firstNum and secondNum:");
		for(int i=firstNum+1;i<secondNum;i++){
			if(i%2==1)
				System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void sumOfEvenNum() {
		int sum = 0;
		System.out.print("The sum of all the even numbers between firstNum and secondNum:");
		for(int i=firstNum+1;i<secondNum;i++){
			if(i%2==0)
				sum += i; 
		}
		System.out.println(sum);
	}

    public static void numAndSquare1and10(){
    	for(int i=1;i<=10;i++){
    		System.out.println(i+"^2="+Math.pow(i, 2));
    	}
    }
    
    public static void sumOfSquareOfOddNum(){
    	System.out.println("");
    }
    

}