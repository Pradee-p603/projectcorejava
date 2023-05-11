package in.co.rays.practice;

public class Cirle extends Shape {
	private int Radius ;
	public static final double PI = 3.14;
	
	
	public void setradius(int Radius) {
		this.Radius = Radius;
		
	}
	public int getRadius() {
		
	return Radius;
	}
	public void Carea() {
		double Carea =  PI * Radius * Radius;
		System.out.println("area of circle = " + Carea);
		
	}

}
