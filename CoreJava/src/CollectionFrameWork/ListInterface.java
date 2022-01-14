package CollectionFrameWork;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.corejava.Array;

public class ListInterface {
	
	public static void main(String[] args) {
		
		List l = new LinkedList<>(); 
		
		l.add(1);
		l.add("java");
		l.add('A');
		System.out.println(l);
		for(Object o: l) {
			System.out.println(o);
		}
		l.add(2,"C++");
		System.out.println(l);
		System.out.println(l.get(1));
		System.out.println(l.remove(1));
		System.out.println(l);
		l.set(1, "rohan");//remove index element(object) and set new element
		System.out.println(l);
		System.out.println(l.subList(0,2));//return sublist portion fromindex inclusive and toindex exclusive 
	    System.out.println(l.indexOf('A'));//Search element from start return index
	    System.out.println(l.lastIndexOf("rohan"));// search elements from end and return index
	 
	    // with arrayList class
	   List a = new ArrayList<>();
	   
	   a.addAll(l);
	   System.out.println(a);
	   
	   // ListInterface with Stack
	   
	   Stack s = new Stack();
	   
	   s.push(12);
	   s.push("a");
	   s.push("java");
	   s.push(2.35);
	   System.out.println(s);
	   s.pop();
	   System.out.println(s);
	  
	   System.out.println(s.peek());
	   System.out.println(s);
	   
	   Object o = s.peek();
	   System.out.println(o);
	}

}
