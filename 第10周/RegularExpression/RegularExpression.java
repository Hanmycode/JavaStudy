package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
	String rexTel = "((0\\d{2,3}-?)?[1-9]\\d{6,7})";
	//String rexPhone = "1[3578]\\d{9}";
	//String rexMail = "\\w+@\\w+(.\\w+)+";
	
//	Scanner scan = new Scanner(System.in);
//	String tel = scan.nextLine();
//	Pattern p = Pattern.compile(rexTel); //ģʽ��
//	Matcher m = p.matcher(tel); //ƥ����

//	if(m.matches()){
//		System.out.println("yes");
//	}
//	else
//		System.out.println("no");
//	}
	
	//����
//	if(Pattern.compile(rexTel).matcher(tel).matches()) {
//		System.out.println("yes");
//	}
//	else {
//		System.out.println("no");
//	}
	
	while(true) {
		Scanner scan = new Scanner(System.in);
		String tel = scan.nextLine();	
		if(Pattern.compile(rexTel).matcher(tel).matches()) {
			System.out.println("����ɹ�!");
			break;
		}
		System.out.println("�������,����������!");
	}
	
	}
}
