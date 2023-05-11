package in.co.rays.byconstructor;

public class Circle extends Shape{
	private int radius;
	public final double  PI = 3.14;
	Circle(){
	}
	Circle(int radius){
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
public double area() {
	double Carea = PI * radius *radius;
		System.out.println("area of circle =" + Carea);
		return Carea;
}
}
