package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadText {
	public static void main(String[] args) {
		String line;
		int count=0;
		try {
			FileReader fr=new FileReader("Test.txt");
			BufferedReader br=new BufferedReader(fr);
			while((line=br.readLine())!=null)
			{
				String[] word=line.split(" ");
				count=count+word.length;
			}
			System.out.println(count);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
