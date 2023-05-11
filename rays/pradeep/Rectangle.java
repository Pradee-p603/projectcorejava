package in.co.rays.pradeep;

public class Rectangle extends Shape{
	private int length ;
	private int width;
	
	public void setlength(int length) {
		this.length = length;
	}
	public int getlength() {
		return length;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	public int getwidth() {
		return width;
	}
	public double area() {
		double Rarea = length * width;
		System.out.println("area of rectangle = "+ Rarea);
		return Rarea;
		
	}

}
