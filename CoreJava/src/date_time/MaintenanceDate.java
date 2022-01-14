package date_time;

import java.util.Calendar;

public class MaintenanceDate {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println("The installation date is "+ cal.getTime());
		System.out.println("");
		for (int i=1; i<=12; i++) {
			cal.add(cal.DATE,+30);
			System.out.println("The "+i+" Service Date is:"+ cal.getTime());
		}
	}

}
