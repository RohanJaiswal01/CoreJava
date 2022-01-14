package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
	  Vector v = new Vector();
	  
	  v.add(1);
	  v.add("java");
	  v.add('a');
	  v.add(5);
	  v.add(7);
	  
	  System.out.println("Default capacity of any collection :" +v.capacity());
	  //capacity grow double of vector size
	  System.out.println("Size of this collection:"+v.size());
	  
	  Iterator it = v.iterator();
	  //v.add(4); //fail-fast get exception. After create Iterator u can't modify collection
	  it.next();//to start with 0 index
	  it.remove();
	  while(it.hasNext()) {
		  Object o = it.next();
		  System.out.println(o);
	  }
		  
		 Enumeration e = v.elements();
		 v.add(6);//not fail-fast
		 v.add(15);
		 v.add(8);
		 v.add(9);
		 v.add(10);
		 v.add(11);
		 System.out.println("Size of this collection :"+v.size());
		 System.out.println("Capacity increse double of defult size :"+v.capacity());
		 
		 while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		 }
		 
		 Vector v1 = new Vector(15);
		 //In one parameterized constructor you can give capacity
		 System.out.println("Capacity : "+ v1.capacity());
		 v1.add(6);
		 v1.add(15);
		 
		 Vector v2 = new Vector(5,2);
		 //in 2 para constructor initial capacity 5 and then increase by 2
	     System.out.println("Capacity : "+ v2.capacity());
	     v2.add(1);
		 v2.add(2);
		 v2.add(3);
		 v2.add(4);
		 v2.add(5);
		 v2.add(6);
		 System.out.println("Capacity : "+ v2.capacity());
		 System.out.println("Size : "+ v2.size());

	}  
}

