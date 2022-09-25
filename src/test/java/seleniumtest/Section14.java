package seleniumtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section14 {
	
	static  WebDriver driver;
	public static void main(String[] args) {
		//test1();
		//streamFilter();
		
		//sortedTableTest();
		
		filterTable();
		
		
	}

	private static void filterTable() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> ab=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), ab.size());
		
	}

	private static void sortedTableTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click on cloounm
		////th[@aria-label='Veg/fruit name: activate to sort column descending']
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all webelement into list
		
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		//Capture text of all webelement into list(original list
		List<String> ab=list.stream().map(s->s.getText()).collect(Collectors.toList());
		//sort original list
		List<String> sortedlist=ab.stream().sorted().collect(Collectors.toList());
		//compare org and sorted list
	//	Assert.assertTrue(ab.equals(sortedlist), " Test passed");
		
		//Scan the name column and if  get the text
		
		List<String> price;
		do
		{
			List<WebElement> list1=driver.findElements(By.xpath("//tr/td[1]"));
		price=list1.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVegMethod(s)).collect(Collectors.toList());
		System.out.println(price);
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}
		while(price.size()<1);
	}

	private static String getPriceVegMethod(WebElement e) {
		//e.findElement("following-sibling::td[1]")
		String st=e.findElement(By.xpath("following-sibling::td[1]")).getText();
		return st;
	}

	private static void streamFilter() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Man");
		list.add("Don");
		list.add("Can");
		list.add("Eon");
		list.add("Bob");
		list.add("Coba");
		
		List<String> l1=list.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
		l1.forEach(System.out::println);
		
		
		long count=list.stream().filter(s->s.startsWith("C")).count();
		System.out.println(count);
		
		
		/*
		 * list.stream().filter(s->s.length()>3).forEach(System.out::println);
		 * list.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		 * list.stream().filter(s->s.endsWith("n")).map(st->st.toUpperCase()).forEach(s-
		 * >System.out.println(s));
		 */
		list.stream().sorted().forEach(s->System.out.println(s));
		
		boolean b=list.stream().anyMatch(s->s.equalsIgnoreCase("Coba"));
		System.out.println(b);
		
		
		List<Integer> l2=Arrays.asList(3,4,5,6,7,2,12,3,4,5);
		List<Integer> st=l2.stream().distinct().sorted().collect(Collectors.toList());
		st.forEach(s->System.out.println(s));
		System.out.println(st.get(2));
	}

	private static void test1() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Man");
		list.add("Don");
		list.add("Can");
		list.add("Eon");
		list.add("Bob");
		list.add("Cob");
		int count=0;
		for(int i=0;i<list.size();i++)
		{
			String ab=list.get(i);
			
			if(ab.startsWith("C"))
			{
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
