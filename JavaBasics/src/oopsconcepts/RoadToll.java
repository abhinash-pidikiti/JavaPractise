package oopsconcepts;

public class RoadToll {
	
	String type;
	int tiresCount;
	
	public void calculateToll() {
		if(tiresCount == 2) {
			System.out.println("Your toll Amount is 0");	
		}
		else if(tiresCount==4) {
			System.out.println("your toll amount is 10");
		}
		else if(tiresCount>4) {
			System.out.println("your toll amount is 20");
			
		}
		else {
			System.out.println("incorrect tire count");
			
		}
			
	}
	// creating constructor

	public RoadToll() {
		
	}
	public  RoadToll(String type, int tiresCount) {
		this.type= type;
		this.tiresCount = tiresCount;
	}

}
