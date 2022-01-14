package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSortByPhyMarks {
	
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet();
		m1.setRollNo("3");
		m1.setFname("Rohan");
		m1.setLname("Jaiswal");
		m1.setPhy(98);
		m1.setChe(97);
		m1.setMath(100);
		
		Marksheet m2 = new Marksheet();
		m2.setRollNo("5");
		m2.setFname("Vijay");
		m2.setLname("Verma");
		m2.setPhy(45);
		m2.setChe(85);
		m2.setMath(72);
		
		Marksheet m3 = new Marksheet();
		m3.setRollNo("2");
		m3.setFname("Sandeep");
		m3.setLname("Tripathi");
		m3.setPhy(61);
		m3.setChe(65);
		m3.setMath(80);
		
		Marksheet m4 = new Marksheet();
		m4.setRollNo("1");
		m4.setFname("Aman");
		m4.setLname("Gangale");
		m4.setPhy(75);
		m4.setChe(55);
		m4.setMath(43);
		
		Marksheet m5 = new Marksheet();
		m5.setRollNo("4");
		m5.setFname("Nitesh");
		m5.setLname("Sharma");
		m5.setPhy(83);
		m5.setChe(76);
		m5.setMath(89);
		
		ArrayList l = new ArrayList();
		
		l.add(m1);
		l.add(m2);
		l.add(m3);
		l.add(m4);
		l.add(m5);
		
		Collections.sort(l,new SortByPhyMarks());
		
		Iterator <Marksheet>it = l.iterator();
		
		while(it.hasNext()) {
			Marksheet m = it.next();
			System.out.println(m.getRollNo()+" "+m.getFname()+" "+m.getLname()+" "+m.getPhy()+" "+m.getChe()+" "+m.getMath());
		}
	}

}

