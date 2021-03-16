package week3;

import java.util.Scanner;

public class Score {
	public static double score[]; // 定义时，初始值为NULL

	public static void main(String[] args) {
		int choose = menu();
		double average;
		double highest, lowest;
		while (choose != 5) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if(score==null){
					System.out.println("请先输入成绩，再进行其他操作！");
				}
				average = getAverage();
				System.out.println("平均分=" + average);
				break;
			case 3:
				if(score==null){
					System.out.println("请先输入成绩，再进行其他操作！");
				}
				highest = highest();
				System.out.println("最高分=" + highest);
				break;
			case 4:
				if(score==null){
					System.out.println("请先输入成绩，再进行其他操作！");
				}
				lowest = lowest();
				System.out.println("最低分=" + lowest);
				break;
			default:
				System.out.println("输入无效，请重新选择!");
			}
			choose = menu();
		}
		System.out.println("程序已退出，欢迎再次使用！");
	}

	/*
	 * 完成菜单的显示，返回用户输入的选择(1~5)
	 */
	public static int menu() {
		int choice = 0;
		System.out.println("======Student Grade======");
		System.out.println("1.Input");
		System.out.println("2.Average");
		System.out.println("3.Highest");
		System.out.println("4.Lowest");
		System.out.println("5.Exit");
		//增加成绩排序输出的功能
		System.out.println("Please choose(1~5)");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	/* 输入学生的成绩 */
	public static void input() {
		score = new double[5]; // 使用new为数组分配大小，指定存储空间
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生的成绩:");
			score[i] = scan.nextDouble();
			if(score[i]<0||score[i]>100){
				System.out.print("成绩必须大于0、小于100，请重新输入第"+ (i + 1) + "个学生的成绩:");
				score[i] = scan.nextDouble();
			}
		}
	}

	/* 输出平均分 */
	public static double getAverage() {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		average = sum / score.length;
		return average;
	}

	/* 输出最高分 */
	public static double highest() {
		double highest = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] > highest)
				highest = score[i];
		}
		return highest;
	}

	/* 输出最低分 */
	public static double lowest() {
		double lowest = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] < lowest)
				lowest = score[i];
		}
		return lowest;
	}

}

