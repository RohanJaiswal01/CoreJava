package exercise11_8;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	private String empid;
	private String fname;
	private String lname;
	private double salary;
	
	public Employee() {
		
	}
	public Employee(String empid,String fname,String lname,double salary) {
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		
	}
	public String getEmpid() {
		return empid;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o2.getSalary()-o1.getSalary());
	}
	
	
	

}
