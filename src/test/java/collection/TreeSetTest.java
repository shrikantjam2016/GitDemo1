package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetTest {
	public static void main(String[] args) {
		//treesetInt();
		//treesetStr();
		//tresssetMix();
		studentCompare();
	}

	private static void studentCompare() {
		List<StudentClass> l=new ArrayList<StudentClass>();
		l.add(new StudentClass(5, "Suman"));
		l.add(new StudentClass(2, "Naman"));
		l.add(new StudentClass(4, "Baban"));
		l.add(new StudentClass(3, "Aman"));
		l.add(new StudentClass(1, "Gagan"));
		
		//Collections.sort(l, new MyStudentComp());
		//System.out.print(l);
		
		//Using streams
		
		List l2=l.stream().filter(a->a.name.length()>4).sorted((a,b)->b.getId()-a.getId()).collect(Collectors.toList());
		System.out.println(l2);
		
	}

	private static void tresssetMix() {
		TreeSet t2=new TreeSet(new MyComp());
		t2.add("A");
		t2.add(new StringBuffer("ABC"));
		t2.add(new StringBuffer("AA"));
		t2.add("XX");
		t2.add("ABCD");
		t2.add("A");
		System.out.println(t2);
		
	}

	private static void treesetStr() {
		TreeSet t1=new TreeSet(new MyComprator1());
		t1.add("Roja");
		t1.add("Shobharani");
		t1.add("Rajakumri");
		t1.add("Ganga");
		t1.add("Rama");
		System.out.println(t1);
	}

	private static void treesetInt() {
		TreeSet t=new TreeSet(new MyComprator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
		
	}

}
