package exceptionHandling;

public class Catch_Try_Catch {

	public static void main(String[] args) {

		try {
			double div = 15 / 0;
			System.out.println(div);
		} catch (ArithmeticException e) {

			System.out.println("You can not divide by zero");

			try {
				String s = "java";
				System.out.println(s.length());
				System.out.println(s.charAt(4));

			} catch (NullPointerException | IndexOutOfBoundsException e1) {
			
				System.out.println(e1.getMessage());
			}

		}

	}
}
