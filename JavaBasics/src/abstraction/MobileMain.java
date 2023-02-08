package abstraction;

public class MobileMain {

	public static void main(String[] args) {
		
		Mobile m;
		 m = new IOS();
		 m.doubleTap();
		 
		 m = new Android();
		 m.doubleTap();

	}

}
