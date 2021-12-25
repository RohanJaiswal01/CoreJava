package Enheritance;

public class Circle extends Shape{
	
	private double radius = 0;
	public static final double PI = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void area() {
		
		double area = PI*radius*radius;
		System.out.println("Circle area = "+area);
	}

}
