package week1;

import java.util.Scanner;

public class Biscuits {
	public static void main(String[] args) {
		/* 数据定义 */
		int biscuitsNumber; // 饼干的数量
		int boxNumber; // 盒子的数量
		int containerNumber;// 容器的数量
		int leftoverBiscuitsNumber;// 剩余饼干的数量
		int leftoverBoxNumber;// 剩余盒子的数量

		/* 数据输入 */
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入饼干的数量:");
		biscuitsNumber = scan.nextInt();

		/* 数据处理 */
		boxNumber = biscuitsNumber / 24;
		leftoverBiscuitsNumber = biscuitsNumber % 24;
		containerNumber = boxNumber / 75;
		leftoverBoxNumber = boxNumber % 75;

		/* 数据输出 */
		System.out.println("盒子的数量为:" + boxNumber);
		System.out.println("容器的数量为:" + containerNumber);
		System.out.println("剩余饼干的数量为:" + leftoverBiscuitsNumber);
		System.out.println("剩余盒子的数量为:" + leftoverBoxNumber);

	}
}
