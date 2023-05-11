package in.co.rays.practice;
//chek wheather the given number is prime or not
public class PrimeNumberPractice {
	public static void main(String[] args) {

		int num = 13;
		int n = num;
		int count = 0;
		for (int i = 2; i < num; i++) {

			if (n % i == 0) {
				count++;}
			}
			if (count == 0) {
				System.out.println("given number is prime");
			} else {System.out.println("given number is not prime");}

		}

	}


