package in.co.rays.inheritence;

public class Triangle extends Shape{
	private int base ;
	private int height;
	
	
	public void setbase(int base) {
		this.base = base;
	}
	public int getbase() {
		return base;
	}
	public void setheight(int height) {
		this.height = height;
	}
	public int getheight() {
		return height;
	}
	public void tarea() {
		int tarea = (base * height )/2;
		System.out.println("area of triange = " + tarea);
	}
	
	
	
		
	}


