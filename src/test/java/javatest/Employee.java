package javatest;

public class Employee {
	
	String name;
	int id;
	
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return name+"::"+id;
	}

	

}
