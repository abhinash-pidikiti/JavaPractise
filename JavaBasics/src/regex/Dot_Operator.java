package regex;

public class Dot_Operator {

	public static void main(String[] args) {
		
		/*
		 * (DOT) '-' -> Matches Any Single Character
		 */

		String patt = "ABC.";
		String str1 = "ABCr";
		
		String patt1 = "ABC.*";
		String str2 = "ABCdhyetefhfjfj15";
		
		System.out.println(str1.matches(patt));
		System.out.println(str2.matches(patt1));
	}

}
