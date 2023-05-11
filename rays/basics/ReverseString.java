package in.co.rays.basics;

public class ReverseString {
	public static void main(String[] args) {

		String name = "vijay dinanath chouhan";
		String[] str = name.split(" ");
		for (String s : str)
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(  i    ));

			}

	System.out.println();
	}
}
