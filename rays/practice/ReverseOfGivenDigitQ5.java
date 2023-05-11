package in.co.rays.practice;

public class ReverseOfGivenDigitQ5 {
	public static void main(String[] args) {
		int number = 1234;
		int r;
		int sum =0;
		int n = number;
		while(n >0) {
			r = n%10;
			sum = sum * 10 + r;
			n = n/10;
			
		}
	System.out.println(sum);
	}

		
	}


