package in.co.rays.pradeep;

public class TestPradeep {
	public static void main(String[] args) {
		Shape[] s=  new Shape[3];
		
	s[0] = new Rectangle();
	Rectangle r = (Rectangle)s[0];
	r.setlength(15);
	r.setwidth(15);
	
	s[1] = new Circle();
	Circle c =  (Circle)s[1];
	c.setradius(15);
	
	s[2] = new Triangle();
	Triangle t = (Triangle)s[2];
	t.setbase(15);
	t.setheight(20);
	
	double totalarea = 0;
	
	for (int i = 0; i < s.length; i++) {
		totalarea = totalarea + s[i].area();
		
		
	}
	System.out.println("total area = "+ totalarea);
	
	
	
	}
}