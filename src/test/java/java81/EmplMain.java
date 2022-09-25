package java81;

import java.util.List;
import java.util.stream.Collectors;

public class EmplMain {
	
	
	public static List<Empl> eveTaxpayer(String input)
	{
		/*
		 * if(input.equalsIgnoreCase("Tax")) { return
		 * EmplDB.getEmpList().stream().filter(emp->emp.getSalary()>500000).collect(
		 * Collectors.toList()); } else return
		 * EmplDB.getEmpList().stream().filter(emp->emp.getSalary()<500000).collect(
		 * Collectors.toList());
		 */
		
		return input.equalsIgnoreCase("Tax")?EmplDB.getEmpList().stream().filter(emp->emp.getSalary()>500000).collect(Collectors.toList())
				:EmplDB.getEmpList().stream().filter(emp->emp.getSalary()<500000).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(eveTaxpayer("gh"));
		
	}

}
