package oopsconcepts;

public class BankAccount {
	
	private long acNo;
	private String acName;
	private double acBalance;
	
	
	public void deposit(double amt) {
		
		if(amt >0) {
			acBalance = acBalance+amt;
			System.out.println("Successfully deposited $"+ amt);
		}
		else {
			System.out.println("can not depositn" + amt);
		}
		
	}
	public void withdraw(double amt) {
			
			if(amt >0) {
				acBalance = acBalance-amt;
				System.out.println("Successfully withdraw $" + amt);
			}
			else {
				System.out.println("can not withdraw" + amt);
			}
			
		}
	public void displayCurrentBalance() {
		System.out.println("Your current balance is $" + acBalance);
	}
	
	public BankAccount(long acNo, String acName, double acBalance) {
		this.acNo = acNo;
		this.acName = acName;
		this.acBalance= acBalance;
				
		
	}

	

}
