
public class Account {
	private String Acno;
	private String Actype;
	private double bal;

public double deposite(double amount){
    bal=bal+amount;
	return bal;
}
public double withdrawl(double amount) {
bal=bal-amount;	
return bal;
	
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
	return bal;
	
}

}
