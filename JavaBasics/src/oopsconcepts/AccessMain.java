package oopsconcepts;

public class AccessMain {

	public static void main(String[] args) {
		
		Access_Specifiers ac = new Access_Specifiers();
		
		ac.doThisPublic(); // public can be accessed from everywhere outside of the class and package as well
		                   // global access for public.
		ac.doThisDefault(); // default can be accessed in the class and the same package
		//ac.doThisPrivate(); // not allowed to access. it will be accessed inside the class only.

	}

}
