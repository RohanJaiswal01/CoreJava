package exceptionHandling;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
        try {
					double div = 15/0;
					System.out.println(div);

		  }/* catch (RuntimeException e) {
			  System.out.println(e.getMessage());
		  }*/
           catch (ArithmeticException e) {
		 			
			System.out.println("You can not divide by zero");
		}
      try { String s = null;
        System.out.println(s.length());
        
      } catch (NullPointerException e) {
    	  e.printStackTrace();
    	  System.out.println(e.getMessage());
      }
      
	}

}
