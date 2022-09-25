package testpaper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.internal.collections.Ints;

public class Test4 {
	public static void main(String[] args) {
		//test1();
		test2();
		test3();
		
		
		
	}

	private static void test3() {
		try {
			BufferedReader bw=new BufferedReader(new FileReader(""));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void test2() {
		int[] a= {0,1,0,1,0,1,0};
		List<Integer> a1=Ints.asList(a);
		
		Set<Integer> set=new HashSet<>(a1);
		System.out.println(set);
		System.out.println(a1);
		
	}

	private static void test1() {

		int[] a= {0,1,0,1,0,1,0};
		
		Integer[] a1= {0,1,0,1,0,1,0};
		
		//List<Integer> ab=Arrays.asList(new Integer);
		
		List<Integer> ab1=Ints.asList(a);
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a1, Collections.reverseOrder());
		System.out.println(Arrays.toString(a1));
		
	}

}
