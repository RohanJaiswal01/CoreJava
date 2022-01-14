package exercise11_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	
	public static void main(String[] args) {
		
				
		Employee e1 = new Employee("EM0015","Nitesh","Sharma",20000.00);
		Employee e2 = new Employee("EM0017","Rohan","Jaiswal",50000.00);
		Employee e3 = new Employee("EM0022","Aman","Chouhan",35000.00);
		Employee e4 = new Employee("EM0031","Aman","Gangle",10000.00);
		Employee e5 = new Employee("EM0005","Sandeep","Tripathi",15000.00);
		Employee e6 = new Employee("EM0015","Amit","Sharma",20000.00);
		Employee e7 = new Employee("EM0005","Sandeep","Bapat",15000.00);


		
		ArrayList l = new ArrayList();
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		Collections.sort(l,new Employee());
		
		Iterator<Employee> it = l.iterator();
		
		while (it.hasNext()) {
			
			Employee e = it.next();
			System.out.println(e.getEmpid()+" "+e.getFname()+" "+e.getLname()+" "+e.getSalary());
		}
		
	}

}
