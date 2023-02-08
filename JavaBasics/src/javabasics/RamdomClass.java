package javabasics;

import java.util.Random;

public class RamdomClass {

	public static void main(String[] args) {
		
		Random r1 = new Random();
		// by using this we can print 100 random numbers
		
		
		for (int i =0 ; i< 100; i++) {
			System.out.println(r1.nextInt(1000));
		}
	}

}
