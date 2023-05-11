package in.co.rays.practice;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	
	public void setbase(int base) {
		this.base = base;
	}
	public int getbase() {
	
      return base;
	}
		public void setheight(int height) {
			this.height = height;
		}
		public int getheight() {
			return height;
		}
		public void Tarea() {
			int Tarea = (base * height)/2;
			System.out.println("area of given triangle = " + Tarea);
		}
}
