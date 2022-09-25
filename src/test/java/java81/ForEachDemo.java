package java81;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("jhh");
		list1.add("erwe");
		list1.add("ered");
		list1.add("cc");
		list1.add("dfgdh");
		
		for(String ab:list1)
		{
			System.out.println(ab);
		}
		
		list1.stream().forEach(s->System.out.println(s));
		
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "a");
		m.put(2, "b");
		m.put(3, "c");
		m.put(4, "d");
		
		m.forEach((key,value)->System.out.println(key+" "+value));
		m.entrySet().stream().filter(k->k.getKey()%2==0).forEach(obj->System.out.println(obj));
		
		
		
	}

}
