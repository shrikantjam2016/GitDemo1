package practice;

public class Test {
public static void main(String[] args) {
	String st="Java concept of the day";
	
	char c=st.charAt(5);
	System.out.println(c);
	
	char[] cb=new char[5];
	st.getChars(5, 8, cb, 0);
	
	for(char c1:cb)
	{
		System.out.println(c1);
	}
	
	char[] dst=st.toCharArray();
	
	for(int i=st.length()-1;i>0;i--)
	{
		System.out.println(dst[i]);
	}
	for(char ab:dst)
	{
		System.out.print(ab+" ");
	}
	
	System.out.println(st.substring(5));
	System.out.println(st.substring(5, 8));
	
}
}
