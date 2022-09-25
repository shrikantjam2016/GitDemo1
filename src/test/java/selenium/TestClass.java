package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass {
	
	public static void main(String[] args) {
		//regularTest();
		//upperCase();
		//sortingTest();
	//	mergeing();
	//	matchedList();
	//	streamCollect();
		uniqNum();
		
		
	}

private static void uniqNum() {
		List<Integer> val=Arrays.asList(1,5,9,8,2,1,4,9);
		val.stream().distinct().forEach(s->System.out.print(s));
		System.out.println();
		val.stream().distinct().sorted().forEach(s->System.out.print(s));
		System.out.println();
		List<Integer> t=val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(t.get(2));
		
		
		
	}

private static void streamCollect() {
	List<String> l=Stream.of("Ayusha", "somu", "tonu", "aaliya", "timba").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
	collect(Collectors.toList());
	System.out.println(l.get(0));
		
	}

private static void matchedList() {
	ArrayList<String> name=new ArrayList<String>();
	name.add("abc");
	name.add("Abhijit");
	name.add("Ajay");
	name.add("Suresh");
	name.add("Raj");
	name.add("Ramesh");
	
	List<String> name1=Arrays.asList("Ayusha", "Somu", "Tonu", "Aaliya", "Timba");
	
	Stream<String>st=Stream.concat(name.stream(), name1.stream());
	boolean b=st.anyMatch(s->s.equalsIgnoreCase(("Somu")));
	System.out.println(b);
	
		
	}

private static void mergeing() {
	ArrayList<String> name=new ArrayList<String>();
	name.add("abc");
	name.add("Abhijit");
	name.add("Ajay");
	name.add("Suresh");
	name.add("Raj");
	name.add("Ramesh");
	
	List<String> name1=Arrays.asList("Ayusha", "Somu", "Tonu", "Aaliya", "Timba");
	
	Stream<String>st=Stream.concat(name.stream(), name1.stream());
	st.sorted().forEach(s->System.out.println(s));
		
	}

private static void sortingTest() {
		List<String> name=Arrays.asList("Ayusha", "Somu", "Tonu", "Aaliya", "Timba");
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
	}

private static void upperCase() {
	//print name which have last letter as a with upper case
	Stream.of("Ayusha", "somu", "tonu", "aaliya", "timba").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
	forEach(s->System.out.println(s));
		
	}

public static void regularTest()
{
	int count=0;
	ArrayList<String> name=new ArrayList<String>();
	name.add("abc");
	name.add("Abhijit");
	name.add("Ajay");
	name.add("Suresh");
	name.add("Raj");
	name.add("Ramesh");
	
	for(String st:name)
	{

		if(st.startsWith("A"))
		{
			System.out.println(st);
			count++;
		}
	}
	System.out.println(count);
	
	long a=name.stream().filter(s->s.startsWith("A")).count();
	System.out.println(a);
	
	Stream.of("abc","Abhijit", "Ajay","Suresh","Raj", "Ramesh").filter(s->s.startsWith("A"));
	
	//name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
}
}
