package dateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class Date_Difference {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.of(1947, 8, 15);
		
		Period p = Period.between(d1, LocalDate.now());
		
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears());
		
		System.out.println(p.toTotalMonths());

	}

}
