package java83;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program1 {
	public static void main(String[] args) {
		List<Employee> e=new ArrayList<Employee>();
		e.add(new Employee("ABC", 30, "Female", "HR"));
		e.add(new Employee("PQR", 25, "Male", "IT"));
		e.add(new Employee("LMN", 30, "Male", "HR"));
		e.add(new Employee("XYZ", 28, "Female", "IT"));
		
		//DEpartment name
		//e.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		//Number of employee in each department
		//Map<String, Long> r=e.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		//System.out.println(r);
		
		
		//Avergare age of Male and Female
		Map<String, Double> a=e.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(a);
	}

}
