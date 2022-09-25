package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import Java8.Empolyee;

public class MainTest {
	
	public static void main(String[] args) {
		ArrayList<Empolyee> l=new ArrayList<Empolyee>();
		l.add(new Empolyee(34, "Magan"));
		l.add(new Empolyee( 25, "Naman"));
		l.add(new Empolyee(15, "Baban"));
		
		l.stream().sorted((e1,e2)->-e1.getName().compareTo(e2.getName()))
		.forEach(System.out::println);
		
		System.out.println("=======================================================");
		l.stream().sorted((e1,e2)->e2.getId()-(e1.getId()))
		.forEach(System.out::println);
		System.out.println("=======================================================");
		
		l.stream().filter(emp->emp.getId()>20 && emp.getName().startsWith("M")).forEach(System.out::println);
		
		List<Empolyee>ab=l.stream().filter(emp->emp.getId()>20 && emp.getName().startsWith("M")).collect(Collectors.toList());
		System.out.println(ab);
	}

}
