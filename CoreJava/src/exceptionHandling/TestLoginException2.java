package exceptionHandling;

public class TestLoginException2 {
	
	public static void main(String[] args) {
		
		auth("Rohan");
	}
	public static void auth(String name) {
		
		LoginException e = new LoginException();
		if(!name.equals("Admin")){
		try{
			throw e;
		   }catch(LoginException e1) {
			System.out.println(e1.getMessage());
		     }
	     } else {
		   System.out.println("welcome admin");
	   }
	}

}
