package concurrencyAndThreads;

public class HelloRunnable extends HelloWithoutThread implements Runnable{

	
	public HelloRunnable(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {//run() abstract method of Runnable Interface
		
		System.out.println( "Hello from Thread!");
		super.runtest();
		
	}
	
	public static void main(String[] args) {
		
		HelloRunnable t1 = new HelloRunnable("Ram");
	//	HelloRunnable t2 = new HelloRunnable("Shayam");
		
		Thread tt = new Thread(t1);
		Thread th = new Thread(new HelloRunnable("Shayam"));
		tt.start();
		th.start();
	}

	
}