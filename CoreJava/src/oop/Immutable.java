package oop;

public final class Immutable {
	
	private final String color;
	private final int borderwidth;
	
	/*public Immutable() {
	}*/
	public Immutable(String c, int bw) {
		color = c;
		borderwidth = bw;
	}

	public String getColor() {
		return color;
	}

	public int getBorderwidth() {
		return borderwidth;
	}
	public static void main(String[] args) {
		
		Immutable im = new Immutable("Blue",5);
		System.out.println( im.getColor()+" "+im.getBorderwidth());
		
	}  
} 
      


