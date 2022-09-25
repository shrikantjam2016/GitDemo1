package java82;

import java.util.Comparator;

public class MainEmployee {
	public static void main(String[] args) {
		
		//get Employee whose grade is A
		
	double sal=	EmployeeDB.getEmp().stream().filter(e->e.getGrade().equalsIgnoreCase("A"))
		.map(e->e.getSalary())
		.mapToDouble(i->i)
		.average().getAsDouble();
	System.out.println(sal);
	
	
	//Sum of salaries whoes grade is A
	
	double sumsal=	EmployeeDB.getEmp().stream().filter(e->e.getGrade().equalsIgnoreCase("A"))
			.map(e->e.getSalary())
			.mapToDouble(i->i)
			.sum();
		System.out.println(sumsal);
		
		
		EmployeeDB.getEmp().stream().sorted((a,b)->(int) (b.getSalary()-a.getSalary())).forEach(System.out::println);
		
	}
	
	
	

}

class MyComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee a, Employee b) {
		
		return (int) (a.getSalary()-b.getSalary());
	}
	
}
