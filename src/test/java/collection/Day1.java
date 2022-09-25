package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Day1 {
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Integer n=(Integer) it.next();
			if(n%2==0)
				System.out.println(n);
			else
				it.remove();
		}
	}

}
