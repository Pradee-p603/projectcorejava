package in.co.rays.questions;

public class Question_No_16 {
	public static void main(String[] args) {
		
	
	int [] a = {12 , 22, 26, 100, 200, 500};
	int y = 0;
	int x = a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i] > x) {
			y=x;
			x=a[i];
		}
		else if (a[i] > y && a[i] < x ) {
			y = a[i];
			
		}
		
	
			
		}
	System.out.println("second largest number is "+ y);
		
	}


}
