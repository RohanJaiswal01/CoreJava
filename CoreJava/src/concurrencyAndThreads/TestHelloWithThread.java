package concurrencyAndThreads;

public class TestHelloWithThread {
	
	public static void main(String[] args) {
		
		HelloWithThread t1 = new HelloWithThread("Ram");
		HelloWithThread t2 = new HelloWithThread("Shayam");
		
		t1.start();//start() use to call run() of thread
		t2.start();
		
		for (int i=1; i<= 5; i++)
			System.out.println("Main Thread");//Main itself a thread
	}

}
