package Java8;

import java.util.Random;

public class B extends A {
	
	 public static void main(String []argv)
	 {
		 
		int a=564;
		int b;
		b=a/10;
		
	 System.out.println(b);
	 System.out.println(a%10);
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
}
