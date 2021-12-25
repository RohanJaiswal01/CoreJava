package polymorphism;

public class TestShapeReturnType {

public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
	
		for(int i = 0;i<3;i++) {
			s[i] = getShape(i+1);
			s[i].area();
		}
		
	}
	
public static Shape getShape(int i) {
	if (i==1) return new Rectangle(10,20);
	if(i==2) return new Circle(10);
	if (i==3) return new Triangle(10,20);
	Shape s = new Shape();
	return s;
}

}

