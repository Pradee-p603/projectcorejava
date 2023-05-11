package in.co.rays.basics;
public class ArmstrongNumber {
public static void main(String[] args) {
	int arm=173;
	int r;
	int sum=0;
	int t = arm;
	while(t > 0) {
		 r = t % 10;
		 sum = sum + ( r * r * r);
		 t = t/10;}
		 
		 if(arm == sum) {
			 
			 System.out.println( "arm is amstrong number");
			 }
			 
			 else{
				System.out.println("arm is not amstrong number");
			 }
			 }
				 
	}
			
	
	


