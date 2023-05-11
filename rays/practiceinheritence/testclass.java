package in.co.rays.practiceinheritence;

public class testclass {
public static void main(String[] args) {
	 Shape s[]  = new Shape[3];
	 s[0] = new Rectangle();
	 s[1] = new Circle();
	 s[2] = new Triangle();
	 
	 Rectangle r = (Rectangle)s[0];
	 r.setbreadth(10);
	 r.setlength(15);
	// r.area();
	
	 
	 Circle c = (Circle)s[1];
	 c.setradius(15);
	 //c.area();
	 
	 Triangle t = (Triangle)s[2];
	 t.setbase(10);
	 t.setheight(15);
	 //t.area();
	 
	 double totalarea = 0;
	 for(int i = 0; i < s.length; i++) {
		 totalarea = totalarea + s[i].area();
	 }
	 System.out.println("totalarea = " + totalarea);
	 }
}

