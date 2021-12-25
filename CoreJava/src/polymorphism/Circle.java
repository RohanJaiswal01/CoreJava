package polymorphism;

public class Circle extends Shape {

	private int radius = 0;
	public static final double PI = 3.14;
	
	public Circle() {
		
	}
	public Circle(int r) {
		
		radius = r;
	}
	public int getRadius() {
		return radius;
	}
	/*public void area() {           //for test shape
		
		double area = PI * radius;
		System.out.println("Area of circle "+ area);
		
	}*/
	public double area(){
		
		double area = PI * radius;
		System.out.println("area of Circle="+area);
		return area;
		
	}
}
