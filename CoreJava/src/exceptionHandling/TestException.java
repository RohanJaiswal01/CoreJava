package exceptionHandling;

public class TestException {
	public static void main(String[] args) {
		
 try {	String s = "java";
	System.out.println(s.length());
    System.out.println(s.charAt(4));
		
	} catch (NullPointerException e) {
      System.out.println(e.getMessage());
 
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
	}

}
}