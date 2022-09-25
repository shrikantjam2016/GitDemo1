package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LiveDemo {
public static WebDriver driver;
List<WebElement> elemList;
	@BeforeTest
	public void launChBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//https://rahulshettyacademy.com/AutomationPractice/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void sorte()
	{
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//cappture all wbelement into list
		List<WebElement> elemList=driver.findElements(By.xpath("//tr/td[1]"));
		//capturing all webelemt text into new(original) list
		List<String> oList=elemList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort original lsit of step 3
		
		List<String> sortedList=oList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(oList.equals(sortedList));
		
		List<String> st=elemList.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVegg(s)).collect(Collectors.toList());
	     st.forEach(a->System.out.println(a));
	     
	     if((st.size()<1))
	     {
	    	 
	     }
	}
	


	private String getPriceVegg(WebElement s) {
		String st1=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return st1;
	}
	@Test
	public void test1()
	{
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> elemList=driver.findElements(By.xpath("//tr/td[1]"));
	List<WebElement> flteredList=	elemList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	Assert.assertEquals(elemList.size(), flteredList.size());
	}

}
