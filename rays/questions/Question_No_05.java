package in.co.rays.questions;

public class Question_No_05 {
	public static void main(String[] args) {
		int num = 123456;
		int r;
		int sum = 0;
		int n = num;
		while(n >0) {
			r = n % 10 ;
			sum = sum * 10 + r;
			n = n/10;
		}
		System.out.println(sum);
	}

}
