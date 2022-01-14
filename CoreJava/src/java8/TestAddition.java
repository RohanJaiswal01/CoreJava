package java8;

public class TestAddition {
	
	public static void main(String[] args) {
		
		Addition ad = (a,b)->{
			return a+b;
		};
		int c = ad.add(15,25);
		System.out.println("Addition :" + c);
		ad.defMethod();
		Addition.staticMethod();
		
	}

}
