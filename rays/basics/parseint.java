package in.co.rays.basics;
//parseint method can convert string value to int

public class parseint  {
	public static void main(String[] args) {
		
		String s1 = args[0];
		int i1 = Integer.parseInt(s1);

		String s2 = args[1];
		int i2 = Integer.parseInt(s2);

		String s3 = args[2];
		int i3 = Integer.parseInt(s3);

		String s4 = args[3];
		int i4 = Integer.parseInt(s4);

		System.out.println(s1 + s2);
		System.out.println(i1 + i2);
		System.out.println(s1 + s2 + s3 );
		System.out.println(i1 + i2 + i3);
		System.out.println(i1 + i2 + i3);
		System.out.println(s1 + s2 + s3);
		
	}
}
