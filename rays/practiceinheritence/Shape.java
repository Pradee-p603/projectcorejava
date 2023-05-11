package in.co.rays.practiceinheritence;

public class Shape {
	private String colour = null;
	private int borderWidth = 0;

	public void setcolour(String colour) {
		this.colour = colour;
	}

	public String getcolour() {
		return colour;
	}

	public void setborderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
}

	public int getborderWidth() {
		return borderWidth;
	}

	public double area() {
		System.out.println("shape area method");
		return 0;
	}
}
