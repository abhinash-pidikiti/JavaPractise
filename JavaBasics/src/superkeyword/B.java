package superkeyword;

public class B extends A{
	int num1 = 200;
	
	public void doThis() {
		System.out.println("Do this From B");
	}
	
	public void xyz() {
		System.out.println(super.num1);
		super.doThis();
		doThis();
		System.out.println("xyz Executed");
	}
	

}
