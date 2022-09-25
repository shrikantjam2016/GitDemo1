package testpaper;

public class Test2 {
	
	public static void print(Object o)
	{
		System.out.println("Object"+o);
	}
	public static void print(String s)
	{
		System.out.println("String"+s);
	}
	public static void print(Integer i)
	{
		System.out.println("Integer"+i);
	}
	
	public static void main(String[] args) {
		Test2 t=new Test2();
		Object ob=new Object();
		Object st=new String("String");
		Object intt=new Integer(10);
		
		t.print(ob);
		t.print(st);
		t.print(intt);
	}

}
