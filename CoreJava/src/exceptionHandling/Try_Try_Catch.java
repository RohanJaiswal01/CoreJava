package exceptionHandling;

public class Try_Try_Catch {
	
public static void main(String[] args) {
		
        try {
			double div = 15/2;
			System.out.println(div);
			 try { String s = "java";
		        System.out.println(s.length());
		        System.out.println(s.charAt(4));
		        
		      } catch (NullPointerException|IndexOutOfBoundsException e) {
		    	 System.out.println(e.getMessage());
		      }
			

		  } catch (ArithmeticException e) {
			
			System.out.println("You can not divide by zero");
		}
     
}

}
