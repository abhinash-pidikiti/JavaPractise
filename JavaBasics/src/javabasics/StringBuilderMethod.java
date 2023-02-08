package javabasics;

public class StringBuilderMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * some useful methods from StringBuilder
		 * insert, replace, delete, reverse
		 */

		StringBuilder sb1 = new StringBuilder("Learning is fun ");
		
		sb1.insert(9, "java ");
		
		System.out.println(sb1);
		
		sb1.replace(9, 13, "Everything");
		System.out.println(sb1);
		
		String str1 = "AAaBBAAHAJAUAHAAuyta";
		System.out.println(str1.replace("AA", "@"));
		
		
		System.out.println(sb1.deleteCharAt(5)); // deleting a character in a string
		
		System.out.println(sb1.delete(5, 10));
		
		System.out.println(sb1.reverse());
		
	}

}
