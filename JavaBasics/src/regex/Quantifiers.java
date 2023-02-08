package regex;

public class Quantifiers {

	public static void main(String[] args) {
		
		/*
		 * 1. * - Matches 0 or more instances of preceding character
		 * 2. + - Matches 1 or more instances of preceding character
		 * 3. ? - matches 0 or 1 instances of preceding character
		 * 4. {n} - Matches exactly 'n' number instances or preceding character
		 * 5. {n,m} - Matches minimum 'n' or maximum 'm' instances of preceding character
		 * 6. {n,} - Matches minimum 'n' or more instances of preceding character
		 * 
		 */
		
		String patt ="abc*";
		String str1 = "abc";
		System.out.println(str1.matches(patt));
		
		String patt1 = "abc+";
		String str2 = "abc";
		System.out.println(str2.matches(patt1));
		
		String patt2 = "abc?";
		String str3 = "abc";
		System.out.println(str3.matches(patt2));
		
		String patt3 ="ab(xyz)?";
		String str4 = "abxyz";
		System.out.println(str4.matches(patt3));
		
		String patt4 ="ab(xyz)+";
		String str5= "abxyz";
		System.out.println(str5.matches(patt4));
		
		String patt5 ="ab(xyz){3}"; // xyz needs to be repeated 3 times
		String str6= "abxyz";
		System.out.println(str6.matches(patt5));
		
		String patt6 ="ab(xyz){2,6}"; // xyz needs to be repeated minimum of 2 times
		                               // and maximum of 6 times
		String str7= "abxyzxyz";
		System.out.println(str7.matches(patt6));
		
		String patt7 ="ab(xyz){3,}"; // xyz needs to be repeated minimum of 3 times
		                              // max is not known
		String str8= "abxyz";
		System.out.println(str8.matches(patt7));
		
		

		
		
	}

}
