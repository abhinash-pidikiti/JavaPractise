package lists;
import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		/*
		 * Array list implements list interface
		 * Array list supports creation of dynamic arrays.
		 * Supported methods
		 * 1.Accessing Elements - Add,Get,Update,Remove,Clear
		 * 2.Searching Elements - Index of, contains
		 * 3.Viewing portion of list -sublist
		 * 4.Iterating over list
		 * 5.Size, toArray isEmpty
		 */
		
		ArrayList<String> arr = new ArrayList<String>(); // this is one way of declaring array
		
		List<String> arr1 = new ArrayList<String>(); // Another way
		
		arr.add("red");
		arr.add("blue");
		arr.add("green");
		arr.add("pink");
		arr.add("yellow");
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		arr.set(3, "Orange");
		System.out.println(arr.get(3));
		//arr.clear();
		//arr.remove(1);
		System.out.println(arr.indexOf("green")); 
		// if we have two same elements we need find last one we need to use last indexof.
		
		
		System.out.println(arr.contains("White"));
		
		System.out.println(arr.subList(1, 3));
		
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		System.out.println(arr);
		System.out.println("________________");
		
		//iterator
		for(String x : arr) {
			System.out.println(x);
		}

	}

}
