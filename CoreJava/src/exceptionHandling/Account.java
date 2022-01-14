package exceptionHandling;

public class Account {
	
	private String Acno;
	private String Actype;
	private double bal;

public double deposite(double amount){
	
	System.out.println("Deposite amount :Rs. " + amount);
    bal=bal+amount;
    System.out.println("After Deposite total balance :"+ bal);
	return bal;
}
public double withdrawl(double amount) {
	System.out.println("Withdrawl amount requested :" + amount);
	if ((bal-amount)<= 500) {
		InsufficientFundException e = new InsufficientFundException();
		try {
			throw e;
		}catch (InsufficientFundException e1){
			System.out.println(e1.getMessage()+" "+"minimum balance require Rs.500/-");
			return bal;
		}
	}else {
     bal=bal-amount;
     System.out.println("Remaining Balance : ");
     return bal;
	}
}
	public void setAcno(String Acno) {

		this.Acno = Acno;
	}

	public String getAcno() {
		
		return Acno;
	}
	public void setActype(String Actype)
	{
		this.Actype=Actype;
		}
	public String getActype() {
		
		return Actype;
	}
public void setbal(double bal) {
	
	this.bal=bal;
	
}
public double getbal() {
	System.out.println("Available balance :");
	return bal;
	
}

}



