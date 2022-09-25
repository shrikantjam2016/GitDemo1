package testpaper;

public class Test3 {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("M");
		StringBuffer b=new StringBuffer("N");
		
		mergerData(a,b);
		System.out.println(a+" "+b);
	}

	private static void mergerData(StringBuffer a, StringBuffer b) {
		a.append(b);
		b=a;
	}

}
