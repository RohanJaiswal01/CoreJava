package com.interfac;

public class Person {
	
	public String firstname;
	public String lastname;
	public String address;

	public Person() {
		System.out.println("Person Default constructor");
	}
	public Person(String fn, String ln){
	    this();//calling defalut constructor
		firstname = fn;
		lastname = ln;
		System.out.println("Person 2 params constructor is called "+firstname+lastname);
	}
	public Person(String fn, String ln, String add) {
		
		//constructor can call another constructor
		this(fn,ln);//calling 2 parameterised constructor
		address = add;
		System.out.println("Person 3 params constructor is called "+firstname+lastname+address);
	}
	  public static void main(String[]args) {
	    	
	    	Person p = new Person();
	    	
	    	Person p1 = new Person("Rohan","Jaiswal");
	     	
	    	Person p2 = new Person("Rohan","Jaiswal","Indore");
	    }

    
}