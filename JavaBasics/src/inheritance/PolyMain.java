package inheritance;

public class PolyMain {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		t1.setBaseHeight(10.0,20.98);
		
		t1.calarea();
		
		Rectangle r1 = new Rectangle();
		r1.setBaseHeight(20.98, 34.987);
		r1.calarea();

	}

}
