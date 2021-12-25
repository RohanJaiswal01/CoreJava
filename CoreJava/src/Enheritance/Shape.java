package Enheritance;

public class Shape {
	
	private String color = null;
	private int borderwidth = 0;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	/*public Shape(String color, int borderwidth) {
		super();
		this.color = color;
		this.borderwidth = borderwidth;*///we can replace setter by constructor
	
	/*public void area() {
		System.out.println("Shape area");
	}*/

}
