package practiceInClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = new GregorianCalendar();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1); //月从0开始，0-11
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		StringBuffer weekStr = new StringBuffer("星期");
		switch(week-1) {
		case 0: weekStr = weekStr.append("日"); break;
		default: weekStr.append(week-1); break;
		}
		System.out.println(weekStr); //1:表示周日，其他的是-1
		
		*/
		
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日"); //格式化模板
		//                                     或者("yyyy/MM/dd hh:mm");
		String today = df.format(date);
		System.out.println(today);
		
		
	}

}
