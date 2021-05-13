package RegularExpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLWeb {
	public static void main(String[] args) {
		String data = "";
		data += "<html><head><title>欢迎访问武汉纺织大学主页</title></head></html>";
		data += "<body><img src='1.jpg'/>";
		data += "<a href='1.htm'>首页</a>";
		data += "<a href='2.htm'>教务处</a>";
		data += "<a href='3.htm'>数计学院</a>";
		data += "<img src='2.jpg'/>";
		data += "<img src='3.jpg'/>";
		data += "</body></html>";

		Pattern title = Pattern.compile("(<title>)(.*?)(</title>)", Pattern.CASE_INSENSITIVE);
		Matcher Tit = title.matcher(data);

		Pattern picture = Pattern.compile("(<img)(.*?)(/>)", Pattern.CASE_INSENSITIVE);
		Matcher Pic = picture.matcher(data);

		Pattern hyper = Pattern.compile("(<a)(.*?)(/a>)", Pattern.CASE_INSENSITIVE);
		Matcher Hyp = hyper.matcher(data);

		String t = new String();
		ArrayList<String> p = new ArrayList<String>();
		ArrayList<String> h = new ArrayList<String>();
		ArrayList<String> address = new ArrayList<String>();
		int count_pic = 0;
		int count_hyp = 0;

		while (Hyp.find()) {
			count_hyp++;
			String H = Hyp.group(2);
			Pattern hyper2 = Pattern.compile("(href=)(\'|\")(.*?)(\'|\")", Pattern.CASE_INSENSITIVE);
			Matcher Hyper2 = hyper2.matcher(H);
			Pattern hyper3 = Pattern.compile("(\'>)(.*?)(<)", Pattern.CASE_INSENSITIVE);
			Matcher Hyper3 = hyper3.matcher(H);
			if (Hyper2.find()) {
				address.add(Hyper2.group(3));
			}
			if (Hyper3.find()) {
				h.add(Hyper3.group(2));
			}
		}
		
		if (Tit.find()) {
			t = Tit.group(2);
		}

		while (Pic.find()) {
			count_pic++;
			String pp = Pic.group(2);
			Pattern picture2 = Pattern.compile("(src=)(\'|\")(.*?)(\'|\")");
			Matcher picture_2 = picture2.matcher(pp);
			if (picture_2.find()) {
				p.add(picture_2.group(3));
			}
		}
		
		System.out.println("网页标题：" + t);
		System.out.print("网页中共" + count_pic + "个图片，文件名为");
		for (int i = 0; i < p.size(); i++) 
		{
			System.out.print(p.get(i) + "  ");
		}
		System.out.println("\n网页中包含" + count_hyp 
				+ "个超链接，超链接信息如下：");
		System.out.println("名称\t\t地址");
		for (int i = 0; i < h.size(); i++) 
		{
			System.out.println(h.get(i) + "\t\t" 
		+ address.get(i));
		}
	}
}
