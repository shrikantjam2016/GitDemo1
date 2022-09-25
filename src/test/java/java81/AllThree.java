package java81;

import java.util.Arrays;
import java.util.List;

public class AllThree {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,5,3,6,8,7);
		list.stream().filter(t->t%2==0).forEach(s->System.out.println(s));
		
		List<String> list1=Arrays.asList();
		System.out.println(list1.stream().findAny().orElseGet(()->"Hi test"));
	}

}
