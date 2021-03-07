package week1;

import java.util.Scanner;

public class Song {
	public static void main(String args[]) {
		/* 数据定义 */
		// final变量(常量)用final修饰的成员变量表示常量,只能被赋值一次,赋值后值无法改变!
		// java中默认声明的小数是double类型的,所以要在数字后面+f
		final float MANAGER_COMMISSION = 0.12f;
		final float SITE_COMMISSION = 0.03f;

		// 采用驼峰法命名
		String songTitle;
		float songPrice;
		int number;

		float totalRevenue;
		float managerCommission;
		float siteCommission;

		/* 数据输入 */
		Scanner scan = new Scanner(System.in);
		// 输入之前给出提示
		// next()查找并返回来自此扫描器的下一个完整标记,一定要读取到有效字符后才可以结束输入
		System.out.print("请输入歌曲名称:");
		songTitle = scan.nextLine();

		System.out.print("请输入歌曲单价:");
		songPrice = scan.nextFloat();

		System.out.print("请输入下载数量:");
		number = scan.nextInt();

		/* 数据处理 */
		totalRevenue = songPrice * number;
		managerCommission = totalRevenue * MANAGER_COMMISSION;
		siteCommission = totalRevenue * SITE_COMMISSION;

		/* 数据输出 */
		System.out.println("共销售" + number + "份《" + songTitle + "》,单价为" + songPrice + "元");
		System.out.println("总收入为:" + totalRevenue);
		System.out.println("经理的佣金为:" + managerCommission);
		System.out.println("网站的佣金为:" + siteCommission);

	}

}

/*
 * next()一定要读取到有效字符后才可以结束输入，对输入有效字符之前遇到的空格键、Tab键或Enter键等结束符，
 * next()方法会自动将其去掉，只有在输入有效字符之后，next()方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。
 * 简单地说，next()查找并返回来自此扫描器的下一个完整标记。完整标记的前后是与分隔模式匹配的输入信息，
 * 所以next方法不能得到带空格的字符串而nextLine()方法的结束符只是Enter键，
 * 即nextLine()方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
 */