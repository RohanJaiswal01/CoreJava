package concurrencyAndThreads;

public class HelloWithoutThread {

	private String name = null;
	
	public HelloWithoutThread(String n) {
		name = n;
	}
	public void runtest() {
		for (int i =1; i<=5; i++) 
			System.out.println(i + "Hello thread : " + name);
	}
}
