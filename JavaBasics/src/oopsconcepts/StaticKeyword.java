package oopsconcepts;

public class StaticKeyword {
	
	/*
	 * Static keyword
	 * Static Members belong to a class (type) and not to object.
	 */

	static String name = "ABC";
	byte age = 6;
	String grade = "1st";
	
	public void display() {
		System.out.println("Student "+name+" is "+age+" Years old and in "+grade+" grade");
	}
	
	
	public static void dothis() {
		System.out.println("Do this executed");
		
		
	}
}
