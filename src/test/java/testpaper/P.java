package testpaper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class P {
public static void main(String[] args) {

	try {
		BufferedReader br=new BufferedReader(new FileReader("D:\\abcd.txt"));
		
		String ab=br.readLine();
		while(ab!=null)
		{
			System.out.println(ab);
			ab=br.readLine();
			
		}
		br.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
