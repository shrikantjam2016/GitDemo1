package collection;

import java.util.Comparator;

public class MyComprator1 implements Comparator {

	@Override
	public int compare(Object st1, Object st2) {
		String s1=(String) st1;
		String s2=(String) st2;
		
		return s2.compareTo(s1);
	}

}
