package in.co.rays.basics;

public class ObjectOriented {
	 
	public void sum(int a, int b) {

		int c = a + b;
		System.out.println("sum = " + c);
	}

	public void multiply ( int a, int b) {
		
		int c = a* b;
		System.out.println("multiply = " + c);
		
	}
		
		
public void Armstrong(int number){  
	
	
int r;

int n = number;

int sum = 0;

while(n > 0 ) {
	
	r = n % 10;
	sum = sum +(r * r* r);
			
	n = n/10;		
}
if(number == sum) {
	System.out.println("number is amstrong");
}
else {
	System.out.println("not amstrong number");}
}
	


public static void ReverseArmstrong(int number){

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

public void factorise(int number) {
int u = 1;

for(int i = 1; i <= number; i++) {
	u = u *i;
	
	
	
}
System.out.println(u);
}

public void PrimeNumber(int num) {
	int n = num;
	int count = 0;
	for (int i = 2; i < num; i++) {

		if (n % i == 0) {
			count++;}
		}
		if (count == 0) {
			System.out.println("given number is prime");
		} else {System.out.println("given number is not prime");}

	}


public void Number_07(int x) {
	
	int count = 0;
	int sum = 0;
	for(int i = 100; i< 200; i++) {
		if(i % x ==0) {
			count = i;
			System.out.println(count);
			sum = sum + count;
		}
		
	}
	System.out.println("sum = " + sum);
}



}

		




