package testpaper;

public class Test1 {
	public static void main(String[] args) {
	Integer i=4;
	new Test1(i);
	}
	Test1()
	{
		

		System.out.println("Test");
	}
	 Test1(long l)
	{
		this();
		System.out.println(l);
	}
	Test1(int l)
	{
		this();
		System.out.println(l*2);
	}

}
