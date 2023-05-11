package in.co.rays.basics;

public class StClass {
public static void main (String[] args) {
	String name = "vijay dinanath chouhan";
	char c = 'a';
	int count = 0;
	for(int i= 0; i<name.length(); i++) {
		 
		// System.out.println(name.charAt(i));
	
		if(name.charAt(i)==c) {
			count++;
				}
		
		
	}
	System.out.println("count a = " + count);
	
}

}
