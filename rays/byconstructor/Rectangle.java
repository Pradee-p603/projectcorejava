package in.co.rays.byconstructor;

public class Rectangle extends Shape {
	private int length ;
	private int width ;
	
	Rectangle(){
		
	}
	Rectangle(int width,int length){
		this.length = length;
		this.width = width;
		
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area () {
		double rarea = length * width;
		System.out.println("area of rectangle =" + rarea);
		return rarea;
		
	}

}
