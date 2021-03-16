package week3;

import java.util.Scanner;

public class Score {
	public static double score[]; // ����ʱ����ʼֵΪNULL

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
					System.out.println("��������ɼ����ٽ��иò�����");
					System.out.println();
					break;
				}
				average = getAverage();
				System.out.println("ƽ����=" + average);
				System.out.println();
				break;
			case 3:
				if (score == null) {
					System.out.println("��������ɼ����ٽ��иò�����");
					System.out.println();
					break;
				}
				highest = highest();
				System.out.println("��߷�=" + highest);
				System.out.println();
				break;
			case 4:
				if (score == null) {
					System.out.println("��������ɼ����ٽ��иò�����");
					System.out.println();
					break;
				}
				lowest = lowest();
				System.out.println("��ͷ�=" + lowest);
				System.out.println();
				break;
			case 5:
				if (score == null) {
					System.out.println("��������ɼ����ٽ��иò�����");
					System.out.println();
					break;
				}
				sort();
				System.out.println();
				break;
			default:
				System.out.println("������Ч��������ѡ��!");
			}
			choose = menu();
		}
		System.out.println("�������˳�����ӭ�ٴ�ʹ�ã�");
	}

	/*
	 * ��ɲ˵�����ʾ�������û������ѡ��(1~5)
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

	/* ����ѧ���ĳɼ� */
	public static void input() {
		score = new double[5]; // ʹ��newΪ��������С��ָ���洢�ռ�
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("�������" + (i + 1) + "��ѧ���ĳɼ�:");
			score[i] = scan.nextDouble();
			if (score[i] < 0 || score[i] > 100) {
				System.out.print("�ɼ��������0��С��100�������������" + (i + 1) + "��ѧ���ĳɼ�:");
				score[i] = scan.nextDouble();
			}
		}
		System.out.println();
	}

	/* ���ƽ���� */
	public static double getAverage() {
		double average = 0;
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		average = sum / score.length;
		return average;
	}

	/* �����߷� */
	public static double highest() {
		double highest = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] > highest)
				highest = score[i];
		}
		return highest;
	}

	/* �����ͷ� */
	public static double lowest() {
		double lowest = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] < lowest)
				lowest = score[i];
		}
		return lowest;
	}

	/* ��������ɼ� */
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
		System.out.println("�ɼ��ɸߵ�����������:");
		for (int k = 0; k < score.length; k++) {
			System.out.println(score[k]);
		}
	}
}