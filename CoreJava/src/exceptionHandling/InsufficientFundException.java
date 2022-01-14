package exceptionHandling;

public class InsufficientFundException extends RuntimeException{
	
	public InsufficientFundException() {
		super("Insufficient Fund");
	}

}
