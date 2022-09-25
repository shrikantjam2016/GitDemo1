package java82;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {
	public static List<Employee>  getEmp()
	{
		
		
		return Stream.of(new Employee(101, "John", "A", 6000),
				new Employee(109, "Peter", "B", 3000),
				new Employee(102, "Mak", "A", 8000),
				new Employee(103, "Kim", "A", 9000),
				new Employee(104, "Json", "C", 15000)).collect(Collectors.toList());
		
	}

}
