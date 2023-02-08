package oopsconcepts;

public class ClassRoom {
	
	private String Sub;
	private int Stdcount;
	
	public String getSub() {
		return Sub;
	}

	public void setSub(String sub) {
		this.Sub = sub;
	}

	public int getStdcount() {
		return Stdcount;
	}

	public void setStdcount(int stdcount) {
		this.Stdcount = stdcount;
	}
	
	public void displaydetails() {
		System.out.println("This is a "+ Sub + " classroom and it has " + Stdcount +" students");
	}

}
