package oopsconcepts;

public class MethodOverloading {
	
// having the same method name and different data types of arguments or no of arguments
	// or order of arguments
	
	public void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void addition(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void addition(int num1, double num2) {
		System.out.println(num1+num2);
	}
	
	public void addition(double num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void addition(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}

	
	

}
