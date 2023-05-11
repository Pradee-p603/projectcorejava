package in.co.rays.basics;

public class StBf {
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer("vijay dinanath chouhan ");
 sb.append(" dinanath");
 sb.append(" chouhan");
 System.out.println();
 System.out.println("char at 4;  " +sb.charAt(4));
 System.out.println("capacity    " +sb.capacity());
 System.out.println("index of;   " +sb.indexOf("dinanath"));
 System.out.println("replace ;   " +sb.replace(0, 5, "pradeep"));

 System.out.println("index of;   " +sb.indexOf("chouhan"));
 System.out.println("string length ="  +sb.length());
 System.out.println("reverse  ;  " +sb.reverse());
	}
}
