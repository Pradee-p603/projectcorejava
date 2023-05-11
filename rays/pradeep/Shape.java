package in.co.rays.pradeep;

public class Shape {
	private String Colour = null;
	private int borderWidth = 0;
	
	
	public void setcolour(String colour) {
		this.Colour = colour;
	}
	public void setborerWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	public String getcolour() {
		System.out.println(Colour);
		return Colour;
	}
	public int getborderWidth() {
		System.out.println(borderWidth);
		return borderWidth;
	}
	public double area() {
		System.out.println("Shape area method ");
		return 0;
		
	}
	
	
	
	
	

}
