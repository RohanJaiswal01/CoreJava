package java8;

public class TestHelloIntf {
	
	public static void main(String[] args) {
		
		HelloIntf h1 = new HelloIntf() {

			@Override
			public void say() {
				
				System.out.println("Hello Anonymous function");				
			}
			};h1.say();
		
			//lembda expresion syntex () -> {};
    	HelloIntf h = () -> { 		
		System.out.println("Hello Lembda Expresion function");
		};
		h.say();

	}
}
