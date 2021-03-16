package week3;

import java.util.Scanner;

public class Score {
	public static double score[]; // ����ʱ����ʼֵΪNULL

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
					System.out.println("��������ɼ����ٽ�������������");
				}
				average = getAverage();
				System.out.println("ƽ����=" + average);
				break;
			case 3:
				if(score==null){
					System.out.println("��������ɼ����ٽ�������������");
				}
				highest = highest();
				System.out.println("��߷�=" + highest);
				break;
			case 4:
				if(score==null){
					System.out.println("��������ɼ����ٽ�������������");
				}
				lowest = lowest();
				System.out.println("��ͷ�=" + lowest);
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
		System.out.println("5.Exit");
		//���ӳɼ���������Ĺ���
		System.out.println("Please choose(1~5)");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	/* ����ѧ���ĳɼ� */
	public static void input() {
		score = new double[5]; // ʹ��newΪ��������С��ָ���洢�ռ�
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("�������" + (i + 1) + "��ѧ���ĳɼ�:");
			score[i] = scan.nextDouble();
			if(score[i]<0||score[i]>100){
				System.out.print("�ɼ��������0��С��100�������������"+ (i + 1) + "��ѧ���ĳɼ�:");
				score[i] = scan.nextDouble();
			}
		}
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

}

