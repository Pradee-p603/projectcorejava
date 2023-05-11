package in.co.rays.practice;

import java.util.Scanner;

public class HarmoniSeries {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double sum = 0,n,i;
	System.out.println("please enter the value of N: = 9");
	n = sc.nextDouble();
	for(i = 1; i< n; i++) {
		sum = sum + (1/i);
		if(i==1) {
			System.out.println("1/" + i + " &nbsp;+ &nbsp;");
		}
		
		System.out.println();
		
	System.out.println("the sum of these number is : "+ sum);
	}
	}
	
}