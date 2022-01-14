package CollectionFrameWork;

public class Marksheet implements Comparable<Marksheet> {
	
	private String rollNo;
	private String fname;
	private String lname;
	private int phy;
	private int che;
	private int math;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getChe() {
		return che;
	}
	public void setChe(int che) {
		this.che = che;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public int compareTo(Marksheet o) {
		return this.rollNo.compareTo(o.rollNo);
	}

	/*@Override
	public int compareTo(Object o) {
		
		return this.rollNo.compareTo(rollNo);//comapreTo()used to compare String
	}*/
	
	

}
