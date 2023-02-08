package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatter {

	public static void main(String[] args) {
		
		/*
		 * yyyy - YEAR
		 * yy - YEAR
		 * MM  - MONTHS
		 * MMM- MONTHS
		 * dd - DAY
		 */
		
		String str1= "2015-01-12"; // This the correct way
		//String str1 = "12-01-2015"; // this can not be converted for this we need to use dtae formatter
		LocalDate d1 = LocalDate.parse(str1);
		System.out.println(d1);
		
		String str2 ="12-05-2015";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MMM-dd-yyyy");
		
		LocalDate d2 = LocalDate.parse(str2, formatter);
		
		System.out.println(d2);
		
		
	}

}
