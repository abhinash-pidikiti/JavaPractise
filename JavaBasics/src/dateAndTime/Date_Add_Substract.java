package dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date_Add_Substract {

	public static void main(String[] args) {
		
		/*
		 * 1.Plus / Minus Methods
		 * 2.chronoUnit
		 */
		
		LocalDate d1 = LocalDate.now(); // returns today date
		
		LocalDate d2 =LocalDate.now().plusMonths(3); // returns date 3 months today
		
		System.out.println(d2);
		
		LocalDate d3 =LocalDate.now().minusMonths(3);
		System.out.println(d3);
		
		LocalDate d4 = LocalDate.now().minus(10, ChronoUnit.DECADES);
		
		System.out.println(d4);
		
		LocalDate d5 = LocalDate.now().plus(10, ChronoUnit.DECADES);
		
		System.out.println(d5);
		

	}

}
