package in.co.rays.basics;

public class DimensionalArray {
	public static void main(String[] args) {
		
		int[][] Table = new int [11][11];
		for(int i = 1; i < Table.length; i++) {
			for (int j = 1; j < Table.length; j++) {
				Table[i][j] = i*j;
			}
			}
	
			for(int[]is :Table ) {
				
				for(int d : is) {
					System.out.print( d  +  " \t ");
				}
				
				System.out.println();
				
		}
	}
}