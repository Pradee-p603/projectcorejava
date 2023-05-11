package in.co.rays.pradeep;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	
	
	public void setbase(int base) {
		this.base = base;
		
	}
	public void setheight(int height) {
		this.height = height;
	}
	public int getheight(){
		return height;
		
	}
	public int getbase() {
		return base;
	}
	public double area() {
		double Tarea = base * height;
		System.out.println("area of triangle = "+Tarea);
		return Tarea;
	}
	
}
