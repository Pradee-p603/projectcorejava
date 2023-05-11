package in.co.rays.questions;

public class Question_No_11 {

	public static void main(String[] args) {
		int num = 11;
		int n = num;
		int count =0;
		for(int i = 2; i < num; i++) {
			if(n % i ==0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}
		
	}
}
