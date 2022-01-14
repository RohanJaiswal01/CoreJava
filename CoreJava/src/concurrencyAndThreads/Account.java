package concurrencyAndThreads;

public class Account {

	private int balance = 0;
	
	public /*synchronized */void deposite (String msg, int amount) {
		synchronized (this) {
			int bal = getBalance();
			setBalance(bal+amount);
			}
		System.out.println(msg +" balance is : "+getBalance());
	}

	public int getBalance() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	
	
}
	