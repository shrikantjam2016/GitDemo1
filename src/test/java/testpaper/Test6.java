package testpaper;

public class Test6 {
	int rollNo;
	String name;
	static String college="ITS";
	
	Test6(int r, String n)
	{
		rollNo=r;
		name=n;
	}
	
	static void change()
	{
		college="BITS";
	}
	
	void display()
	{
		System.out.println(rollNo+" "+name+" "+college);
	}

}
