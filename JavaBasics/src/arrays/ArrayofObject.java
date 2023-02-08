package arrays;

public class ArrayofObject {

	public static void main(String[] args) {
		
		Object [] arr = {"mayur",33,5.11,"M"};
		
		for(Object x : arr) {
			System.out.println(x);
		}
		
		Object [][] arr1 = {{"mayur",33,5.1,"M"},
						   {"sruthi",30,5.7,"F"},
						   {"Gaurav",31,5.10,"M"},
						   {"john",45,5.11,"m"}
		};
		for(Object [] x1 : arr1) {
			for(Object y :x1) {
				System.out.print(y + " ");
			}
			System.out.print("\n");
		}
		

	}

}
