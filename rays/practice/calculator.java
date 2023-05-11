package in.co.rays.practice;

public class calculator {
	public static void main(String[] args) {
	  int a = 1;
	  int b = 4;
	  
		switch (4){
		case 1: 
			int add = a + b;
			System.out.println("addition = " + add);
			
			break;
		case 2:
			int substraction = a-b;
			System.out.println("substraction = " + substraction);
			break;
		case 3:
			double divide = a/b;
			System.out.println("divide = " + divide);
			break;
		case 4 :
			int multiply = a*b;
			System.out.println("multiply = " + multiply);
			break;

		default:
			System.out.println("no value can be match defult ");
			break;
		}
		
	
	
	}
	}
	