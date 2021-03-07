package week1;

import java.util.Scanner;

public class Dollar {
	public static void main(String args[]) {
		/* 数据定义 */
		float amount; // 金额
		int numberOfDollars; // 美元的数量
		int numberOf_5Cent;// 5美分硬币的数量
		int numberOf_10Cent;// 10美分硬币的数量
		int numberOf_20Cent;// 20美分硬币的数量
		int numberOf_50Cent;// 50美分硬币的数量
		int numberOf_1Dollar;// 1美元硬币的数量
		int numberOf_2Dollar;// 2美元硬币的数量

		/* 数据输入 */
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入金额(单位为美元):");
		amount = scan.nextFloat();

		/* 数据处理 */
		numberOfDollars = (int) amount;
		numberOf_50Cent = (int) ((amount - (float) numberOfDollars) * 100 / 50);
		numberOf_20Cent = (int) ((amount - (float) numberOfDollars) * 100 - numberOf_50Cent * 50) / 20;
		numberOf_10Cent = (int) (((amount - (float) numberOfDollars) * 100 - numberOf_50Cent * 50
				- numberOf_20Cent * 20) / 10);
		numberOf_5Cent = ((int) ((amount - (float) numberOfDollars) * 100) - numberOf_50Cent * 50 - numberOf_20Cent * 20
				- numberOf_10Cent * 10) / 5;
		numberOf_2Dollar = (int) (amount / 2);
		numberOf_1Dollar = (int) amount - numberOf_2Dollar * 2;

		/* 数据输出 */
		System.out.println("$" + amount + " would be " + "$" + numberOfDollars + "," + numberOf_50Cent + "x50c,"
				+ numberOf_20Cent + "x20c," + numberOf_10Cent + "x10c,and " + numberOf_5Cent + "x5c.");
		System.out.println("2美元硬币的数量:" + numberOf_2Dollar);
		System.out.println("1美元硬币的数量:" + numberOf_1Dollar);
	}

}
