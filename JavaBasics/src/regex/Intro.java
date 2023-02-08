package regex;

public class Intro {

	public static void main(String[] args) {
		
		/*
		 * What is regular expression?
		 * A regular expression (regex) defines a search pattern for strings.
		 * The pattern can be a simple character, a fixed string or a
		 * complex expression containing special characters, numbers etc.
		 */
		
		String str1 = "+1-678-675-(8765)";
		
		//String str2 = str1.replace("+", "").replace("-", "").replace("(", "").replace(")", "");
		
		String patt ="[^A-Za-z0-9]";
		
		String str3 = str1.replaceAll(patt, "");
		
		System.out.println(str3);

	}

}
