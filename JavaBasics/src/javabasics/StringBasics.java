package javabasics;

public class StringBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding two strings
		
		String str1 = "Abhi";
		String str2 = "nash";
		
		
		String str3 = str1+str2;
		System.out.println(str3);
		
		//anotherway by using concatmethod
		String str4=str1.concat(str2);
		System.out.println(str4);
		
		
		//finding the length of a string
		System.out.println(str1.length());
		
		//removing the spaces at the beginning and end of the string by using trim
		
		String str5 = "      qwert    ty uiuy    ";
		System.out.println(str5); //it prints string with the spaces 
		System.out.println(str5.trim()); // it removes the spaces at the beginning and ending
		
		
		//Uppercase
		System.out.println(str5.toUpperCase());
		
		//lowercase
		System.out.println(str5.toLowerCase());
		
		//checking the string empty or not
		System.out.println(str5.isEmpty());
		
		String str6 = "";
		System.out.println(str6.isEmpty());
		
		
		//checking two strings equal or not
		
		String str7 = "ABCDE";
		String str8 = "ABCDe";
		
		System.out.println(str7.equals(str8));
		System.out.println(str7.equalsIgnoreCase(str8));
		
		
		//using compareTo (if str1>str2 returns zero and if str1<str2 returns -value)
		System.out.println(str7.compareTo(str8)); // str8 is greater so returns - value
		
		System.out.println(str7.compareToIgnoreCase(str8)); // returns zero
		
		
		//Matches used for regular expressions
		// need to know about regular expressions
		
		String patt = "[A-Z]{1,}";
		System.out.println(str7.matches(patt));
		
		
		
		//STRING SEARCH OPERATIONS
		
		/* 
		 * contains
		 * starts with
		 * Ends with
		 * Index of
		 * Last index of
		 */
		
		 // contains it will check str2 in str1;
		
		String sso = "I love java and Selenium";
		String sso1 = "java";
		System.out.println(sso.contains(sso1)); //it is case sensitive
		
		System.out.println(sso.toLowerCase().contains(sso1.toLowerCase()));
		
		
		// string starts with
		System.out.println(sso.startsWith("I"));
		
		// ends with
		System.out.println(sso.endsWith("Selenium"));
		
		//Indexof
		
		System.out.println(sso.indexOf("love"));
		
		//last Indexof
		System.out.println(sso.lastIndexOf("and"));
		
		
		/*
		 * STRING SLICE
		 * 
		 * char at
		 * Substring
		 * split
		 */
		
		//char at
		
		String ss = "ABCDEF";
		
		System.out.println(ss.charAt(0));
		
		//write a program to reverse a string
		
		String rev = "Abhinash";
		String temp ="";
		
		for(int i = 0;i<rev.length()-1;i++) {
			temp = rev.charAt(i) +temp;
			
		}
		System.out.println(temp);
		
		
		//substring
		System.out.println(rev.substring(3));
		
		System.out.println(rev.substring(2, 5));
		
		System.out.println(rev.subSequence(2, 5));
		
		
		//split string
		
		String ss3 = "A_B_H_I";
		String ss4= "_";
		
		String[] arr = ss3.split(ss4);
		for(String x : arr) {
			System.out.println(x);
		}
		
		
		
		//STRING REPLACE OPERATIONS
		
		/*
		 * Replace - normal
		 * ReplaceAll - Regx
		 */
		
		
		//Replace - normal
		
		String SRO = "Concentrat1234on 1234mproves W1234th pract1234ce";
		String SRO1 = "1234";
		String SRO2 = "i";
		
		System.out.println(SRO.replace(SRO1, SRO2));
		
		
		//ReplaceAll
		String Ra = "Eit#$%h%er Y%$#ou  Con%$#*trol YO*%$ur Min%4N%4d";
		String ra1 ="[^A-Za-z0-9\\s]";
		
		System.out.println(Ra.replaceAll(ra1, "")); // all the special characters will be replaced
		
		
		/*
		 * STRING CONVERSION OPERATIONS
		 * 
		 * toString
		 * toBinaryString
		 * toHexString
		 * toOctalString
		 * parseInt
		 * 
		 * 
		 */
		
		int num =100;
		System.out.println(Integer.toString(num));
		System.out.println(Integer.toBinaryString(num));
		System.out.println(Integer.toHexString(num));
		System.out.println(Integer.toOctalString(num));
		
		
		//converting string to a interger
		String str11 ="100";
		String Str12 = "1010101";
		String str13 = "64";
		String str14 = "144";
		
		System.out.println(Integer.parseInt(str11));
		System.out.println(Integer.parseInt(Str12, 2));
		System.out.println(Integer.parseInt(str13, 16));
		System.out.println(Integer.parseInt(str14, 8));
		
				
				
		
		
		

	}

}
