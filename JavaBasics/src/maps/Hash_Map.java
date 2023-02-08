package maps;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		/*
		 * HashMap provides the basic implementation of Map interface
		 * It stores data in key and value pairs
		 * we can access a value by using the corresponding key
		 * Methods: put, get, containsKey, remove, clear, keySet, values, entrySet
		 * 
		 */
		
		var map = new HashMap<Integer,String>();
		
		map.put(1, "Mon");
		map.put(2, "Tue");
		map.put(3, "wed");
		map.put(4, "Thu");
		map.put(5, "Fri");
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.get(10));// if we ask anything that not exist in hashmap it will return null
		
		System.out.println(map.containsKey(3));
		
		//map.put(3, "mar");
		//map.remove(2);
		//map.remove(1, "Mon");
		//map.clear();
		
		
		var set1 = map.keySet(); //converting map into set
		System.out.println(set1);
		
		var set2 = map.values(); // set is accessing only values
		System.out.println(set2);
		
		 var set3 = map.entrySet(); // set is accessing both keys and values
		 System.out.println(set3);
		
		//System.out.println(map);
		

	}

}
