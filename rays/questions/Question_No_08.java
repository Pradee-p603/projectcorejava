package in.co.rays.questions;

public class Question_No_08 {

	public static void main(String[] args) {

		int[][] table = new int[11][11];
		for (int i = 1; i < table.length; i++) {
			for (int j = 1; j < table.length; j++) {
				table[i][j] = i * j;

			}

		}
		for (int i = 1; i < table.length; i++) {
			for (int j = 1; j < table.length; j++) {

				System.out.print(table[i][j] + " \t");
			}
			System.out.println();
		}

	}

}
