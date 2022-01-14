package CollectionFrameWork;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {

	Set s = new HashSet();//HashSet shows elements in random order
	s.add("Java");
	s.add(1);
	s.add('e');
	s.add(2);
	s.add(5);
	s.add('a');
	s.add('z');
	s.add('s');
	s.add('c');
	s.add('r');
	s.add(null);
	s.add("Java");//Set contains only unique elements
	System.out.println(s);
	
	Set s1 = new TreeSet<>();//TreeSet Arrange all elements in Ascending order
	                         //TreeSet contains same type of elements
	//s1.addAll(s);
	System.out.println(s1);
	
	s1.add(15);
	s1.add(11);
	s1.add(18);
	System.out.println(s1);
	//s1.add('a');
	System.out.println(s1);
	}
}
