package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSortByFname {
	
			
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
			m2.setPhy(98);
			m2.setChe(97);
			m2.setMath(100);
			
			Marksheet m3 = new Marksheet();
			m3.setRollNo("2");
			m3.setFname("Sandeep");
			m3.setLname("Tripathi");
			m3.setPhy(98);
			m3.setChe(97);
			m3.setMath(100);
			
			Marksheet m4 = new Marksheet();
			m4.setRollNo("1");
			m4.setFname("Aman");
			m4.setLname("Gangale");
			m4.setPhy(98);
			m4.setChe(97);
			m4.setMath(100);
			
			Marksheet m5 = new Marksheet();
			m5.setRollNo("4");
			m5.setFname("Nitesh");
			m5.setLname("Sharma");
			m5.setPhy(98);
			m5.setChe(97);
			m5.setMath(100);
			
			Marksheet m6 = new Marksheet();
			m6.setRollNo("8");
			m6.setFname("Nitesh");
			m6.setLname("Malviya");
			m6.setPhy(94);
			m6.setChe(57);
			m6.setMath(76);
			
			Marksheet m7 = new Marksheet();
			m7.setRollNo("6");
			m7.setFname("Aman");
			m7.setLname("Chouhan");
			m7.setPhy(85);
			m7.setChe(72);
			m7.setMath(68);
			
			Marksheet m8 = new Marksheet();
			m8.setRollNo("7");
			m8.setFname("Arpit");
			m8.setLname("Paliwal");
			m8.setPhy(95);
			m8.setChe(98);
			m8.setMath(100);
			
			
			ArrayList l = new ArrayList();
			
			l.add(m1);
			l.add(m2);
			l.add(m3);
			l.add(m4);
			l.add(m5);
			l.add(m6);
			l.add(m7);
			l.add(m8);
			
			
			Collections.sort(l,new SortByFname());
			
			Iterator <Marksheet>it = l.iterator();
			
			while(it.hasNext()) {
				Marksheet m = it.next();
				System.out.println(m.getRollNo()+" "+m.getFname()+" "+m.getLname()+" "+m.getPhy()+" "+m.getChe()+" "+m.getMath());
			}
		}

	}


