package in.co.rays.practice;

public class SecondlargestAry {
	public static void main(String[] args) {

		int a [] = {11, 12, 13, 55, 77, 88};
		int y = 0;
		int x = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > x) {
				y = x;
				x = a[i];
			}
			else if (a[i] > y && a[i] < x) {
				 y = a[i];
			}
		
		}
		System.out.println(y);	
		}
}
