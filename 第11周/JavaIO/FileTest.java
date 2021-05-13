package JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String fileName = "d:/express.txt";
			//1.修水箱
			File aFile = new File(fileName);
			//2.装水管
			FileReader fr = new FileReader(aFile);
			//3.装水龙头
			BufferedReader bf = new BufferedReader(fr);
			//4.打开水龙头
			String aLine = "";
			
			File oFl = new File("d:/result.txt");
			FileWriter fwt = new FileWriter(oFl);
			PrintWriter pwt = new PrintWriter(fwt);
			while((aLine=bf.readLine()) != null) {
					pwt.println(aLine + "=" + calculate(aLine));
				}
			//5.关闭
			pwt.close();
			bf.close();
			fr.close();
		}
		catch (Exception e)  { //捕获异常
			e.printStackTrace();
		}
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
