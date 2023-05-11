package in.co.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ddd{
public static void main(String[] args) {
	Date Today = new Date();
	System.out.println(Today);
	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
	String s = sdf.format(Today);
	System.out.println(s);
	
}
}