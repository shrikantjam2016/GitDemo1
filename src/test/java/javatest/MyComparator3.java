package javatest;

import java.util.Comparator;

public class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee2 e1=(Employee2) o1;
		Employee2 e2=(Employee2) o2;
		
		String s1=e1.name;
		String s2=e2.name;
		return -s2.compareTo(s1);
	}

}
