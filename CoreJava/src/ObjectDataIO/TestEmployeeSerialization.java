  package ObjectDataIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeSerialization {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("D:/Test/object.ser");
		ObjectOutputStream in = new ObjectOutputStream(file);
		
		EmployeeSerialization emp = new EmployeeSerialization(15, "Vijay", "Verma", 20000.00, 123);
		
		in.writeObject(emp);
		in.close();
		System.out.println("Obejct is successfully persisted");
		
		FileInputStream file1 = new FileInputStream("D:/Test/object.ser");
		ObjectInputStream out = new ObjectInputStream(file1);
		
		EmployeeSerialization emp1 = (EmployeeSerialization)out.readObject();
		
		System.out.println("ID : "+ emp1.getId());
		System.out.println("First Name : "+ emp1.getFname());
		System.out.println("Last Name : "+ emp1.getLname());
		System.out.println("Salary : "+ emp1.getSalary());
		System.out.println("Temp : "+ emp1.getTemp());// after Externalizable we see transient value
	}
	
}
		