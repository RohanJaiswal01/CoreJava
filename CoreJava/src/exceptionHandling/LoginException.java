package exceptionHandling;

public class LoginException extends Exception{ //programmer Exception Class
 
	public LoginException() {
		super ("User not found");
	}
}


