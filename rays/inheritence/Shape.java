package in.co.rays.inheritence;

public class Shape {
	private String Colour = null;
	private int borderWidth = 0;
	
	
	public void setColour(String Colour) {
		 this.Colour = Colour;
	}
	public String getColour() {
		return  Colour;
	}
	public void setborderWidth( int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public int getborderWidth() {
		return borderWidth;
	}
	public static void area() {
		System.out.println("shape area method");
		
	}
	

}
