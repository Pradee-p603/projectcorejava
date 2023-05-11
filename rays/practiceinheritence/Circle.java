package in.co.rays.practiceinheritence;

public class Circle extends Shape {
	private int radius = 0;
	public static final double PI = 3.14;

	public void setradius(int radius) {
		this.radius = radius;
	}

	public int getradius() {
		return radius;
	}

	public double area() {
		double Carea = PI * radius * radius;
		System.out.println("Area of circle = " + Carea);
		return Carea;
	}
}
