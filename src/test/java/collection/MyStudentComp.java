package collection;

import java.util.Comparator;

public class MyStudentComp implements Comparator<StudentClass>{

	
	  @Override public int compare(StudentClass o1, StudentClass o2)  { 
		int   i1=o1.id; 
	    int i2=o2.id;
	  
	       return i2-i1;
	  }
	 
	

	/*
	 * @Override public int compare(StudentClass o1, StudentClass o2) { String
	 * i1=o1.name; String i2=o2.name;
	 * 
	 * return -i1.compareTo(i2); }
	 */

}
