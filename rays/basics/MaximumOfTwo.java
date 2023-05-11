package in.co.rays.basics;

// question = find the maximum of two
public class MaximumOfTwo {
	public static void main(String[] args) {
		// System.out.println("maximum of two; =" + Math.max(32, 42));
		int a = 145;
		int b = 146;

		if (a > b) {
			System.out.println("maximum is a = " + a);
		} else if (a == b) {
			System.out.println("a = b");

		} else {
			System.out.println("maximum is b = " + b);
		}
	}
}
