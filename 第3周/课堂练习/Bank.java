package week3;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				createAccount();
				break;
			case 2:
				dispose();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				balance();
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
		System.out.println("======WTU Bank======");
		System.out.println("1. Create Account");
		System.out.println("2. Dispose");
		System.out.println("3. Withdraw");
		System.out.println("4. Bbalance");
		System.out.println("5. Exit");
		System.out.print("Please choose(1~5): ");

		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void createAccount() {
		System.out.println("您选择了开户！");
	}

	public static void dispose() {
		System.out.println("您选择了取款！");
	}

	public static void withdraw() {
		System.out.println("您选择了存款！");
	}

	public static void balance() {
		System.out.println("您选择了查看余额！");
	}

}