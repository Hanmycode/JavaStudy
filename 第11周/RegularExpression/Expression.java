package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expression {

	public static void main(String[] args) {
		String express = "add(min(12,3),max(2,sub(2,1)))";
		String regex = "((add)|(sub)|(max)|(min)|(doubleMe))\\(\\d{1,}(,\\d{1,})?\\)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(express);
		String result = express;
		
		System.out.println(express);
		while(m.find()) {
			String basicExpress = m.group();
			String ss = calculate(basicExpress);
//			System.out.println(basicExpress+"="+ss);
			basicExpress = basicExpress.replaceAll("\\(", "\\\\(");
			basicExpress = basicExpress.replaceAll("\\)", "\\\\)");
//			System.out.println("表达式为:"+result);
			result = result.replaceAll(basicExpress, ss);
//			System.out.println("替换后:"+result);
			m = p.matcher(result);
		}
		
		System.out.println("运算结果:"+express+"="+result);
	}



public static String calculate(String express) {
	int result = 0;
	
	int pos1 = express.indexOf("(");
	
	String operateCode = express.substring(0, pos1);
	
	int pos2, pos3;
	int number1, number2 = 0;
	pos3 = express.indexOf(")");
	
	if(operateCode.equals("doubleMe")) {
		String operateNumber = express.substring(pos1+1, pos3);
		number1 = Integer.parseInt(operateNumber);
	}
	
	else {
		pos2 = express.indexOf(",");
		String operateNumber1 = express.substring(pos1+1, pos2);
		String operateNumber2 = express.substring(pos2+1, pos3);
		number1 = Integer.parseInt(operateNumber1);
		number2 = Integer.parseInt(operateNumber2);
	}
	
	switch(operateCode) {
	case "add": result = number1+number2; break;
	case "sub": result = number1-number2; break;
	case "mul": result = number1*number2; break;
	case "div": result = number1/number2; break;
	case "max": result = number1>number2?number1:number2; break;
	case "min": result = number1<number2?number1:number2;break;
	case "doubleMe": result = number1*2; break;
	default: System.out.println("error!");
	}
	String Res = ""+result;
	
	return Res;
}

}