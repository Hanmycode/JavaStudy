package week3;

import java.util.Scanner;

public class Score {
	public static double score[]; // 定义时，初始值为NULL

	public static void main(String[] args) {
		int choose = menu();
		double average;
		double highest, lowest;
		while (choose != 6) {
			switch (choose) {
			case 1:
				input();
				break;
			case 2:
				if (score == null) {
					System.out.println("请先输入成绩，再进行该操作！");
					System.out.println();
					break;
				}
				average = getAverage();
				System.out.println("平均分=" + average);
				System.out.println();
				break;
			case 3:
				if (score == null) {
					System.out.println("请先输入成绩，再进行该操作！");
					System.out.println();
					break;
				}
				highest = highest();
				System.out.println("最高分=" + highest);
				System.out.println();
				break;
			case 4:
				if (score == null) {
					System.out.println("请先输入成绩，再进行该操作！");
					System.out.println();
					break;
				}
				lowest = lowest();
				System.out.println("最低分=" + lowest);
				System.out.println();
				break;
			case 5:
				if (score == null) {
					System.out.println("请先输入成绩，再进行该操作！");
					System.out.println();
					break;
				}
				sort();
				System.out.println();
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
		System.out.println("5.Sort");
		System.out.println("6.Exit");
		System.out.print("Please choose(1~6): ");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		System.out.println();
		return choice;
	}

	/* 输入学生的成绩 */
	public static void input() {
		score = new double[5]; // 使用new为数组分配大小，指定存储空间
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("请输入第" + (i + 1) + "个学生的成绩:");
			score[i] = scan.nextDouble();
			if (score[i] < 0 || score[i] > 100) {
				System.out.print("成绩必须大于0、小于100，请重新输入第" + (i + 1) + "个学生的成绩:");
				score[i] = scan.nextDouble();
			}
		}
		System.out.println();
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

	/* 排序输出成绩 */
	public static void sort() {
		for (int i = 1; i < score.length; i++) {
			for (int j = 0; j < score.length - i; j++) {
				if (score[j] < score[j + 1]) {
					double temp = 0;
					temp = score[j];
					score[j] = score[j + 1];
					score[j + 1] = temp;
				}
			}
		}
		System.out.println("成绩由高到低排序如下:");
		for (int k = 0; k < score.length; k++) {
			System.out.println(score[k]);
		}
	}
}