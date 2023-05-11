package in.co.rays.basics;

public class HelloAll {
	public static void main(String[] args) {
		int size = args.length;
		if (size ==0) {
			System.out.println("Usage : java HelloAll n1 n2 n3..");
			}
		else {
			for (int i = 1; i < size; i++) {
				System.out.println(i + " = hello " + args[i]);
			}
			}
		
	}
}


