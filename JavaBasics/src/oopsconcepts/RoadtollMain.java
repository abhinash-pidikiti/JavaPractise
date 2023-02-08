package oopsconcepts;

public class RoadtollMain {

	public static void main(String[] args) {
		
		RoadToll rt1 = new RoadToll();
		
		rt1.type = "sedan";
		rt1.tiresCount = 4;
		rt1.calculateToll();
		
		RoadToll rt2 = new RoadToll("Truck",6);
		rt2.calculateToll();
		

	}

}
