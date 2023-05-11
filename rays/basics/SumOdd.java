package in.co.rays.basics;

public class SumOdd {
	public static void main(String[] args) {
		
		int sum =0;
		
		
		for(int i=1; i<=100; i=i+2) {
			
			sum = sum + i;
			System.out.println(i);
			
		}
		    
			System.out.println( "=  "+sum);
			
			  sum = sum / 100;
			  System.out.println("average = " + sum);
			
		}
			
		
	}


