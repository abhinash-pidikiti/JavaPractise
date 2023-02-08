package regex;

public class Bracket_Expressions {

	public static void main(String[] args) {
		
		/*
		 * 1.Adding literals in brackets [aeiou]
		 * 2.Adding ranges in brackets [A-z0-9]
		 * 3.Usage 0f'^' in brackets [^a-z]
		 */
		
		String patt ="[cmbh]at"; // => cat,mat,bat,hat
		String str1 = "cat";
		
		System.out.println(str1.matches(patt));
		
		String patt1 ="[A-Z0-9]at"; // => Aat,Bat,Cat,Hat,......Zat;,0at...
		String str2 = "Bat";
		
		System.out.println(str2.matches(patt1));
		
		String patt2 ="[^A-Za-z0-9_]at"; // => Apart from A-Z
		String str3 = "cat";
		
		System.out.println(str3.matches(patt2));
		
		
		
		
		

	}

}
