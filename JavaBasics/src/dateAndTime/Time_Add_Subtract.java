package dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time_Add_Subtract {

	public static void main(String[] args) {
		
		/*
		 * Plus / Minus
		 * ChronoUnit
		 */
		
		LocalTime t1 = LocalTime.now().plusHours(1);
		System.out.println(t1);

		
		LocalTime t2 = LocalTime.now().minusHours(1);
		System.out.println(t2);
		
		LocalTime t3 = LocalTime.now().plus(5, ChronoUnit.MINUTES);
		System.out.println(t3);

	}

}
