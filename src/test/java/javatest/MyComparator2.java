package javatest;

import java.util.Comparator;

public class MyComparator2 implements Comparator {

	@Override
	public int compare(Object a, Object b) {
		String i1=(String) a;
		String i2=(String) b;
		
	return  -i1.compareTo(i2);
	}



}
