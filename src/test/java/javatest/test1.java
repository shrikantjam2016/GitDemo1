package javatest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class test1 {
	public static void main(String[] args) {
		String st="Automation";
	//	String ab1=reverseString(st);
	//	System.out.println(ab1);
	//	test11();
	//	sortingList();
		test23();
	}

	private static void test23() {
		int x=10;
		System.out.println(++x);
		System.out.println(x);
		System.out.println(10>>2);
		
	}

	private static void sortingList() {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(8);
		l.add(5);
		l.add(2);
		l.add(1);
		l.add(4);
		l.add(3);
		
		Collections.sort(l);
		System.out.println(l);
		
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("F");
		l2.add("M");
		l2.add("B");
		l2.add("D");
		l2.add("A");
		Collections.sort(l2);
		System.out.println(l2);
		System.out.println(Collections.binarySearch(l2, "D"));
		Collections.reverse(l2);
		System.out.println(l2);
		

		
	}

	private static void test11() {
		
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		h.put("Chiru", 700);
		h.put("Bahiru", 100);
		h.put("Annu", 500);
		h.put("Zippu", 100);
		h.put("Montu", 200);
		System.out.println(h.get("Chiru"));
		
		Set key=h.keySet();
		System.out.println(key);
		Collection val=h.values();
		System.out.println(val);
		
		Set e=h.entrySet();
		
		Iterator it=e.iterator();
		while(it.hasNext())
		{
			Entry<String, Integer> m=(Entry<String, Integer>) it.next();
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	
	}

	private static String reverseString(String st) {
		char ch[]=st.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	
		
	}

}
