package Cash.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Cash.vo.Product;
import Cash.vo.Result;

public class CashierSystemDao {
	// 1.���룬����������ĳ���������ͽ��д��
	public ArrayList<Product> inputFromKeyBoard() {
		ArrayList<Product> list = new ArrayList<Product>();
		Scanner scan = new Scanner(System.in);
		String nextLine = scan.nextLine();
		int seq = 0; //��ʼ���
		while(!nextLine.equals("0000")) {
			String ss[] = nextLine.split(",|��");
			String name = ss[0];
			float price = Float.parseFloat(ss[1]);
			int count = Integer.parseInt(ss[2]);
			float totalPrice = price*count;
			String sno = generateSno(String.valueOf(seq));
			
			Product product = new Product(sno,name,price,count,totalPrice);
			list.add(product); //�Ѷ�����ӵ�������
			//������һ��
			nextLine = scan.nextLine();
	   }
		return list;
	}
	//2.����������Ľ�����б���
	public Result process(ArrayList<Product> list) {
		int saleTotalNum = list.size(); //���۱���
		int saleTotalCount = 0; //��������
		float saleTotalMoney = 0; //���۽��
		for(int i=0;i<list.size();i++) {
			Product product = list.get(i);
			
			saleTotalCount += product.getCount();
			saleTotalMoney += product.getTotalPrice();
		}
		Result result = new Result(saleTotalNum, saleTotalCount, saleTotalMoney);
		return result;
	}
	//3.��� ��ʾ
	public void outputHeader() {
		System.out.println("***********************��ӭʹ������ϵͳ***********************");
		System.out.println("������������Ϣ:");
		System.out.println("����Ϊ����Ʒ����,��Ʒ����,��������  �á�,���ָ���");
		System.out.println("**********************************************************");
	}
	
	public void outputForm(ArrayList<Product> list, Result result) {
		System.out.println("==========================================================");
		System.out.println("��ˮ��"+"\t\t"+"��Ʒ����"+"\t"+"��Ʒ����"+"\t"+"����"+"\t"+"�ܼ�");
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
		//1.��ȡ��ˮ�ŵ�ǰ׺ yyyyMMdd
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd"); //��ʽ��ģ��
		String dateNum = df.format(new Date());
		//2.�õ�˳��� beforeNo+1
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
