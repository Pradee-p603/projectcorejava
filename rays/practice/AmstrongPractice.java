package in.co.rays.practice;

// chek wheather the given number is armstrong or not ?
public class AmstrongPractice {
	public static void main(String[] args) {

		int number = 153;
		int n = number;
		int r;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = sum * 10 + r;
			n = n / 10;

		
		}
		System.out.println(number);
		/*
		 * if (number == sum) { System.out.println("given number is armstrong = " +
		 * number); } else { System.out.println("given number is not armstrong = " +
		 * number); }
		 */ }
}
