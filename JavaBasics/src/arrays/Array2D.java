package arrays;

public class Array2D {

	public static void main(String[] args) {
		/*
		 * what is 2d array
		 * how to get length of 2d array
		 * how to add elements to 2d array
		 * how to retrieve elements from 2d array
		 * how to update elements of 2d array
		 * how to iterate over 2d array using modified for loop
		 */

		String[][] arr = {{"A","B","C"},
				          {"D","E"},
				          {"SDF","FG","FG","JH"}
		};
		System.out.println(arr[1][1]);
		System.out.println(arr.length); // we will get the no of rows
		System.out.println(arr[2].length);
		arr[1][1]="RRR";
		System.out.println(arr[1][1]);
		
		for(String[] x:arr) {
			for(String y:x) {
				System.out.println(y);
			}
			System.out.println("___________________");
			
		}
	}

}
