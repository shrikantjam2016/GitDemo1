package testpaper;

public class CommandLine {
private static CommandLine t=null;
private CommandLine()
{
	
}

public static CommandLine getTest()
{
	if(t==null)
	{
		t=new CommandLine();
	}
	
	return t;
}

public void m1()
{
	System.out.println("This is test methode");
}
}
