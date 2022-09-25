package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams1 {
	
	public static void main(String[] args) {
		
		//uniqueNumber();
		//streamsCollect();
		//matchedList();
		//mergeSorting();
		//sortingTest();
		//upperCase();
		//regularTest();
		//filterTest();
		//mapTest();
		//vowalCountString();
		//VowalCountInEachString();
		//duplicateCharacterInString();
		//randomeNum();
		//removeDuplicateElements();
		//findElementGreaterThanLen();
		maxValue();
		longestString();
		
	}

	private static void longestString() {
		List<String> l=Arrays.asList("Java", "Python", "csharp", "DotneT", "Dotnet");
		
		String max1=l.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println(max1);
		
	}

	private static void maxValue() {
		List<Integer> l=Arrays.asList(20,2,4,7,1,9,15);
		
		Integer max=l.stream().reduce(0,(a,b)->a>b?a:b);
		System.out.println(max);
		
		//MAx value using method reference
		Integer max1=l.stream().reduce(Integer::max).get();
		System.out.println(max1);
		
		
		
	}

	private static void findElementGreaterThanLen() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		 list.add("Saket");
	        list.add("Saurav");
	        list.add("Softwaretestinghelp");
	        list.add("Steve");
	        
	        long count=list.stream().filter(str->str.length()>5).count();
	        System.out.println(count);
	}

	private static void removeDuplicateElements() {
		Integer[] i=new Integer[] {5,3,9,8,1,2,3,4,5,6,7};
		List<Integer> l=Arrays.asList(i);
		Set<Integer> s=l.stream().collect(Collectors.toSet());
		//s.forEach(a->System.out.print(a+" "));
		System.out.println(s);
		
	}

	private static void randomeNum() {
		Random t=new Random();
		t.ints().limit(5).sorted().forEach(System.out::println);
		
	}

	private static void duplicateCharacterInString() {
		String st="Hello World";
		String st1=st.toLowerCase().replace(" ", "");
		
		Map<String, Long> a=st1.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		a.forEach((key, value)->System.out.println(key+" "+value));
	}

	private static void VowalCountInEachString() {
		String st="Hello World";
		String[] st1=st.split(" ");
		for(String ab:st1)
		{
			String ab1=ab.toLowerCase();
			long count=ab1.chars().filter((x)->{return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u');}).count();
			System.out.println("Vowal count in "+ab+" is "+count);
		}
		
	}

	private static void vowalCountString() {
		String st="Hello World";
		String st1=st.toLowerCase().replace(" ", "");
		long count=st1.chars().filter((x)->{return (x=='a'||x=='e'||x=='i'||x=='o'||x=='u');}).count();
		System.out.println(count);
		
	}

	private static void mapTest() {
		List<Integer> val=Arrays.asList(2,4,9,7,8,5,3,1,4,9);
		List<Integer> l=val.stream().map(s->s*2).collect(Collectors.toList());
		System.out.println(l);
		val.stream().map(s->s-2).forEach(s->System.out.println(s));
	
	}

	private static void filterTest() {
		List<Integer> val=Arrays.asList(7,8,5,3,1,4,9);
		List<Integer> l=val.stream().filter(s->(s%2==0)).collect(Collectors.toList());
		System.out.println(l);
		
	}

	private static void regularTest() {
		int count=0;
		ArrayList<String> name=new ArrayList<String>();
		name.add("abc");
		name.add("Abhijit");
		name.add("Ajay");
		name.add("Suresh");
		name.add("Raj");
		name.add("Ramesh");
		
		for(String ab:name)
		{
			if(ab.startsWith("A"))
			{
				System.out.println(ab);
				count++;
			}
		}
		System.out.println(count);
		
		long a=name.stream().filter(s->s.startsWith("R")).count();
		System.out.println(a);
		
		List<String> ab=name.stream().filter(s->s.length()>4).sorted().limit(1).collect(Collectors.toList());
		System.out.println(ab);
	}

	private static void upperCase() {
	Stream.of("Ayush", "Somu", "Tomu", "Aaliya", "Timba").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	.forEach(s->System.out.println(s));
		
	}

	private static void sortingTest() {
		List<String> l=Arrays.asList("Ayush", "Somu", "Tomu", "Aaliya", "Timba");
		List<String> ab=l.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ab);
		
	}

	private static void mergeSorting() {
		ArrayList<String> name=new ArrayList<String>();
		name.add("abc");
		name.add("Abhijit");
		name.add("Ajay");
		name.add("Suresh");
		name.add("Raj");
		name.add("Ramesh");
		List<String> name1=Arrays.asList("Ayush", "Somu", "Tomu", "Aaliya", "Timba");
		Stream<String> ab=Stream.concat(name.stream(), name1.stream());
		
		List<String> sorted=ab.sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
	}

	private static void matchedList() {
		ArrayList<String> name=new ArrayList<String>();
		name.add("abc");
		name.add("Abhijit");
		name.add("Ajay");
		name.add("Suresh");
		name.add("Raj");
		name.add("Ramesh");
		
		List<String> name1=Arrays.asList("Ayush", "Somu", "Tomu", "Aaliya", "Timba");
		Stream<String> ab=Stream.concat(name.stream(), name1.stream());
		
		System.out.println(ab.anyMatch(s->s.equalsIgnoreCase("Somu")));
		
	}

	private static void streamsCollect() {
		List<String> l=Stream.of("Somu", "aaliya","tonu","cima", "Ayush", "timba")
				.filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(l);
		System.out.println(l.get(2));
		
	}

	private static void uniqueNumber() {
		List<Integer> val=Arrays.asList(5,4,7,1,2,9,4,5,7,11,89,4);
		val.stream().distinct().forEach(s->System.out.println(s+" "));
		System.out.println();
		System.out.println("==========================================");
		val.stream().sorted().forEach(s->System.out.println(s+" "));
		System.out.println("==============================================");
		
		List<Integer> ab=val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ab);
		System.out.println(ab.get(3));
		
		
	}

}
