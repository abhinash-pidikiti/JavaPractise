package regex;

public class RegEx_Example_1 {

	public static void main(String[] args) {
		
		/*
		 * Create a regEx pattern to represent following web sites
		 * 1.www.delzlearn.com
		 * 2.www.dezlearn.us
		 * 3.www.dez.com
		 * 4.www.dez.us
		 */
		
		String patt = "www\\.(dezlearn|dez)\\.(com|us)";
		
		String str1 = "www.dezlearn.com";
		
		String str2 = "www1dezlearn.com";
		
		System.out.println(str1.matches(patt));
		System.out.println(str2.matches(patt)); // in place of dot we added one but we are
		                                        // getting true for this we need to use //

	}

}
