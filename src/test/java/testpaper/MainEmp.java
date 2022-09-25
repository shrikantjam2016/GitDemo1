package testpaper;

import java.util.ArrayList;
import java.util.Collections;

public class MainEmp {
	
	public static void main(String[] args) {
		
		ArrayList l=new ArrayList<>();
		l.add(new EmployeeT("Naman", 59));
		l.add(new EmployeeT("Gagan", 10));
		l.add(new EmployeeT("Nayan", 14));
		l.add(new EmployeeT("Tagan", 56));
		
		System.out.println(l);
		
		Collections.sort(l, new MyComp());
		
		System.out.println(l);
		
	}

}
