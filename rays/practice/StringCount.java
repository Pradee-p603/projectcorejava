package in.co.rays.practice;

class StringCount {

	public static void main(String[] args) {
		String name = "krishnagopal sharma";

		int count = 0;
		for (char c = 'a'; c < 'z'; c++) {
			for (int i = 0; i < name.length(); i++) {

				if (name.charAt(i) == c) {

					count++;
				}
				
				}
			if (count > 0) {
				System.out.println(c + " = " + count);
				count = 0;

			}
	
	}
}}