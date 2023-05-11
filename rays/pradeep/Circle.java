package in.co.rays.pradeep;

public class Circle extends Shape {
	private int radius;
	public static final double PI = 3.14;
	
	public void setradius(int radius) {
		this.radius = radius;
	}
	public double area() {
		double Carea = PI * radius * radius;
		System.out.println("area of circle = "+ Carea);
		return Carea;
		
	}

}
