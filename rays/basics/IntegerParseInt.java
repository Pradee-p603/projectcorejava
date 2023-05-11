package in.co.rays.basics;

public class IntegerParseInt {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int sum = a+ b;
		double d = a/b;
		int e = a * b;
		System.out.println("sum = " + sum);
		System.out.println("divide = " + d);
		System.out.println("multiply = " + e);
	}

}
