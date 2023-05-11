package in.co.rays.basics;

public class CountStringPractice {
	public static void main(String[] args) {
		String name = "pradeep chandravanshi";
		int count = 0;
		for (char c = 'a'; c <= 'z'; c++) {
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

	}
}