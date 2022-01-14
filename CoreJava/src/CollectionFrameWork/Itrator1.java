package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itrator1 {
	
	public static void main(String[] args) {
		
	ArrayList l = new ArrayList<>();
	
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(6);
	l.add(7);
	System.out.println(l);
	
	Iterator it = l.iterator();//gets an iterator
   //interface    //method
	
	while (it.hasNext()) {
		
		Object o = it.next();// get next element
		System.out.println(o);
		//or to convert object in string
		//System.out.println(o.toString());
		
		//int o1 = (int) it.next();// TypeCaste
		//System.out.println(o1);

	}
}	

}
