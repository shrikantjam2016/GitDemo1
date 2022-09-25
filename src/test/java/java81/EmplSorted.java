package java81;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmplSorted {
	public static void main(String[] args) {
		List<Empl> l=EmplDB.getEmpList();
		
		Collections.sort(l, new MyComparator());
		//System.out.println(l);
		
		
		Collections.sort(l, (o1,o2)->(int) (o2.getSalary()-o1.getSalary()));
		//System.out.println(l);
		
		//l.stream().sorted((o1,o2)->(int) (o2.getSalary()-o1.getSalary())).forEach(System.out::println);
		
		//l.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);
		
		l.stream().sorted(Comparator.comparing(Empl::getName)).forEach(System.out::println);
	}

}


class MyComparator implements Comparator<Empl>
{

	@Override
	public int compare(Empl o1, Empl o2) {
		// TODO Auto-generated method stub
		return (int) (o2.getSalary()-o1.getSalary());
	}
	
}