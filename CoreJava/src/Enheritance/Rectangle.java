package Enheritance;

public class Rectangle extends Shape{
	
	private int length = 0;
	private int width = 0;
	
	public Rectangle(){
		
	}
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int getlength() {
		return length;
	}
	public int getwidth() {
		return width;
	}
	public void area2() {
		
	int i= length*width;
	System.out.println("Rectangle area=" +i);
	}

}
