package ObjectDataIO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class EmployeeSerialization implements Serializable/*, Externalizable */{
	//serialization used to send object data*
    //Externalizable used to send Transient data
	//Externalizable first call serializable interface//no need to implement Serializable
	
	private int id;
	private String fname;
	private String lname;
	private double salary;
	private transient int temp;//transient used to not serialized data
	
	public EmployeeSerialization() {}
	
	public EmployeeSerialization(int id,String fname,String lname,double salary,int temp) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.temp = temp;
	}

	public int getId() {
		return id;
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

	public int getTemp() {
		return temp;
	}
/*
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	 
		temp = in.readInt();// Deserialize transient variable
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeInt(temp);//Serialize transient variable
		
	}
*/
}
