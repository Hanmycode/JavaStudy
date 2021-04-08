package BANK;

import java.util.Scanner;

public class BankDriver {

	private static Customer cus = null;
	private static boolean flag_ca = false;
	private static boolean flag_sa = false;

	public static void main(String[] args) {
		int choose = menu();

		while (choose != 8) {
			switch (choose) {
			case 1:
				creat();
				break;
			case 2:
				save();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				comsume();
				break;
			case 5:
				repay();
				break;
			case 6:
				settle();
				break;
			case 7:
				balance();
				break;
			default:
				System.out.println("����������!");
			}
			choose = menu();
		}
		System.out.println("��ӭ�´�ʹ��!");

	}

	public static int menu() {
		int choose = 0;

		System.out.println("*********Bank of WTU*********");
		System.out.println("1. ���� creat");
		System.out.println("2. ��� save");
		System.out.println("3. ȡ�� withdraw");
		System.out.println("4. ���� comsume");
		System.out.println("5. ���� repay");
		System.out.println("6. ���н��� settle");
		System.out.println("7. ��ѯ���  balance");
		System.out.println("8. �˳� exit");
		System.out.println("******************************");
		System.out.print("����������ѡ��(1~8):");

		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;

	}

	public static int subMenu() {
		int choose = 0;

		System.out.println("******��ѡ�񿪿�����******");
		System.out.println("1. ���ÿ� checkingAccount");
		System.out.println("2. �洢�� saveAccount");
		System.out.println("3. ���� exit");
		System.out.print("����������ѡ��(1~3):");

		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;
	}

	public static void creat() {
		int choose = subMenu();

		while (choose != 3) {
			switch (choose) {
			case 1:
				createChecking();
				break;
			case 2:
				createSaving();
				break;
			default:
				System.out.println("����������!");
			}
			choose = subMenu();
		}
	}

	public static void createChecking() {
		if (flag_ca) {
			System.out.println("����:����ӵ��1�����ÿ�,�����ظ�����!");
		} else {
			System.out.println("�����ڰ������ÿ�����ҵ��...");
			Scanner scan = new Scanner(System.in);
			System.out.println("���������֤��:");
			String ssn = scan.next();
			System.out.println("����������:");
			String name = scan.next();
			System.out.println("�����뿨��:");
			String caNum = scan.next();
			System.out.println("����������:");
			double serviceCharge = scan.nextDouble();
			double balance = 0;

			CheckingAccount ca = new CheckingAccount(caNum, balance, serviceCharge);
			if (cus == null) {
				cus = new Customer(ssn, name, ca, null);
				flag_ca = true;
			}
			if (cus != null) {
				cus = new Customer(ssn, name, ca, cus.getSa());
				flag_ca = true;
			}

			System.out.println("�����ɹ�!");
			System.out.println(cus.getCa().toString());
		}
	}

	public static void createSaving() {
		if (flag_sa) {
			System.out.println("����:����ӵ��1�Ŵ洢��,�����ظ�����!");
		} else {
			System.out.println("�����ڰ���洢������ҵ��...");
			Scanner scan = new Scanner(System.in);
			System.out.println("���������֤��:");
			String ssn = scan.next();
			System.out.println("����������:");
			String name = scan.next();
			System.out.println("�����뿨��:");
			String saNum = scan.next();
			System.out.println("����������:");
			double interestRate = scan.nextDouble();
			double balance = 0;

			SavingAccount sa = new SavingAccount(saNum, balance, interestRate);
			if (cus == null) {
				cus = new Customer(ssn, name, null, sa);
				flag_sa = true;
			}
			if (cus != null) {
				cus = new Customer(ssn, name, cus.getCa(), sa);
				flag_sa = true;
			}

			System.out.println("�����ɹ�!");
			System.out.println(cus.getSa().toString());
		}
	}

	public static void save() {
		if (!flag_sa) {
			System.out.println("����:��δ����洢��,����ʹ�ô洢��,���Ȱ�����ҵ��!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("����������:");
			double save = scan.nextDouble();
			cus.getSa().setBalance(cus.getSa().getBalance() + save);
			System.out.println("���ɹ�,���Ϊ:" + cus.getSa().getBalance());
		}
	}

	public static void withdraw() {
		if (!flag_sa) {
			System.out.println("����:��δ����洢��,����ʹ�ô洢��,���Ȱ�����ҵ��!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("������ȡ����:");
			double withdraw = scan.nextDouble();
			if (cus.getSa().getBalance() < withdraw) {
				System.out.println("��������!");
			} else {
				cus.getSa().setBalance(cus.getSa().getBalance() - withdraw);
				System.out.println("ȡ��ɹ�,���Ϊ:" + cus.getSa().getBalance());
			}
		}
	}

	public static void comsume() {
		if (!flag_ca) {
			System.out.println("����:��δ�������ÿ�,����ʹ�����ÿ�,���Ȱ�����ҵ��!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("����������ˢ�����:");
			double comsume = scan.nextDouble();
			cus.getCa().setBalance(cus.getCa().getBalance() - comsume);
			System.out.println("���ѳɹ�,���Ϊ:" + cus.getCa().getBalance());
		}
	}

	public static void repay() {
		if (!flag_ca) {
			System.out.println("����:��δ�������ÿ�,����ʹ�����ÿ�,���Ȱ�����ҵ��!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("�����뻹����:");
			double repay = scan.nextDouble();
			cus.getCa().setBalance(cus.getCa().getBalance() + repay);
			System.out.println("����ɹ�,���Ϊ:" + cus.getCa().getBalance());
		}
	}

	public static void settle() {
		if (!flag_ca && !flag_sa) {
			System.out.println("����:��δ�������п�,����ʹ�����п�,���Ȱ�����ҵ��!");
		} else {
			if (cus.getCa() != null && cus.getSa() == null) {
				cus.getCa().assessServiceCharge();
				System.out.println("���ÿ�������ѽ���,���Ϊ:" + cus.getCa().getBalance());
			} else if (cus.getCa() == null && cus.getSa() != null) {
				cus.getSa().payInterest();
				System.out.println("��������ѽ���,���Ϊ:" + cus.getSa().getBalance());
			} else {
				cus.getCa().assessServiceCharge();
				cus.getSa().payInterest();
				System.out.println("���ÿ�������ѽ���,���Ϊ:" + cus.getCa().getBalance());
				System.out.println("��������ѽ���,���Ϊ:" + cus.getSa().getBalance());
			}
		}

	}

	public static void balance() {
		if (!flag_ca && !flag_sa) {
			System.out.println("����:��δ�������п�,����ʹ�����п�,���Ȱ�����ҵ��!");
		} else {
			if (cus.getCa() != null && cus.getSa() == null) {
				System.out.println("���ÿ����:" + cus.getCa().getBalance());
			} else if (cus.getCa() == null && cus.getSa() != null) {
				System.out.println("������:" + cus.getSa().getBalance());
			} else {
				System.out.println("���ÿ����:" + cus.getCa().getBalance());
				System.out.println("������:" + cus.getSa().getBalance());
			}
		}
	}

}
