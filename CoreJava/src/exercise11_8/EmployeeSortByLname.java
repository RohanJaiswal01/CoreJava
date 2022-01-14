package exercise11_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EmployeeSortByLname implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getLname().compareTo(o2.getLname())==0) {
			return o1.getFname().compareTo(o2.getFname());
		}else {
			return o1.getLname().compareTo(o2.getLname());
		}
		
	}
		
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
			Collections.sort(l,new EmployeeSortByLname());
			
			Iterator<Employee> it = l.iterator();
			
			while (it.hasNext()) {
				
				Employee e = it.next();
				System.out.println(e.getEmpid()+" "+e.getFname()+" "+e.getLname()+" "+e.getSalary());
			}
			
		}

	}

	


