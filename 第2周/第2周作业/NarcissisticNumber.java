package week2;

import java.util.Scanner;

//输出n位水仙花数
public class NarcissisticNumber {
	public static void main(String[] args) {
		int weishu;
		int n;
	    System.out.print("请输入位数:");
	    Scanner scan = new Scanner(System.in);
	    weishu = scan.nextInt();
	    for(int i=(int) Math.pow(10,weishu-1);i<Math.pow(10,weishu);i++) {//遍历每个数，比如3位数从100到999
	    	int number=i,sum=0;
	    	for(int j=1;j<=weishu;j++) { //提取每一位
	    		n = number%10;
	    		sum += (int) Math.pow(n, weishu);
	    		number = number/10;
	    	}
	    	if(sum==i)
	    		System.out.println(i);
	    }
	}
	
}
