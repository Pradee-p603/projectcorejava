package in.co.rays.byconstructor;

public class Triangle extends Shape {
	private int base ;
	private int height;
	
	Triangle(){
		
	}
	Triangle(int base , int height){
		this.base = base;
		this.height = height;
		
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public double area() {
		double Tarea =( base * height)/2;
		System.out.println("area of Triangle =" + Tarea);
		return Tarea;
		
	}
	
	
	}
	
	


