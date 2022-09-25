package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Stream3 {
	public static void main(String[] args) {
		
		Map<String, Integer> m=new HashMap<>();
		m.put("EIght", 8);
		m.put("Four", 4);
		m.put("Ten", 10);
		m.put("Two", 2);
		
		//Get list from the map
		
		List<Entry<String, Integer>> list=new ArrayList<>(m.entrySet());
		
		Collections.sort(list, ( o1,  o2)  -> o1.getKey().compareTo(o2.getKey()));
		
		/*
		 * for(Entry<String, Integer> ab:list) {
		 * System.out.println(ab.getKey()+" "+ab.getValue()); }
		 */
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		
	}

}
