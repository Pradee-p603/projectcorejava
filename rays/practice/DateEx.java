package in.co.rays.practice;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) throws ParseException{
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(d);
		System.out.println(s);
		String p = "17/03/1998";
	    Date f = sdf.parse(p);
		System.out.println(f);
			
		}



		
		
		
		}
		
		