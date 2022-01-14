package java8;

@FunctionalInterface
public interface Addition {

	public int add (int a, int b);
	
	public default void defMethod() {
		System.out.println("Test Default");
	}
	public static void staticMethod() {
		System.out.println("Static");
	}
}
