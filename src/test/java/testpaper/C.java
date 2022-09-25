package testpaper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class C  {
	final static String opfile="C:\\Users\\Shrikant Jambhulkar\\eclipse-workspace\\JavaTutorial\\abc.txt";
public static void main(String[] args) {
	//arrayTest();
	//treeTest();
	//comparatorTest();
//	hashMapTest();
//	hashTableTest();
	serlize();
	
}

private static void hashTableTest() {
	Hashtable h=new Hashtable<>();
	h.put(new Temp(5), "A");
	h.put(new Temp(2), "B");
	h.put(new Temp(6), "C");
	h.put(new Temp(15), "D");
	h.put(new Temp(23), "E");
	h.put(new Temp(16), "F");
	System.out.println(h);
	
}

private static void serlize() {

	
	HashMap<String, String> map=new HashMap<>();
	
	   map.put("rohit", "one");
       map.put("Sam", "two");
       map.put("jainie", "three");
       
       File f=new File(opfile);
       BufferedWriter bf =null;
       
       try {
		bf=new BufferedWriter(new FileWriter(f));
		
		for(Map.Entry<String, String> entry: map.entrySet()) 
		{
			bf.write(entry.getKey() +" " +entry.getValue());
			bf.newLine();
		}
		bf.flush();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       finally {
		try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
       
}

private static void hashMapTest() {
	HashMap m=new HashMap();
	m.put("Chiru", 700);
	m.put("Bala", 800);
	m.put("Vinky", 200);
	m.put("Naga", 500);
	
	System.out.println(m);
	m.put("Chiru", 1000);
	System.out.println(m);
	
	Set s=m.keySet();
	System.out.println(s);
	System.out.println(m.get("Chiru"));
	Collection c=m.values();
	System.out.println(c);
	Set s1=m.entrySet();
	System.out.println(s1);
	
	Iterator it=s1.iterator();
	while(it.hasNext())
	{
		Map.Entry m1=(Entry) it.next();
		System.out.println(m1);
		System.out.println(m1.getKey() +"->"+m1.getValue());
		
	}
	
}

private static void comparatorTest() {
	TreeSet t1=new TreeSet<>(new MyComparator());
	t1.add("Raja");
	t1.add("Shobha");
	t1.add("Rajakumari");
	t1.add("Gana");
	t1.add("Rama");
	System.out.println(t1);
	
	ArrayList l=new ArrayList<>();
	l.add("Raja");
	l.add("Shobha");
	l.add("Rajakumari");
	l.add("Gana");
	l.add("Gama");
	l.add(new StringBuffer("Lama"));
	System.out.println(l);
	
	Collections.sort(l, new MyComparator());
	
	System.out.println("After sorting");
	
	System.out.println(l);
	
}

private static void treeTest() {
	TreeSet t =new TreeSet<>();
	t.add("C");
	t.add("A");
	t.add("B");
	t.add("E");
	t.add("D");
	System.out.println(t);
}

private static void arrayTest() {
	ArrayList l=new ArrayList<>();
	for(int i=0;i<10;i++)
	{
		l.add(i);
	}
	System.out.println(l);
	
	Iterator it=l.iterator();
	
	while(it.hasNext())
	{
		Integer i=(Integer) it.next();
		
		if(i%2==0)
		{
			System.out.println(i);
		}
		else
			it.remove();
	
	}
	System.out.println(l);
	
}


}
