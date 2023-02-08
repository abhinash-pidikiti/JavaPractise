package sets;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		
		/*
		 * TreeSet is an important implementation of the sorted interface
		 * Elements are sorted in ascending Order by default
		 * No positional access of elements
		 * Basic Methods ; add, remove, clear, contains, size
		 * IMP: Union and Intersection of sets
		 * Imp: Convert set to list
		 */
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Rob");
		set1.add("Bob");
		set1.add("Andy");
		set1.add("Charls");
		
		System.out.println(set1);
		
		var set2 = new TreeSet<Integer>();
		set2.add(200);
		set2.add(125);
		set2.add(135);
		
		System.out.println(set2 );
		

	}

}
