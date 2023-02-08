package regex;

public class Number_Range {

	public static void main(String[] args) {
		
		/*
		 * Create a RegEx pattern to represent following number ranges
		 * 1. 0-99
		 * 2. 0-1000
		 * 3. 99-9999
		 * 4. 25-75
		 * 5. 220-240
		 */
		
		String patt = "[0-9][0-9]?";
		String str = "67";
		System.out.println(str.matches(patt));
		
		
		String patt1 = "[0-9][0-9]?[0-9]?|1000";
		String str1 = "999";
		System.out.println(str1.matches(patt1));
		
		
		String patt2 = "99|[0-9]+[0-9]+[0-9]+[0-9]?";
		String str2 = "99";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "2[5-9]|[3-6][0-9]|7[0-5]";
		String str3 = "13";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "2[2-3][0-9]|240";
		String str4 = "222";
		System.out.println(str4.matches(patt4));





	}

}
