package practiceInClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Cash.vo.Product;

public class CashierSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("***********************欢迎使用收银系统***********************");
		System.out.println("请输入销售信息:");
		System.out.println("依次为入商品名称,商品单价,销售数量  用“,”分隔开");
		System.out.println("**********************************************************");
		
		String allInfo = "";
		String nextLine = scan.nextLine();
		int seq = 0; //初始序号
		int saleTotalNum = 0; //销售笔数
		int saleTotalCount = 0; //销售数量
		float saleTotalMoney = 0; //销售金额
		while(!nextLine.equals("0000")) {
			String ss[] = nextLine.split(",|，");
			String name = ss[0];
			float price = Float.parseFloat(ss[1]);
			int count = Integer.parseInt(ss[2]);
			float totalPrice = price*count;
			String sno = generateSno(String.valueOf(seq));
			
			Product product = new Product(sno,name,price,count,totalPrice);
			allInfo += product.toString() + "\n";
			nextLine = scan.nextLine();
			seq++;
			
			saleTotalNum++;
			saleTotalCount += count;
			saleTotalMoney += totalPrice;
			
		}
			
			
		System.out.println("==========================================================");
		System.out.println("流水号"+"\t\t"+"商品名称"+"\t"+"商品数量"+"\t"+"单价"+"\t"+"总价");
		System.out.println("==========================================================");
		System.out.print(allInfo);
		System.out.println("==========================================================");
		System.out.println("总计:" + "\t销售笔数 " + saleTotalNum + "\t销售数量 " + saleTotalCount + "\t销售金额 " + saleTotalMoney);
		System.out.println("==========================================================");
			
		
			
	}
	
	
	public static String generateSno(String beforeNo) {
		String sno = "";
		//1.获取流水号的前缀 yyyyMMdd
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd"); //格式化模板
		String dateNum = df.format(new Date());
		//2.得到顺序号 beforeNo+1
		String newNo = String.valueOf(Integer.parseInt(beforeNo)+1);
		
		String zero = "";
		int zeroCount = 4-newNo.length();
		for(int i=0;i<zeroCount;i++) {
			zero = "0"+zero;
		}
		
		sno = dateNum + zero + newNo;
		return sno;
	}

}

/*
啤酒，8，10
饮料，5，3
矿泉水，1，10
泡面，5，6
瓜子，5，3
八宝粥，4，3
*/