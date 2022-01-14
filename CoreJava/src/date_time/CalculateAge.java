package date_time;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate dob = LocalDate.of(2000, 2, 4);
		Period dif = Period.between(dob,today);
		System.out.println(dif.getYears()+" Years "+ dif.getMonths()+" Months");
	}
}
