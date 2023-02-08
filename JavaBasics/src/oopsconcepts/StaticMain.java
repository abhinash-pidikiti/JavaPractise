package oopsconcepts;

public class StaticMain {

	public static void main(String[] args) {
		
		StaticKeyword sk1 = new StaticKeyword();
		StaticKeyword sk2 = new StaticKeyword();
		
		StaticKeyword.name ="rob";
		sk1.grade= "2nd";
		sk1.age = 7;
		
		
		sk2.age = 8;
		sk2.grade ="3rd";
		StaticKeyword.name="shyam"; //overriding
		
		sk1.display();
		sk2.display();
		
		StaticKeyword.dothis(); // we can access static method by using the class name no 
		                       // need to create the object.

	}

}
