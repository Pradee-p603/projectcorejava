package in.co.rays.practice;

public class ReverseString01 {

	public static void main(String[] args) {
		String name = "pradeep chandravanshi";
		String[] str = name.split("  ");
				for(String p : str)
		for(int i= p.length()- 1; i >= 0; i--) {
			System.out.print(p.charAt(i));
		}
	//System.out.println(" ");
	}
}
