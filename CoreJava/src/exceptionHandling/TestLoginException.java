package exceptionHandling;

public class TestLoginException {
	
	public static void main(String[] args) throws LoginException{//exception propagation to jvm
		
		/*try { *///use try catch or throws exception to jvm
		auth("Rohan");
		/*}catch (LoginException e) {
			
			System.out.println(e.getMessage());
		}*/
	}


public static void auth (String name) throws LoginException {//Exception propagation to main
	
	if(!name.equals("admin")) {
		
		LoginException e = new LoginException();
		throw e; // raise exception
	}else {
		System.out.println("welcome admin");
	}
}
}