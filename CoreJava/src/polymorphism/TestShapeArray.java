package polymorphism;

public class TestShapeArray {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		s[0] =  new Circle(2);
		s[1] = new Rectangle(5,6);
		s[2] = new Triangle(3,5);
		
		
		
	
		double totalArea = calcArea(s);
		System.out.println("Total area "+totalArea);
		
	}
	public static double calcArea(Shape[]s) {
		double totalArea = 0;
		for (int i = 0; i<s.length; i++) {
		totalArea += s[i].area();
		}
		return totalArea;
	}
	
}
