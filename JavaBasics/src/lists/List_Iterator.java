package lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		
		/*
		 * List iterator is used when we want to enumerate elements of list
		 * It can be used both on LinkedList and ArrayList
		 * Methods;
		 * next, hasNext, Previous, hasPrevious,
		 * nextIndex, previousIndex, add, set, remove
		 */
		
		var list = new ArrayList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		
		ListIterator itr = list.listIterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("------------");
		
		ListIterator itr1 = list.listIterator(1);
		
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		System.out.println("------------");
		
		ListIterator Previous1 = list.listIterator(list.size());
		
		while (Previous1.hasPrevious()) {
			System.out.println(Previous1.previous());
		}

	}

}
