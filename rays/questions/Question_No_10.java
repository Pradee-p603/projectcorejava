package in.co.rays.questions;

public class Question_No_10 {
	public static void main(String[] args) {
			int number = 155;
						
					
					int r;
					
					int n = number;
					
					int sum = 0;
					
					while(n > 0 ) {
						
						r = n % 10;
						sum = sum +(r * r* r);
								
						n = n/10;		
					}
				//	System.out.println(sum);
					
					  if(number == sum) { System.out.println("number is amstrong"); } 
					  else {
					  System.out.println("not amstrong number"); }
					 	}
				





					
		
		
	}


