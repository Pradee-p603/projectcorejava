package in.co.rays.practice; 

import javax.sound.midi.Soundbank;

public class TestInheritence {
public static void main(String[] args) {
	
	     Shape s = new Shape();
	     s.setborderWidth(12);
	     s.setcolour("green");
	     System.out.println(s.getborderWidth());
	     System.out.println(s.getcolour());
	     
	     Rectangle R = new Rectangle();
	     R.setbreadth(10);
	     R.setlength(5);
	    R.Rarea();
	    
	    Cirle c = new Cirle();
	    c.setradius(12);
	    c.Carea();
	    
	    Triangle t = new Triangle();
	    t.setheight(10);
	    t.setbase(10);
	    t.Tarea();
	    
	    Shape S1 = new Triangle();
	    Triangle t1 = (Triangle)S1;
	    t1.setbase(100);
	    t1.setheight(100);
	    t1.Tarea();
	    
	    
	    Shape s2 = new Cirle();//methodoverloading
	    Cirle C1 = (Cirle)s2;
	    C1.setradius(20);
	    C1.Carea();
	    
	    Shape s3 = new Rectangle();
	    Rectangle R1 = (Rectangle)s3;
	    R1.setlength(10);
	    R1.setbreadth(15);
	    R1.Rarea();
}
}
