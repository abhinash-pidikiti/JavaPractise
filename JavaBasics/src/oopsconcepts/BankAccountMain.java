package oopsconcepts;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(123456,"Abhinash",100000);
		b1.displayCurrentBalance();
		b1.withdraw(1200);
		b1.displayCurrentBalance();
		b1.deposit(29876);
		b1.displayCurrentBalance();
		

	}

}
