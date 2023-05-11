package in.co.rays.basics;

public class StringBuff {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("pradeep");
		sb.append(" mangal");
		System.out.println("length = "+sb.length() );
		System.out.println("capacity = "+sb.capacity());
		System.out.println("char = " +sb.charAt(1));
		System.out.println("index of ="+sb.indexOf("pradeep"));
		System.out.println("replace ="+sb.replace(8, 15, "chandravanshi"));
		System.out.println("reverse ="+sb.reverse());
		
	}

}
