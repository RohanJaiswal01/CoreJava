import java.text.SimpleDateFormat;
import java.util.Date;
public class Testperson {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat();
		String sr=sdf.format(d);
		Person p=new Person();
		p.setname("amar");
		p.setaddress("indore");
		p.setdob(d);
		System.out.println();
		System.out.println(p.getaddress());
		System.out.println(p.getname());
		System.out.println(p.getdob());
		System.out.println(sr);
	}
	
}
