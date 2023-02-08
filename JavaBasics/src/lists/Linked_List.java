package lists;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		/*
		 * Linked implements List Interface.
		 * LinkedList elements are linked together using pointers.
		 * supported Methods:
		 * 1.Accessing Elements - Add, Get, Update, Remove, clear
		 * 2.Searching Elements - Index of, Contains
		 * 3.Viewing portion of list - Sublist
		 * 4.Iteration over list
		 * 5.Size, toArray, isEmpty
		 * 6.Peek and Poll Methods
		 */

		
		var list = new LinkedList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		//System.out.println(list.get(2));
		//list.set(4, 1.7);
		//System.out.println(list);
		//list.add(3, 1.8);
		
		//list.clear();
		//list.remove(0);
		//list.remove(1.6);
		
		System.out.println(list.peekFirst()); // it will give the first element in a list
		System.out.println(list.peekLast()); // it will give last element in a list
		
		System.out.println(list.pollFirst()); // it will return first element and delete that one.
		System.out.println(list.pollLast()); // it will return last element and delete that one.
		
		System.out.println(list);
		
	}

}
