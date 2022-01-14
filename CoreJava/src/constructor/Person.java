package constructor;

public  class Person {
	
	    protected String firstname;
		protected String lastname;
		protected String address;

		public Person() {
			System.out.println("Person Default constructor");
		}
		public Person(String fn, String ln){
			//constructor can call another constructor
			
		    this();//calling defalut constructor
			firstname = fn;
			lastname = ln;
			System.out.println("Person 2 params constructor is called ");
		}
		
		public void changeAddress() {
			System.out.println("Person change address");
		}
		
		
	  
	}

