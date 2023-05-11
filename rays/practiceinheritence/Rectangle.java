package in.co.rays.practiceinheritence;

public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public void setlength(int length) {
		this.length = length;
	}
public int getlength() {
	return length;
}
public void setbreadth(int breadth) {
	this.breadth = breadth;
}
public int getbreadth() {
	return breadth;
}
public double area() {
	double rarea = length *breadth;
	System.out.println("area of rectangle = " + rarea);
	return rarea;
}
}
