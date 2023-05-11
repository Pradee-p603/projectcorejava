package in.co.rays.basics;

public class ArrayTest {public static void main(String[] args) {
	

//int[] table = {2, 4, 6, 8, 10};
	int [] table = new int[5];
	table [0] = 2;
	table [1] = 4;
    table [2] = 6;
	table [3] = 8;
	table [4] = 10;
for(int i: table) {
	System.out.println(i);
}
}
}