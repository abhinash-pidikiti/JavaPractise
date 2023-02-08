package oopsconcepts;

public class Access_Specifiers {
	
	
	
	public int a = 100;public //can be accessed from everywhere outside of the class and package as well
    // global access for public.
	 int b= 200; // default can be accessed in the class and the same package
	 private int c = 300;  //  it will be accessed inside the class only.
	 
	 //protected is accessed in same class and package 

	
	
	public void doThisPublic() {
		System.out.println("This is a public Method");
	}
	
	private void doThisPrivate() { // private is limites to only to the class it is decalred.
		System.out.println("This is a private Method");
	}
	
	void doThisDefault() {
		System.out.println("This is default method");
	}

}
