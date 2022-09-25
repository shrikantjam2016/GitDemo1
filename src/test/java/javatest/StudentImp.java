package javatest;

import java.util.Comparator;

public class StudentImp implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return a.rollno-b.rollno;
	}



}
