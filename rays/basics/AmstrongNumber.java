package in.co.rays.basics;

public class AmstrongNumber {
	public static void main(String[] args) {
int number = 371;
			
		
		int r;
		
		int n = number;
		
		int sum = 0;
		
		while(n > 0 ) {
			
			r = n % 10;
			sum = sum +(r * r* r);
					
			n = n/10;		
		}
		System.out.println(sum);
		
		  if(number == sum) { System.out.println("number is amstrong"); } 
		  else {
		  System.out.println("not amstrong number"); }
		 	}
	



	}
		
	