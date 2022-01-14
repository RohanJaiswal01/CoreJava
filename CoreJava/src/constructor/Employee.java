package constructor;

public class Employee extends Person {

	private float salary = 0;
	
	public Employee() {
		System.out.println("employee default");
	}
	public Employee(String name, String ln, float sal) {
		// super keyword use to call parent class constructor
		super (name,ln);
		salary = sal;
		System.out.println("Employee details "+ firstname+" "+ lastname+" "+ salary);
	}
	public void changeAddress() {
	//call Parents overridden method with the help super keyword
		super.changeAddress();
		System.out.println("Employee change address");
	}
}
