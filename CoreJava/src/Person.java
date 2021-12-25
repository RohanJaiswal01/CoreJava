import java.util.Date;

public class Person {

	private String name;
	private String address;
	private Date dob;

	public Date getdob() {

		return dob;
	}

	public void setdob(Date dob) {
		this.dob = dob;
	}

	public void setname(String nam) {
		name = nam;
	}

	public String getname() {
		return name;

	}

	public void setaddress(String adrs) {

		address = adrs;
	}

	public String getaddress() {

		return address;
	}

}
