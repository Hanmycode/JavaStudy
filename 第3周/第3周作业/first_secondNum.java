package week3;

import java.util.Scanner;

public class first_secondNum {
	public static int firstNum, secondNum;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				input2Num();
				System.out.println();
				break;
			case 2:
				if (firstNum == 0 || secondNum == 0) {
					System.out.println("请先输入两个整数，再进行该操作！");
					System.out.println();
					break;
				}
				oddNumber();
				System.out.println();
				break;
			case 3:
				if (firstNum == 0 || secondNum == 0) {
					System.out.println("请先输入两个整数，再进行该操作！");
					System.out.println();
					break;
				}
				sumOfEvenNum();
				System.out.println();
				break;
			case 4:
				numAndSquare1and10();
				System.out.println();
				break;
			case 5:
				if (firstNum == 0 || secondNum == 0) {
					System.out.println("请先输入两个整数，再进行该操作！");
					System.out.println();
					break;
				}
				sumOfSquareOfOddNum();
				System.out.println();
				break;
			default:
				System.out.println("输入无效，请重新选择!");
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
		System.out.println("==========first_secondNum==========");
		System.out.println("1.Input two integers(firstNum<secondNum)");
		System.out.println("2.Output all the odd numbers between firstNum and secondNum");
		System.out.println("3.Output the sum of all the even numbers between firstNum and secondNum");
		System.out.println("4.Output all the numbers and their squares between 1 and 10");
		System.out.println("5.Output the sum of the squares of all the odd numbers between firstNum and secondNum");
		System.out.println("6.Exit");
		System.out.print("Please choose(1~6): ");

		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		System.out.println();
		return choice;
	}

	public static void input2Num() {
		System.out.print("Enter the firstNum(firstNum<secondNum):  ");
		Scanner scan = new Scanner(System.in);
		firstNum = scan.nextInt();
		System.out.print("Enter the secondNum(firstNum<secondNum):  ");
		secondNum = scan.nextInt();
	}

	public static void oddNumber() {
		System.out.print("All the odd numbers between " + firstNum + " and " + secondNum + ":  ");
		for (int i = firstNum + 1; i < secondNum; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void sumOfEvenNum() {
		int sum = 0;
		System.out.print("The sum of all the even numbers between " + firstNum + " and " + secondNum + ":  ");
		for (int i = firstNum + 1; i < secondNum; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);
	}

	public static void numAndSquare1and10() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "^2=" + Math.pow(i, 2));
		}
	}

	public static void sumOfSquareOfOddNum() {
		int sum = 0;
		int square = 0;
		for (int i = firstNum + 1; i < secondNum; i++) {
			if (i % 2 == 1) {
				square = (int) Math.pow(i, 2);
				sum += square;
			}
		}
		System.out.println("The sum of the squares of all the odd numbers between " + firstNum + " and " + secondNum
				+ ":  " + sum);
	}

}