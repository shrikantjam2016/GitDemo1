package testpaper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {
	
	private static void testing1()
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
		System.out.println("Your list of elements in ArrayList : " + num);
		HashSet<Integer> h=new HashSet<Integer>(num);
		
		num.clear();
		num.addAll(h);
		
		System.out.println(h);

		
	}
	
	
	
	public static void main(String[] args) {
		
			//testing2();
			//testing1();
			//testing3();
			//testing4();
			randomNumberGenerator();
			
		
			
	}



	private static void randomNumberGenerator() {
		Random random=new Random();
	random.ints(1, 100).limit(10).sorted().forEach(System.out::println);
	
		
	}



	private static void testing4() {
		List<Integer> ab=Arrays.asList(2,8,9,1,3,5);
		ab.stream().sorted().forEach(s->System.out.print(s+" "));
		
		System.out.println();
		System.out.println("+++++++++++++");
		
		ab.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
	}



	private static void testing3() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Londan time"+Keys.ENTER);
		////*[@id="rso"]/div[2]/div/div/div/div/div/div[1]/div/a/h3
		WebElement firstLink=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div/div/div/div/div[1]/div/a/h3"));
		System.out.println(firstLink);
		
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).moveToElement(firstLink).click().perform();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		
		
	}



	private static void testing2() {
		String st="Hello Java concept of the day of the day";
		String[] sp=st.split(" ");
		
		HashMap<String, Integer> ab=new HashMap<>();
		
		for(int i=0;i<sp.length;i++)
		{
			if(ab.containsKey(sp[i]))
			{
				ab.put(sp[i], ab.get(sp[i])+1);
			}
			else
			{
				ab.put(sp[i], 1);
			}
		}
		System.out.println(ab);
		
	}

}
