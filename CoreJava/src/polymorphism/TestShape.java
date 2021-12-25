package polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		//memory overriding
		
		Shape s = new Circle(5);//give memory to circle 
		
		s.setBorderwidth(9);
		s.setColor("blue");
		
		
		s.area();
		System.out.println("Borderwidth "+ s.getBorderwidth());
		System.out.println("Color " + s.getColor());
		
		//for rectangle
		
		Shape s1 = new Rectangle(5,8);//give memory to rectangle
		
		s1.area();
		
		// for triangle
		
		Shape s2 = new Triangle(5,3);// give memory to triangle
		
		s2.area();
	}

}