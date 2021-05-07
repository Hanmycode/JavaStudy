package Cash.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Cash.vo.Product;
import Cash.vo.Result;

public class CashierSystemDao {
	// 1.输入，并将数据以某种数据类型进行存放
	public ArrayList<Product> inputFromKeyBoard() {
		ArrayList<Product> list = new ArrayList<Product>();
		Scanner scan = new Scanner(System.in);
		String nextLine = scan.nextLine();
		int seq = 0; //初始序号
		while(!nextLine.equals("0000")) {
			String ss[] = nextLine.split(",|，");
			String name = ss[0];
			float price = Float.parseFloat(ss[1]);
			int count = Integer.parseInt(ss[2]);
			float totalPrice = price*count;
			String sno = generateSno(String.valueOf(seq));
			
			Product product = new Product(sno,name,price,count,totalPrice);
			list.add(product); //把对象添加到集合中
			//输入下一行
			nextLine = scan.nextLine();
	   }
		return list;
	}
	//2.处理，将处理的结果进行保存
	public Result process(ArrayList<Product> list) {
		int saleTotalNum = list.size(); //销售笔数
		int saleTotalCount = 0; //销售数量
		float saleTotalMoney = 0; //销售金额
		for(int i=0;i<list.size();i++) {
			Product product = list.get(i);
			
			saleTotalCount += product.getCount();
			saleTotalMoney += product.getTotalPrice();
		}
		Result result = new Result(saleTotalNum, saleTotalCount, saleTotalMoney);
		return result;
	}
	//3.输出 显示
	public void outputHeader() {
		System.out.println("***********************欢迎使用收银系统***********************");
		System.out.println("请输入销售信息:");
		System.out.println("依次为入商品名称,商品单价,销售数量  用“,”分隔开");
		System.out.println("**********************************************************");
	}
	
	public void outputForm(ArrayList<Product> list, Result result) {
		System.out.println("==========================================================");
		System.out.println("流水号"+"\t\t"+"商品名称"+"\t"+"商品数量"+"\t"+"单价"+"\t"+"总价");
		System.out.println("==========================================================");
		for(Product product : list) {
			System.out.println(product.toString());
		}
		System.out.println("==========================================================");
		System.out.println(result.toString());
		System.out.println("==========================================================");
	}
	

	
	public String generateSno(String beforeNo) {
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
