package in.co.rays.practice;

public class AverageOfOod {
	public static void main(String[] args) {
		int sum = 0;
		int count =0;
		for(int i = 1; i <= 100;  i = i+2) {
			//sum = sum + i;
			System.out.println(i);
			count++;
			
			sum = sum + i ;
			
		}
		System.out.println("sum is  = " + sum);
		int avg = sum/count;
		 System.out.println(avg);
}

}
