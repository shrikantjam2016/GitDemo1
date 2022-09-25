package java81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCode {
	public static void main(String[] args) {
		List<Integer> ab=Arrays.asList(56,12,46,89,12,16);
		
		ab.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(s->System.out.println(s));
	}

}
