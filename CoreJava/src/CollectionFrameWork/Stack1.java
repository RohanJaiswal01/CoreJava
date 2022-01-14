package CollectionFrameWork;

import java.util.*;

public class Stack1 {
	public static void main(String[] args) {

		Stack s = new Stack();

		for (char i = 'A'; i <= 'Z'; i++) {

			System.out.println(s.push(i));
		}

		Stack s1 = new Stack();

		int k = s.size();

		for (int j = 1; j <= k; j++) {

			s1.push(s.pop());

		}
		System.out.println(s1);
		

		
		  System.out.println(s1.size());
		 
		  for (int z =s1.size();z>0; z--) {
		  
		  s1.pop(); 
		  }
		  
		  System.out.println(s1);
		 
	}
}
