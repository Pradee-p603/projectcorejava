package in.co.rays.byconstructor;

public class Shape {
	private String colour = null;
	private int borderWidth ;
	Shape(){
		
	}
	Shape(String colour , int borderWidth){
		this.colour = colour;
		this.borderWidth = borderWidth;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorder() {
		return borderWidth;
	}
	public void setBorder(int border) {
		this.borderWidth = border;
	} 
	public double area() {
		System.out.println("shape area method");
		return  0;
	}
	
	

}
