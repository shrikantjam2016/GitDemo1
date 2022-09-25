package testpaper;

import java.util.Comparator;

public class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		EmployeeT e1=(EmployeeT) o1;
		EmployeeT e2=(EmployeeT) o2;
		
		String s1=e1.name;
		String s2=e2.name;
		
		return s2.compareTo(s1);
	}

}
