package polymorphism;

public class Triangle extends Shape {  // inheritance from parent class with keyword extends

	private int base = 0;
	private int height = 0;
	
	public Triangle() {
		
	}
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
		
	}
	public int getBase() {
		return base;
	}
	/*public void setBase(int base) {
		this.base = base;
	}*/
	public int getHeight() {
		return height;
	}
	/*public void setHeight(int height) {
		this.height = height;
	}*/
	
	/*public void area() {                 //for test shape
		
		double area = (base*height)/2;
		System.out.println("Area of Triangle "+ area);
		
	}*/
        public double area() {               	
		double area = (base*height)/2;
		System.out.println("area of Traiangle=" + area);
        return area;		
	}
}
