package collection;

import java.util.Comparator;

public class MyComprator implements Comparator{

	@Override
	public int compare(Object num1, Object num2) {
		Integer i1=(Integer) num1;
		Integer i2=(Integer) num2;
		
		if(i1<i2)
			return 1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}

}
