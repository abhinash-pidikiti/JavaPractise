package javabasics;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s = sc1.nextLine();
		
		StringBuilder sb1 = new StringBuilder(s);
		sb1.reverse();
		
		
		System.out.println(sb1);

	}

}
