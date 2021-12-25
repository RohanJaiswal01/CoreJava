package Enheritance;

public class TestShape {
	
	public static void main(String[] args) {
		
	Circle circle = new Circle();
	
	circle.setBorderwidth(1);
	circle.setColor("red");
	circle.setRadius(2);
		
	int i = circle.getBorderwidth();
	System.out.println("Borderwidth - " + i);
	
	String str = circle.getColor();
	System.out.println("color - " + str);
	
	System.out.println("Borderwidth - "+ circle.getBorderwidth());
	
	System.out.println("Circle radius = " + circle.getRadius());
     
	circle.area();
	
	Rectangle rt=new Rectangle();
	Rectangle rt1=new Rectangle(100,200);
	
	
	
	System.out.println("Rectangle length = " + rt1.getlength());
	System.out.println("Rectangle Width = " + rt1.getwidth());

    rt1.area2();
    
    Tringle tr=new Tringle();
   
    
    Tringle tr1 = new Tringle(3,2);
    
    System.out.println("Tringle Height ="+ tr1.getHeight());
    System.out.println("Tringle width ="+ tr1.getBase());

    tr1.area1();
   
	}

}
