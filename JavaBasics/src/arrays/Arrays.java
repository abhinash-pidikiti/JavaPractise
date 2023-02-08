package arrays;

public class Arrays {
	
	public static void main(String[] args) {
		
		/*
		 * what is an array?
		 * An array is the collection of similar data types
		 * 
		 * how to declare an array?
		 * what is length of array?
		 * How to update array elements?
		 * Iterating on array elements using for loop.
		 */
		
		String [] DaysofWeek = {"Mon","Tue","Wed","Thu","fri","Sat","Sun"};
		
		//we can not add elements to the array.
		
		System.out.println(DaysofWeek.length);
		System.out.println(DaysofWeek[1]);
		DaysofWeek[1] = "Abhi";
		System.out.println(DaysofWeek[1]);
		
		//System.out.println(DaysofWeek[10]);
		
		for (int i=0;i<=DaysofWeek.length - 1;i++) {
			System.out.println(DaysofWeek[i]);
		}
		
		
		
	}

}
