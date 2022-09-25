package javatest;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object a, Object b) {
		Integer i1=(Integer) a;
		Integer i2=(Integer) b;
		
		if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}



}
