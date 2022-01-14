package date_time;
import java.util.Date;
import java.util.Calendar;

public class DateTime {

	public static void main(String[] args) {
		
	Date today = new Date();
	System.out.println("today "+ today);
	Calendar cal = Calendar.getInstance();
	System.out.println(cal);
	
	}
}
