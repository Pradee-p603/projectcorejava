package in.co.rays.byconstructor;

public class TestByConstructor {
	public static void main(String[] args) {
		Shape []s = new Shape[3];
		
s[0] = new Triangle(10,10);	
s[1] = new Rectangle(10,10);
s[2] = new Circle(10 );
		//Triangle t = new Triangle(15,10);
		//t.area();
	//	Circle c = new Circle(15);
		//c.area();
	//	Rectangle r =new Rectangle(15,15);
		//r.area();
		double totalarea = 0;
for(int i = 0; i < s.length; i++) {
	totalarea = totalarea + s[i].area();
}
		System.out.println("totalarea  + " + totalarea);	
		
	}

}
