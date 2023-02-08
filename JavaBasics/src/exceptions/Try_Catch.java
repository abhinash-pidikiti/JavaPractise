package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Catch {

	public static void main(String[] args) {
		
		abc();
		System.out.println("Hello World");

	}
	public static void abc() {
		
		try {
			FileInputStream x = new FileInputStream("Users/md/Downlods/abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
