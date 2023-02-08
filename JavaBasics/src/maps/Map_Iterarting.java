package maps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map_Iterarting {

	public static void main(String[] args) {
		
		var map = new TreeMap<Integer,Double>();
		
		map.put(10, Math.sqrt(10));
		map.put(30, Math.sqrt(30));
		map.put(50, Math.sqrt(50));
		map.put(40, Math.sqrt(40));
		map.put(20, Math.sqrt(20));
		
		
//		for(Entry<Integer,Double> e: map.entrySet()) {
//			System.out.println(e);
//		}
		
		Iterator itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
