package in.co.rays.practice;

public class Shape {
	private String colour = null;
	private int borderWidth = 0;
	
	
	public void setcolour(String colour) {
		this.colour = colour;
		
	}
	public String getcolour() {
		return colour ;
	}
	public void setborderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
		
	}

	public int getborderWidth() {
		return borderWidth;
	}
	public void Area() {
		System.out.println("this method belongs to shape area");
	}
}
