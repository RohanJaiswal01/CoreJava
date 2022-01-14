package java8;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("Hello");
		l.add("Java");
		l.add("OOP");
		l.add("HTML");
		
		l.forEach(li -> System.out.println(li));//forEach() used with lembda expression
	}
}
