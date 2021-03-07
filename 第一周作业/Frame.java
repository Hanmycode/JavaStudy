package week1;

import java.util.Scanner;

public class Frame {
	public static void main(String[] args) {
	/* 数据定义 */
	float length;
	float width;
	char typeOfFrame;
	String colorOfFrame;
	int numberOfCrown;
	
	float totalCost;
	float costOfFrame = 0; 
	float costOfColor;
	float costOfCardboard;
	float costOfGlass;
	float costOfCrown;
	
	/* 数据输入 */
	Scanner scan = new Scanner(System.in);
	System.out.print("请输入照片的长(单位为inch):");
	length = scan.nextFloat();
	System.out.print("请输入照片的宽(单位为inch):");
	width = scan.nextFloat();
	System.out.print("请输入相框的类型(r or f;r为普通相框,f为精美相框):");
	typeOfFrame = scan.next().charAt(0);//char的输入
	System.out.print("请输入相框的颜色(颜色的英文):");
	colorOfFrame = scan.next();
	System.out.print("请输入相框的皇冠个数(数字0或1或2或3或4):");
	numberOfCrown = scan.nextInt();
	
	/* 数据处理 */
	switch(typeOfFrame) {
	case'r':
		costOfFrame = ((length+width)*2+4)*0.15f;
		break;
	case'f':
		costOfFrame = ((length+width)*2+4)*0.25f;
		break;
	default:
		System.out.print("请输入正确的符号！");
	}
	
	switch(colorOfFrame) {
	case"white":
		costOfColor = 0;
		break;
	default:
		costOfColor = ((length+width)*2+4)*0.1f;
	}
	
	costOfCardboard = length*width*0.02f;
	costOfGlass = length*width*0.07f;
	costOfCrown = numberOfCrown*0.35f;
	
	totalCost = costOfFrame+costOfColor+costOfCardboard+costOfGlass+costOfCrown;
	

	/* 数据输出 */
	System.out.println();
	System.out.println("价格单");
	System.out.println(typeOfFrame+"型相框的花费为:"+costOfFrame);
	System.out.println("上"+colorOfFrame+"颜色的花费为:"+costOfColor);
	System.out.println("硬纸板的花费为:"+costOfCardboard);
	System.out.println("玻璃的花费为:"+costOfGlass);
	System.out.println("皇冠的花费为:"+costOfCrown);
	System.out.println();
	System.out.println("总花费为:"+totalCost);
}

}

