package javatest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapTreeMap {
	static Map<String, Integer> map=new HashMap<>();
	
	public static void main(String[] args) {
		  map.put("Jayant", 80);
	        map.put("Abhishek", 90);
	        map.put("Anushka", 80);
	        map.put("Amit", 75);
	        map.put("Danish", 40);
	        
	        sortedByKey();
	}

	private static void sortedByKey() {
		TreeMap<String, Integer> sorted=new TreeMap<>();
		sorted.putAll(map);
		
		//Display tree map which naturally sorted
		for(Map.Entry<String, Integer> 	entry:sorted.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
