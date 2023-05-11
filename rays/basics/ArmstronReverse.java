package in.co.rays.basics;

public class ArmstronReverse {
public static void main(String[] args) {
	
	int number = 9876;
	
	int r;
	int n = number;
	int sum = 0;
			while(n > 0) {
				r = n%10;
				sum = sum * 10 + r;
				n = n/10;
			}
			System.out.println(sum);
}
}
