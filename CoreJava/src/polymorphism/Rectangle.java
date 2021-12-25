package polymorphism;

public class Rectangle extends Shape{
	
	private int length = 0;
	private int width = 0;
	
	public Rectangle() {
		
	}
	public Rectangle(int len, int wid) {
		length = len;
		width = wid;
	}
	/*public void area() {     //for test shape
		
		int area = length*width;
		System.out.println("Area of rectangle "+ area);
		
	}*/
     public double area() {
		
		int area = length*width;
		System.out.println("area of Reactangle="+area);
        return area;		
	}
}
