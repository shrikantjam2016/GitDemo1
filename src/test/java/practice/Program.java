package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;

public class Program {
	
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,0,1,0,1,0,1};
		//feb1();
		//primenumber(0);
		//palindromeNumber();
		//palindromeString();
		//factorial();
		//randomNumber();
		//armstronNumber();
		//starRightTriangle();
		//starLeftTraingle();
		//starTriangle();
		//diamondPattern();
		//selectionSort();
		//swapNumber();
		//swapString();
		//countWords();
		//largestElemnt();
		//smallestElement();
		//reverseSentence();
		//occuranceChar();
		//duplicateString();
		//duplicateChar();
		//multiArray();
		//arrayListToArray();
		//arrayToArrayList();
		//evenOddSorting(arr);
		predecate();
		
	}

	private static void predecate() {
		Predicate<Integer> ab=t -> t%2==0;
		System.out.println(ab.test(10));
		
		List<Integer> ab1=Arrays.asList(1,2,3,6,9);
		ab1.stream().filter(t -> t%2==0).forEach(t->System.out.println("Print even "+t));
		
	}

	private static void evenOddSorting(int[] arr) {
	int a[]=new int[arr.length];
	int index=0;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			a[index]=arr[i];
			index++;
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2!=0)
		{
			a[index]=arr[i];
			index++;
		}
	}
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
		
	}

	private static void arrayToArrayList() {
		String[] arr= {"Java", "Python", "JSScript"};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		List<String> lan=new ArrayList<>(Arrays.asList(arr));
		System.out.println(lan);
		
	}

	private static void arrayListToArray() {
		ArrayList<String> lan=new ArrayList<>();
		lan.add("Java");
		lan.add("Python");
		lan.add("Java script");
		System.out.println("ArrayLits"+lan);
		
		String ar[]=new String[lan.size()];
		
		lan.toArray(ar);
		
		for(String ab:ar)
		{
			System.out.println(ab);
		}
		
		
	}

	private static void multiArray() {
		int[][] a= {{23,67,89},{44,77,92,85,87},{12,51}};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void duplicateChar() {
		String st="Big black bug bit a big black dog on his big black nose";
		char ch[]=st.toLowerCase().trim().replace(" ", "").toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=0;
				}
			}
			if(count>1&&ch[i]!=0)
			{
				System.out.println(ch[i]+" "+count);
			}
		}
		
	}

	private static void duplicateString() {
		String st="Big black bug bit a big black dog on his big black nose";
		String[] st1=st.toLowerCase().trim().split(" ");
		int count;
		for(int i=0;i<st1.length;i++)
		{
			count=1;
			for(int j=i+1;j<st1.length;j++)
			{
				if(st1[i].equals(st1[j]))
				{
					count++;
					st1[j]="0";
				}
			}
			if(count>1&& st1[i]!="0")
			{
				System.out.println(st1[i] +" "+count);
			}
		}
		
	}

	private static void occuranceChar() {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		char[] ch=st.toCharArray();
		for(char c:ch)
		{
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			else
			{
				h.put(c, 1);
			}
		}
		System.out.println(h);
		
		Set<Character> charSt=h.keySet();
		for(Character ch1:charSt)
		{
			if(h.get(ch1)>1)
			System.out.println("Charatcre "+ch1+" "+h.get(ch1));
		}
		
	}

	private static void reverseSentence() {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String revStr="";
		String[] words=st.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			char[] word=words[i].toCharArray();
			String revWord="";
			for(int j=word.length-1;j>=0;j--)
			{
				revWord=revWord+word[j];
			}
			revStr=revStr+revWord+" ";
		}
		System.out.println(revStr);
		
		
	}

	private static void smallestElement() {
		int[] arr=new int[] {45,18,29,141,77,39,21,34,58,99};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];	
		}
		System.out.println(min);
		
	}

	private static void largestElemnt() {
		int[] arr=new int[] {45,18,29,141,77,39,21,34,58,99};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];	
		}
		System.out.println(max);
	}

	private static void countWords() {
		int count=0;
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] b=a.trim().split(" ");
		System.out.println(b.length);
		
		for(int i=0;i<b.length;i++)
		{
		char[] ch=b[i].toCharArray();
		count=count+ch.length;
		}
		
		System.out.println("charcter count " +count);
		
	}

	private static void swapString() {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a+" "+b);
		
	}

	private static void swapNumber() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
	}

	private static void selectionSort() {
		int[] arr= {9,5,8,2,4,6,7,9,2,1,3};
		int temp=0;
		//sort arry in ascending
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//remove duplicate
		int b=0;
		for(int k=0;k<arr.length;k++)
		{
			if(arr[b]!=arr[k])
			{
				b++;
				arr[b]=arr[k];
			}
			System.out.print(arr[k]+" ");
		}
		System.out.println("=============================");
		for(int i=0;i<=b;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

	private static void diamondPattern() {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=row-1;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

	private static void starTriangle() {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	private static void starLeftTraingle() {
		int row=5;
		for(int i=0;i<row;i++)
		{
			for(int j=2*(row-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private static void starRightTriangle() {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

	private static void armstronNumber() {
		// TODO Auto-generated method stub
		
	}

	private static void randomNumber() {
		 int max=100;
		 int min=0;
		 System.out.println(Math.random());
		 System.out.println(Math.random() * (max - min + 1) + min  );
		 double d=Math.random() * (max - min + 1) + min  ;
		 System.out.println(d);
		 int wd=(int) (Math.random() * (max - min + 1) + min)  ;
		 System.out.println(wd);
		 int x = new Random().nextInt(50);   
		 System.out.println("Using Random class="+x);
		
	}

	private static void factorial() {
		int i, fact=1;
		int number=10;
		for( i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+ " is "+fact);
		
	}

	private static void palindromeString() {
		String org, rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string to check for palindrome");
		org=in.nextLine();
		int len=org.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		if(org.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
		
	}

	private static void palindromeNumber() {
		int sum=0, temp,r;
		int num=545545;
		
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		System.out.println("Palindrom");
		else
			System.out.println("Not palindrom");
		
		
	}

	private static void primenumber(int n) {
		int m, flag=0;
		m=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {System.out.println(n+" is prime number");}
		}
		
	}

	private static void feb1() {
		int n1=0, n2=1, n3;
		int count=10;
		 System.out.print(n1+" "+n2+" ");
		 
		 for(int i=2;i<count;i++)
		 {
			 n3=n1+n2;
			 System.out.print(n3+" ");
			 n1=n2;
			 n2=n3;
		 }
		
	}

}
