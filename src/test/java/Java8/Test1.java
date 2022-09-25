package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Test1 {
	public static void main(String[] args) {
		 A an = new B();
		  
	//test();
	//test2();
	
	}

	private static void test2() {
	
int[] ab=new int[] {};
System.out.println(ab.length);
		
	}

	private static void test() {
		List<String> l=new ArrayList<String>();
		l.add("Magan");
		l.add("Chagan");
		l.add("Naman");
		l.add("Sanam");
		l.add("Aman");
		l.add("Baban");
		
		l.forEach(s->System.out.println(s));
		l.forEach(System.out::println);
		
		int[] arr= {6,2,8,1,5,4};
		IntStream val=Arrays.stream(arr);
		val.parallel().forEach(s->System.out.print(s));
		System.out.println();
		val=Arrays.stream(arr);
		val.parallel().forEachOrdered(s->System.out.print(s));
		
	}

}
