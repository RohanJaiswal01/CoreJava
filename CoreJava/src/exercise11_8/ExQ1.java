package exercise11_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExQ1 {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	list.add(1);
	list.add(4);
	list.add(8);
	list.add(2);
	list.add(1);
	
	Iterator it = list.iterator();
	
	while(it.hasNext()) {
		int i =(int) it.next();
		System.out.println(i);
	}
	}
	
	
	

}
