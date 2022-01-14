package concurrencyAndThreads;


public class TestAccount extends Thread{
	
	
	public static Account data = new Account();
	
	String name = null;
	
	public TestAccount(String name) {
	this.name = name;
	}
	
	public void run() {
		for (int i=1; i<= 5; i++) {
			data.deposite(name, 1000);
		}
	}
	
	public static void main(String[] args) {
		
		TestAccount t1 = new TestAccount("Ram");
		TestAccount t2 = new TestAccount("Shayam");
		
		t1.start();
		t2.start();
	}

}
