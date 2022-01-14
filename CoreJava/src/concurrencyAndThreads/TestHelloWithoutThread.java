package concurrencyAndThreads;

public class TestHelloWithoutThread {
	
	public static void main(String[] args) {
		
			HelloWithoutThread t1 = new HelloWithoutThread("Ram");
			HelloWithoutThread t2 = new HelloWithoutThread("Shayam");
			
			t1.runtest();
			t2.runtest();
	}

}
