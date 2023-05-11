package in.co.rays.basics;

public class NormalStringBuffer {
public static void main(String[] args) {
	String name = "Pradeep Chandravanshi";
	
	System.out.println(" String length;"  +name.length());
	System.out.println("4th character is;"  +name.charAt(3));
	System.out.println("pradeep index is;"  +name.indexOf("Pradeep"));
	System.out.println("first p position;"  +name.indexOf("P"));
	System.out.println("last p position;"  +name.lastIndexOf("p"));
	System.out.println("p is replace by D; "  +name.replace("p", "D"));
	System.out.println(" chhota pradeep  "   +name.toLowerCase());
	System.out.println("bada  "     +name.toUpperCase());
	System.out.println("start with chandravanshi "   +name.startsWith("chandravanshi"));
	System.out.println("ends with chandra "      +name.endsWith("chandra"));
	System.out.println("substring "           +name.substring(7));
	
	
}
}
