package in.co.rays.inheritence;

public class circle extends Shape{
	private int radius;
	public static final double PI = 3.14;
	
	
	public void setradius(int radius) {
		this.radius = radius;
	}
	public int getradius() {
		return radius;
	}
	public void Carea() {
		  double Carea =  PI * radius * radius;
		  System.out.println("radius of circle  = " + Carea);
	}

}
