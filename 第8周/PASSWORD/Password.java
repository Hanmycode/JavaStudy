package PASSWORD;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		System.out.println("请输入密码, 必须符合以下要求:");
		System.out.println("1. Must be between 8 and 15 characters in length");
		System.out.println("2. May not contain spaces");
		System.out.println("3. Must contain at least one nonnumeric uppercase character and one");
		System.out.println("4. Must contain at least one numeric digit");
		
		while(!flag) {
			Scanner scan  = new Scanner(System.in);
			String password = scan.nextLine();
			
			int len = password.length();
			if(len<8 && len>15) {
				System.out.println("密码无效,长度不符合要求!");
				System.out.println("请重新输入!");
			}
			
			boolean hasSpace = false;
			boolean hasUppercase = false;
			boolean hasLowercase = false;
			boolean hasDigit = false;
			
			for(int i=0; i<len; i++) {
				char c = password.charAt(i);
				if(c==' ') {
					hasSpace = true;
					break;
				}
				if(c>='A' && c<='Z')
					hasUppercase = true;
				if(c>='a' && c<='z')
					hasLowercase = true;
				if(c>='0' && c<='9')
					hasDigit = true;
			}
			
			String info = "";
			if(hasSpace==false && hasUppercase==true && hasLowercase==true && hasDigit==true) {
				flag = true;
				System.out.println("恭喜您,密码设置成功!");
				System.out.println("欢迎下次使用!");
				return;
			}
			else {
				info += "密码无效, 原因如下:";
				if(hasSpace) {
					info += "不能包含空格!\n";
				}
				else if(!hasUppercase) {
					info += "至少要包含一个大写字母!";
				}
				else if(!hasLowercase) {
					info += "至少要包含一个小写字母!";
				}
				else if(!hasDigit) {
					info += "至少要包含一个数字!";
				}
				System.out.println("请重新输入!");
			}
		}
		return;
	}
}
