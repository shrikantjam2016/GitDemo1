package java81;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapDemo {
	
	public static void main(String[] args) {
		Map<String, Integer> m=new HashMap<>();
		m.put("EIght", 8);
		m.put("Four", 4);
		m.put("ten", 10);
		m.put("Two", 2);
		
		
		Map<Empl,Integer> mp=new TreeMap<>((a,b)->b.getName().compareTo(a.getName()));
		
		mp.put(new Empl(176, "Roshan", "IT", 600000), 10);
		mp.put(new Empl(158, "Soscha", "HR", 566000), 90);
		mp.put(new Empl(256, "Kali", "Finance", 800000), 50);
		mp.put(new Empl(56, "Mama", "HR", 400000), 40);
		mp.put(new Empl(556, "Okaya", "Man", 450000), 80);
		
		System.out.println(mp);
		
		System.out.println("############################################################################");
		
		mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Empl::getName).reversed())).forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<Entry<String, Integer>> entry=new ArrayList<>(m.entrySet());
		
		/*
		 * Collections.sort(entry, new Comparator<Entry<String, Integer>>() {
		 * 
		 * @Override public int compare(Entry<String, Integer> o1, Entry<String,
		 * Integer> o2) { // TODO Auto-generated method stub return
		 * o1.getKey().compareTo(o2.getKey()); } });
		 */
		
		Collections.sort(entry,(a,b)->a.getKey().compareTo(b.getKey()));
		
		for(Entry<String, Integer> ab:entry)
		{
			System.out.println(ab.getKey()+" "+ab.getValue());
		}
		
		System.out.println("=====================================================================");
		
		m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("=====================================================================");
		
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	}

}
