package javatest;

import java.util.TreeSet;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee2 e1=new Employee2("nag", 100);
		Employee2 e2=new Employee2("basha", 200);
		Employee2 e3=new Employee2("chiru", 500);
		Employee2 e4=new Employee2("venky", 150);
		Employee2 e5=new Employee2("nag", 100);

		TreeSet<Employee2> t=new TreeSet<Employee2>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
		
		TreeSet<Employee2> t2=new TreeSet<Employee2>(new MyComparator3());
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);
	}

	

}
