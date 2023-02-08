package oopsconcepts;

public class Employee {
	
	String empName = "ABC";
	int empId = 100;
	int empSalary = 1000;
	
	public void diaplayEmployeedonus() {
		System.out.println("Employee " + empName + " gets the onous of " + (empSalary *0.2));
	}

}
