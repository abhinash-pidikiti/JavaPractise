package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorProgram {

	public static void main(String[] args) {
		 
		/*
		 * Remove all the null values from the ArrayList
		 */
		
		var list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(null);
		list.add(400);
		list.add(500);
		list.add(null);
		list.add(null);
		list.add(600);
		
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
			if(itr.next() == null) {
				//itr.remove();
				itr.set(0);
			}
		}
		System.out.println(list);

	}

}
