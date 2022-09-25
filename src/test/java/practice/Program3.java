package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program3 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		List<String> ab=new ArrayList<String>();
		ab.add("Murti");
		ab.add("John");
		ab.add("Peter");
		ab.add("Mark");
		ab.add("Mac");
		
		
		ab.stream().forEach(t->System.out.println(t));
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		
		map.forEach((key, value)->System.out.println(key+":"+value));
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		
		
		
		
	}

}
