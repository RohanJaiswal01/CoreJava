package constructor;

public class TestPerson {
	public static void main(String[] args) {
		
		Person p = new Employee();
		
		Person p1 = new Employee("Amar","chouhan",10000);
		
		p.changeAddress();//call Employee address bcoz Employee gets memory
			
	}

} 
