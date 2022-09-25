package javatest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
		
		
	//	String ab=("ab".isEmpty())?"empty":"not empty";
		
	//	System.out.println(ab);
		
		//method1();
		//listTest();
		//setTest();
		//comparableTest();
		//comparatorTest();
		//compareString();
		//hashMapTest();
		treeMap();
	}

	private static void treeMap() {
		TreeMap<String, Integer> h=new TreeMap<String, Integer>(new MyComparator4());
		h.put("Chiru", 700);
		h.put("Bala", 800);
		h.put("Venky", 200);
		h.put("Naga", 500);
		System.out.println(h);
		
		
	}

	private static void hashMapTest() {
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		h.put("Chiru", 700);
		h.put("Bala", 800);
		h.put("Venky", 200);
		h.put("Naga", 500);
		System.out.println(h);
		System.out.println(h.put("Chiru", 1000));
		System.out.println(h);
		
		Set s=h.entrySet();
		System.out.println(s);
		Collection c=h.values();
		System.out.println(c);
		Set e=h.keySet();
		System.out.println(e);
		
		
		/*
		 * Iterator it=c.iterator(); while(it.hasNext()) { Map.Entry<String, Integer>
		 * val=(Map.Entry<String, Integer>)it.next();
		 * System.out.println(val.getKey()+"="+val.getValue()); }
		 */
		 
		
		for(Map.Entry<String, Integer> val:h.entrySet())
		{
			if(val.getKey().equals("Naga"))
			{
				val.setValue(2000);
			}
		}
		System.out.println(h);
		
	}

	private static void compareString() {
		TreeSet<String> t=new TreeSet<String>(new MyComparator2());
		t.add("Roja");
		t.add("Shobharani");
		t.add("Rajakumiri");
		t.add("Ganga");
		t.add("Ramulamma");
		System.out.println(t);
		
	}

	private static void comparatorTest() {
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
	}

	private static void comparableTest() {
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("A".compareTo("A"));
		
	}

	private static void setTest() {
	HashSet<String> hs=new HashSet<String>();
	hs.add("B");
	hs.add("C");
	hs.add("D");
	hs.add("2");
	hs.add(null);
	//hs.add(10);
	System.out.println(hs.add("2"));
	System.out.println(hs);
	
	LinkedHashSet<String> ls=new LinkedHashSet<String>();
	ls.add("B");
	ls.add("C");
	ls.add("D");
	ls.add("2");
	ls.add(null);
	//hs.add(10);
	System.out.println(ls.add("2"));
	System.out.println(ls);
	
	SortedSet<String> s=new TreeSet<String>();

	s.add("B");
	s.add("C");
	s.add("B");
	s.add("2");
//	s.add(null);
	//hs.add(10);
	System.out.println(s.add("2"));
	System.out.println(s);
	
		
	}

	private static void listTest() {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Integer nu=(Integer) it.next();
			if(nu%2==0)
			{
				System.out.println(nu);
			}
			else
			it.remove();
		}
		System.out.println(l);
	}

	private static void method1() {
		Integer[] ab=new Integer[10];
		ab[0]= 8;
		Integer[] a= {8,3,4,5,1,7,8,4,3,9,5};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
