package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {
	public static void main(String[] args) {
		//intAsList();
		//reverseIntegerArray();
		//stringAsList();
		//subString();
		//reverseString();
		//reverseEachWordOfString();
		//sortIntArray();
		//freqOfArrayElement();
		//ifCondition();
		//turnury();
		factorial();
		
		
	}

	private static void factorial() {
		int fact=0;
		int num=10;
		for(int i=0;i<10;i++)
		{
			fact=fact+i;
		}
		System.out.println(fact);
		
	}

	private static int turnury() {
		return (true?null:0);
		
	}

	private static void ifCondition() {
		int count=0;
		if(++count>0&&count++<2)
		{
			System.out.println("inside IF");
		}
		else
			System.out.println("Inside else");
		
	}

	private static void freqOfArrayElement() {
		int[] a= {54,76,19,22,34,86,56, 19,22};
		int[] f=new int[a.length];
		int visit=1;
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					f[j]=visit;
				}
			}
			if(f[i]!=visit)
			{
				f[i]=count;
			}
		}
		
		for(int i=0;i<f.length;i++)
		{
			/*
			 * if(f[i]!=visit) { System.out.println(a[i]+" "+f[i]); }
			 */
			System.out.println(a[i]+" "+f[i]);
		}
		
	}

	private static void sortIntArray() {
		int[] a= {54,76,19,22,34,86,56, 19,22};
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[b]!=a[i])
			{
				b++;
				a[b]=a[i];
			}
		}
		
		for(int i=0;i<b;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("==================");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

	private static void reverseEachWordOfString() {
		String st="Java concept of the day";
		String[] ab=st.split(" ");
		String rev="";
		
		for(int i=0;i<ab.length;i++)
		{
			String st1=ab[i];
			String revWord=" ";
			for(int j=st1.length()-1;j>=0;j--)
			{
				revWord=revWord+st1.charAt(j);
			}
			rev=rev+revWord;
		}
		
		System.out.println(rev);
		
	}

	private static void reverseString() {
		String st="Selenium";
		char[] ab=st.toCharArray();
		
		for(int i=ab.length-1;i>=0;i--)
		{
			System.out.print(ab[i]);
		}
		
	}

	private static void subString() {
		String st="Selenium";
		System.out.println(st.substring(2));
		System.out.println(st.substring(2,4));
		
	}

	private static void stringAsList() {
		String[] ab=new String[] {"abc", "efg", "xyz", "pqr"};
		
		ArrayList<String> st=new ArrayList<String>(Arrays.asList(ab));
		System.out.println(st);
		
	}

	private static void reverseIntegerArray() {
		int[] a= {6,7,4,8,9,1,3,2};
		for(int i=a.length-1;i>0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

	private static void intAsList() {
		int[] a= {6,7,4,8,9,1,3,2};
		
		List<Integer> ab=new ArrayList<>();
		
		for(int i:a)
		{
			ab.add(i);
		}
		System.out.println(ab);
		
		
		List<int[]> bc=Arrays.asList(a);
		
	
	}

}
