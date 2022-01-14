package exceptionHandling;

public class TestInsufficientFundException {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setAcno("00123544");
		System.out.println("Account Number"+a.getAcno());
		a.setbal(1000.0);
		System.out.println(a.getbal());
		a.deposite(2000.0);
		System.out.println(a.withdrawl(2600));
	}

}
