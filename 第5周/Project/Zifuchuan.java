package week5;

import java.util.Scanner;

public class Zifuchuan {

	public static void main(String[] args) {
		String date,year, month, day;
		int pos1, pos2;
		System.out.print("请输入年月日:");
		Scanner scan = new Scanner(System.in);
		date = scan.next();
		
		pos1 = date.indexOf("-");
		pos2 = date.lastIndexOf("-");
		
		year = date.substring(0, 4);
		System.out.println("年:" + year);
		month = date.substring(pos1+1, pos2);
		System.out.println("月:" + month);
		day = date.substring(pos2+1);
		System.out.println("日:" + day);
		
		
	}

}
