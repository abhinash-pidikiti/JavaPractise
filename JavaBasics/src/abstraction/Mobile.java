package abstraction;

public abstract class Mobile {
	
	// it cannot be instantiated with new keyword.
	//no one can create the object of the class.
	
	/*
	 * 4 pillars of OOPS
	 * 1.Encapsulation // it is the process of hiding the data from the user by creating the
	 *                    capsules,look like capsule methods which are getters and setters
	 *                    
	 * 2.Inheritance // it is the processes of inheriting from a class and using the features 
	 *                   of the parent that enhances the reusability of the code.
	 *                   
	 * 3.Polymorphism // it is the ability of an object to get into multiple forms
	 *                   poly means many morpheus is the forms or shapes.
	 *                   
	 * 4.Abstraction // it is the process of hiding the implementation details from the user
	 *                   and provide only the functionalities.
	 *                   
	 *               // a method is called abstarct method when there is no implementation 
	 *               added to it.
	 *               abstarct method can be added inside an abstarct class.
	 *               
	 *               Abstraction can be done by two ways abstract classes and abstract methods.
	 *               and second by interfaces.
	 */
	
	public abstract void doubleTap();
			

}
