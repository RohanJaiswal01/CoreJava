package concurrencyAndThreads;

public class TimeDemoThread extends Thread{
	
	private String name = null;
	
	public TimeDemoThread(String threadname) {
		
		name = threadname;
		
	}
	public void run() {
		
		for(int i=1; i<= 10; i++) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i+ "#" + name);
	}
	}
	
	public static void main(String[] args) {
		
		TimeDemoThread t1 = new TimeDemoThread("Rohan");
		t1.setPriority(10);//give priority max
		
		TimeDemoThread t2 = new TimeDemoThread("Raj");
		t2.setPriority(1);//give priority min
		
		
		t1.start();
		t2.start();
			
		
	}

}
