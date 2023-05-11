package in.co.rays.basics;

public class TernaryOperator {
public static void main(String[] args) {
	int a = 20;
	int b = 50;
	int c = (a < b) ? 45 : 60;
		
	System.out.println(c);
	
	int d = (a < b) ? 77 : ((a < b) ? 90 : 37); //nested ternary
	
	System.out.println(d);
	
}
}
