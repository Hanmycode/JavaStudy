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
				System.out.println("请重新输入!");
			}
			choose = menu();
		}
		System.out.println("欢迎下次使用!");

	}

	public static int menu() {
		int choose = 0;

		System.out.println("*********Bank of WTU*********");
		System.out.println("1. 开户 creat");
		System.out.println("2. 存款 save");
		System.out.println("3. 取款 withdraw");
		System.out.println("4. 消费 comsume");
		System.out.println("5. 还款 repay");
		System.out.println("6. 银行结算 settle");
		System.out.println("7. 查询余额  balance");
		System.out.println("8. 退出 exit");
		System.out.println("******************************");
		System.out.print("请输入您的选择(1~8):");

		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();
		return choose;

	}

	public static int subMenu() {
		int choose = 0;

		System.out.println("******请选择开卡类型******");
		System.out.println("1. 信用卡 checkingAccount");
		System.out.println("2. 存储卡 saveAccount");
		System.out.println("3. 返回 exit");
		System.out.print("请输入您的选择(1~3):");

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
				System.out.println("请重新输入!");
			}
			choose = subMenu();
		}
	}

	public static void createChecking() {
		if (flag_ca) {
			System.out.println("错误:您已拥有1张信用卡,请勿重复开户!");
		} else {
			System.out.println("您正在办理信用卡开户业务...");
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入身份证号:");
			String ssn = scan.next();
			System.out.println("请输入姓名:");
			String name = scan.next();
			System.out.println("请输入卡号:");
			String caNum = scan.next();
			System.out.println("请输入服务费:");
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

			System.out.println("开户成功!");
			System.out.println(cus.getCa().toString());
		}
	}

	public static void createSaving() {
		if (flag_sa) {
			System.out.println("错误:您已拥有1张存储卡,请勿重复开户!");
		} else {
			System.out.println("您正在办理存储卡开户业务...");
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入身份证号:");
			String ssn = scan.next();
			System.out.println("请输入姓名:");
			String name = scan.next();
			System.out.println("请输入卡号:");
			String saNum = scan.next();
			System.out.println("请输入利率:");
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

			System.out.println("开户成功!");
			System.out.println(cus.getSa().toString());
		}
	}

	public static void save() {
		if (!flag_sa) {
			System.out.println("错误:您未办理存储卡,若需使用存储卡,请先办理开户业务!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入存款金额:");
			double save = scan.nextDouble();
			cus.getSa().setBalance(cus.getSa().getBalance() + save);
			System.out.println("存款成功,余额为:" + cus.getSa().getBalance());
		}
	}

	public static void withdraw() {
		if (!flag_sa) {
			System.out.println("错误:您未办理存储卡,若需使用存储卡,请先办理开户业务!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入取款金额:");
			double withdraw = scan.nextDouble();
			if (cus.getSa().getBalance() < withdraw) {
				System.out.println("您的余额不足!");
			} else {
				cus.getSa().setBalance(cus.getSa().getBalance() - withdraw);
				System.out.println("取款成功,余额为:" + cus.getSa().getBalance());
			}
		}
	}

	public static void comsume() {
		if (!flag_ca) {
			System.out.println("错误:您未办理信用卡,若需使用信用卡,请先办理开户业务!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入消费刷卡金额:");
			double comsume = scan.nextDouble();
			cus.getCa().setBalance(cus.getCa().getBalance() - comsume);
			System.out.println("消费成功,余额为:" + cus.getCa().getBalance());
		}
	}

	public static void repay() {
		if (!flag_ca) {
			System.out.println("错误:您未办理信用卡,若需使用信用卡,请先办理开户业务!");
		} else {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入还款金额:");
			double repay = scan.nextDouble();
			cus.getCa().setBalance(cus.getCa().getBalance() + repay);
			System.out.println("还款成功,余额为:" + cus.getCa().getBalance());
		}
	}

	public static void settle() {
		if (!flag_ca && !flag_sa) {
			System.out.println("错误:您未办理银行卡,若需使用银行卡,请先办理开户业务!");
		} else {
			if (cus.getCa() != null && cus.getSa() == null) {
				cus.getCa().assessServiceCharge();
				System.out.println("信用卡服务费已结算,余额为:" + cus.getCa().getBalance());
			} else if (cus.getCa() == null && cus.getSa() != null) {
				cus.getSa().payInterest();
				System.out.println("储蓄卡利率已结算,余额为:" + cus.getSa().getBalance());
			} else {
				cus.getCa().assessServiceCharge();
				cus.getSa().payInterest();
				System.out.println("信用卡服务费已结算,余额为:" + cus.getCa().getBalance());
				System.out.println("储蓄卡利率已结算,余额为:" + cus.getSa().getBalance());
			}
		}

	}

	public static void balance() {
		if (!flag_ca && !flag_sa) {
			System.out.println("错误:您未办理银行卡,若需使用银行卡,请先办理开户业务!");
		} else {
			if (cus.getCa() != null && cus.getSa() == null) {
				System.out.println("信用卡余额:" + cus.getCa().getBalance());
			} else if (cus.getCa() == null && cus.getSa() != null) {
				System.out.println("储蓄卡余额:" + cus.getSa().getBalance());
			} else {
				System.out.println("信用卡余额:" + cus.getCa().getBalance());
				System.out.println("储蓄卡余额:" + cus.getSa().getBalance());
			}
		}
	}

}
