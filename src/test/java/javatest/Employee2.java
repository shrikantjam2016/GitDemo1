package javatest;

public class Employee2 implements Comparable{
	
	String name;
	int id;
	
	public Employee2(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	public String toString()
	{
		return name+"::"+id;
	}

	@Override
	public int compareTo(Object o) {
	int id=this.id;
	Employee2 e=(Employee2) o;
	
	int id2=e.id;
	if(id<id2)
	{
		return -1;
	}
	else if(id>id2)
	{
		return 1;
	}
	else
		return 0;
	}
	
	

}
