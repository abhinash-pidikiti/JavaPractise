package inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		
//		Dog d = new Dog();
//		d.whoAmI();
//		
//		Cat c = new Cat();
//		c.whoAmI();
		
		
//		This the example for Polymorphism
		
		Animal a;
		a = new Animal();
		a.whoAmI();
		
		a = new Dog();
		a.whoAmI();
		
		a=new Cat();
		a.whoAmI();

	}

}
