package concurrencyAndThreads;

public class HelloWithThread  extends Thread{
	
private String name = null;
	
	public HelloWithThread(String threadname) {
		name = threadname;
	}
	public void run() {//run() method of Thread class
		for (int i =1; i<=5; i++) 
			System.out.println(i + " Hello thread : " + name);
	}

}
