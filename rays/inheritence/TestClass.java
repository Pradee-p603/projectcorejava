package in.co.rays.inheritence;

public class TestClass {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setlength(10);
		r.setbreadth(10);
		r.raera();
		
		Triangle t = new Triangle();
		t.setbase(10);
		t.setheight(10);
		t.tarea();
		circle c = new circle();
		c.setradius(10);
		c.Carea();
	
		Shape s = new Triangle();
		Triangle t1 = (Triangle)s; //typecasting
		t1.setbase(5);
		t1.setheight(5);
		t1.tarea();
		
		Shape s1 = new circle();
		circle c1 = (circle)s1;
		c1.setradius(10);
		c1.Carea();
		
		
		Shape s2 =new Rectangle();
		Rectangle r1 = (Rectangle)s2;
		r1.setbreadth(12);
		r1.setlength(10);
		r1.raera();
	}

}
