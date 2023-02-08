package oopsconcepts;

public class Methods {

	public static void main(String[] args) {
		
		Methods m = new Methods();
		m.doThis();	
		m.addition(10, 20);
		int x=m.multiplication(22, 2);
		System.out.println(x);

	}
	
	public void doThis() {
		System.out.println("doThis Exexuted");
	}
	
	public void addition(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public int multiplication(int num1, int num2) {
		int num3 = num1+num2;
		return num3;
	}
	

}
