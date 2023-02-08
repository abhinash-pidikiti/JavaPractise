package regex;

public class Character_Classes {

	public static void main(String[] args) {
		
		/*
		 * 1. \d - matches a single digit character =>0-9
		 * 2. \w - matches a single word character => A-Z a-z _ 0-9
		 * 3. \s - matches a single whitespace character
		 * 4. \D - matches a single non-digit character
		 * 5. \W - matches a single non-digit and non-word character
		 */

		String patt ="\\d";// d{3} it represents 3 digit number
		String str1 = "6";
		System.out.println(str1.matches(patt));
		
		String patt1 ="\\w{4}";// w{4} it represents 4 words
		String str2 = "Aa_1";
		System.out.println(str2.matches(patt1));
		
		String patt2 ="\\s";// d{3} it represents 3 digit number
		String str3 = " ";
		System.out.println(str3.matches(patt2));
		
		String patt3 ="\\D{2,11}";// opposite to /d
		String str4 = "ABcd";
		System.out.println(str4.matches(patt3));
		
		String patt4 ="\\W{2,11}";//  special characters
		String str5 = "!@#$%^&*()";
		System.out.println(str5.matches(patt4));
		
		
		//EXERCISE
		
		String patt5 ="678\\d{7}";
		String str6 = "6781234567";
		
		System.out.println(str6.matches(patt5));
		
		String patt6 = "\\D{2,6}\\W{2}";
		String str7 = "ABHINA@!";
		
		System.out.println(str7.matches(patt6));
		
		
		
		
		
	}

}
