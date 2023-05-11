package in.co.rays.basics;

public class TestCounting {
	public static void main(String[] args) {
		String name = "shree ram janki nayakam";
		int count = 0;
		char r = 'e';
		//for(char c = 'a'; c < 'z'; c++) {
			for (int i = 0; i < name.length(); i++) {
				if(name.charAt(i) == r) {
					count++;
				}
				
		
			}
			System.out.println("count r = "+count);
	
	
	
	}
}


