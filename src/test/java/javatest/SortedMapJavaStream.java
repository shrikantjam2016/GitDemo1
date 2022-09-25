package javatest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedMapJavaStream {
	
	static Map<String, Integer> map=new HashMap<>();
	public static void main(String[] args) {
		 map.put("Jayant", 80);
	        map.put("Abhishek", 90);
	        map.put("Anushka", 80);
	        map.put("Amit", 75);
	        map.put("Danish", 40);
	        
	        sortByKey();
	}
	private static void sortByKey() {
		HashMap<String, Integer> temp=map.entrySet().stream().sorted((a,b)->a.getKey().compareTo(b.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1, LinkedHashMap::new));
		
		for(Map.Entry<String, Integer> ent:temp.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
	}

}
