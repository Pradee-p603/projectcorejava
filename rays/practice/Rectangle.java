package in.co.rays.practice;

public class Rectangle extends Shape{
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
public int getbreasth() {
	return breadth;
}
public void Rarea() {
	int Rarea = length * breadth;
	System.out.println(" area of given Rectangle ="  +Rarea);
}
}
