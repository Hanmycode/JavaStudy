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
				System.out.println("������Ч��������ѡ��!");
			}
			choose = menu();
		}
		System.out.println("�������˳�����ӭ�ٴ�ʹ�ã�");
	}

	/*
	 * ��ɲ˵�����ʾ�������û������ѡ��(1~5)
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
		System.out.println("��ѡ���˿�����");
	}

	public static void dispose() {
		System.out.println("��ѡ����ȡ�");
	}

	public static void withdraw() {
		System.out.println("��ѡ���˴�");
	}

	public static void balance() {
		System.out.println("��ѡ���˲鿴��");
	}

}