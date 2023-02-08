package arrays;

public class ArrayExercise {

	public static void main(String[] args) {
	
		//Write a program to reverse an array

		int [] arr = {10,20,30,40,50,60,30,43};
		
		for (int i = arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		
		// another way
		
//		int j= arr.length-1;
//		int temp = 0;
//		
//		for(int i=0;i<=(arr.length-1)/2;i++) {
//			temp = arr[i];
//			arr[i] = arr[j];
//			arr[j]=temp;
//			j--;
//		}
//		for(int x :arr) {
//			System.out.println(x);
//		}
	}

}
