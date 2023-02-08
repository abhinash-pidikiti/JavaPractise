package oopsconcepts;

public class Temp {

	public static void main(String[] args) {
		
		Cars c1 = new Cars();
		c1.color = "red";
		c1.make = "BMW";
		
		c1.displayDetails();
		
		
		Cars c2 = new Cars();
		
		c2.color = "Orange";
		c2.make = "Tayota";
		c2.type ="sedan";
		c2.displayDetails();
		
		// Method oveloading program
		MethodOverloading m2 = new MethodOverloading();
		m2.addition(10,20);
		m2.addition(12.2, 30);
		m2.addition(33.33, 44.44);
		m2.addition(31, 21.23);
		m2.addition(12,34, 55);
	

	}

}
