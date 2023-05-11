package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender_new {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, 30);
		System.out.println(sdf.format(cal.getTime()));
		
		for (int i = 1; i <=12; i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(sdf.format(cal.getTime()));
		}
	
	}

}
