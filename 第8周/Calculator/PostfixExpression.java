package Calculator;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入表达式:");
		String expression = scan.next();
		String postfix = postfixExpression(expression);
		System.out.println("后缀表达式为:" + postfix.replaceAll(" +",""));
		double result = calculator(postfix);
		System.out.println("结果为:" + result);
		// 表达式:3+2*5+(6*7+1)*9 , 后缀:325*+67*1+9*+
		// 4+5+8*(6+8*7)/3+4
	}

	// 中缀表达式转换为后缀表达式
	public static String postfixExpression(String s) {
		Stack<String> stack = new Stack<String>();
		s = insetBlanks(s);
		String[] ss = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].matches("\\d"))
				sb.append(ss[i] + " ");
			if (ss[i].matches("[+|-|*|/|(|)]")) {
				if (stack.isEmpty()) {
					stack.push(ss[i]);
				} else {
					if (ss[i].matches("[+|-]")) {
						while (!stack.isEmpty() && !stack.peek().matches("[(]"))
							sb.append(stack.pop()).append(" ");
						if (stack.isEmpty() || stack.peek().matches("[(]"))
							stack.push(ss[i]);
					}
					if (ss[i].matches("[*|/]")) {
						while (stack.peek().matches("[*|/]") && !stack.peek().matches("[(]"))
							sb.append(stack.pop()).append(" ");
						if (stack.isEmpty() || stack.peek().matches("[(]") || stack.peek().matches("[+|-]"))
							stack.push(ss[i]);
					}
					if (ss[i].matches("[(]")) {
						stack.push(ss[i]);
					}
					if (ss[i].matches("[)]")) {
						while (!stack.peek().matches("[(]"))
							sb.append(stack.pop()).append(" ");
						if (stack.peek().matches("[(]"))
							stack.pop();
					}
				}
			}
		}
		while (!stack.isEmpty())
			sb.append(stack.pop()).append(" ");
		return sb.toString();
	}


	public static String insetBlanks(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-'
					|| s.charAt(i) == '*' || s.charAt(i) == '/')
				result += " " + s.charAt(i) + " ";
			else
				result += s.charAt(i);
		}
		return result;
	}

	public static double calculator(String postfix) {
		Stack<Double> stack = new Stack<>();
		String[] str = postfix.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (str[i].matches("\\d"))
				stack.push(Double.valueOf(str[i]));
			if (str[i].matches("[+|-|*|/]")) {
				double b = stack.pop();
				double a = stack.pop();
				if (str[i].equals("+"))
					stack.push(a + b);
				if (str[i].equals("-"))
					stack.push(a - b);
				if (str[i].equals("*"))
					stack.push(a * b);
				if (str[i].equals("/"))
					stack.push(a / b);
			}
		}
		double result = stack.pop();
		return result;
	}

}
