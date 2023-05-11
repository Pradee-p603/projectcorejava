package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndCalender {
	private static final int DD = 0;
	private static final int MM = 0;

public static void main(String[] args) throws ParseException {
	 Date today = new Date();
	 System.out.println(today);
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 String s = sdf.format(today);
	 System.out.println(s);
	  SimpleDateFormat r = new SimpleDateFormat("dd/MM/yyyy");
	  String sourceDate = " 17/04/2023";
	  
		 SimpleDateFormat f = new SimpleDateFormat("DD - MM - YYYY");
		Date d= r.parse(sourceDate);
		 System.out.println(d);
	 
		
}
}