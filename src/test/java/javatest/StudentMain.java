package javatest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMain {
	public static void main(String[] args) {
		Student[] ab= {new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")};
		
		for(int i=0;i<ab.length;i++)
		{
			System.out.println(ab[i]);
		}
		
		/**
		 * The sorted
		 */
		
		Arrays.sort(ab, new StudentImp());
		System.out.println("=========Sorted============");
		for(int i=0;i<ab.length;i++)
		{
			System.out.println(ab[i]);
		}
		
		System.out.println("==============Java Stream Roll No============");
		List<Student> bc= Arrays.asList(ab);
		
		List<Student> ab1=bc.stream().sorted((a,b)->-a.getRollno()-b.getRollno()).collect(Collectors.toList());
		
		System.out.print(ab1);
		System.out.println();
		
		System.out.println("==============Java Stream Name============");
		List<Student> ab2=bc.stream().sorted((a,b)->-a.getName().compareTo(b.getName())).collect(Collectors.toList());
		System.out.print(ab2);
	}

}
