package exceptions;

public class Intro {

	public static void main(String[] args) {
		
		/*
		 * 1. what is an Exception?
		 *    Exceptions are events which occur during the execution of programs
		 *    that disrupt the normal flow of the applications.
		 *    e.g :- String Index out of Boundaries, Dividing by zero, Null Pointer
		 *    
		 *    
		 * 2. What is exception Object ?
		 * 
		 *    An exception Object is an instance of an executing class. it gets created and
		 *    handed over to the java runtime when an exceptional event occurs.
		 *    
		 *    Exception Object contains:
		 *      a) Information about the error
		 *      b) The state of the program
		 */
		
		String x = null;
		
		System.out.println(x.length());
		
		System.out.println("Hello world");

	}

}
