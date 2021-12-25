package Enheritance;

public class Tringle extends Shape {
	
	private int height = 0;
	private int base =0;
	
	public int getHeight() {
		return height;
	}

	public int getBase() {
		return base;
	}
    public Tringle(){
    	
    }
	public Tringle(int height,int base) {
	 
		this.height=height;
		this.base=base;
	}
		

	public void area1() {
	int n=(base*height)/2;
	 System.out.println("Area of tringle" + n);
	}


}
