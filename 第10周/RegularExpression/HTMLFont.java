package RegularExpression;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLFont {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> value = new ArrayList<String>();

		String data = "<font face='Arial Serif' size='10px' color='red' />";

		Pattern p_1 = Pattern.compile("<\s*font\s*([^>]*)\s*>");
		Matcher m_1 = p_1.matcher(data);

		if (m_1.find()) 
		{
			Pattern p_2 = Pattern.compile("([a-z]+)\s*=\s*('(.*?)')", Pattern.CASE_INSENSITIVE);
			Matcher m_2 = p_2.matcher(m_1.group(1));
			while (m_2.find()) 
			{
				name.add(m_2.group(1));
				value.add(m_2.group(3));
			}
		}
		for (int i = 0; i < name.size(); i++) 
		{
			System.out.println(name.get(i) + ":" + value.get(i));
		}

	}
}
