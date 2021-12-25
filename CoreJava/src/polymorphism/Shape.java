package polymorphism;

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
	
	/*public void area() {
		
	}*/
	public double area() {
		return  0.0;
	}

}
