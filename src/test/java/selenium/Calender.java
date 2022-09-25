package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	static WebDriver driver=null;
	public static  void calenderTest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	//https://rahulshettyacademy.com/AutomationPractice/
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"travel_date\"]"));
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", ele);
	
	ele.sendKeys(Keys.ENTER);
	List<WebElement> c=driver.findElements(By.className("day"));
	int siz=c.size();
	for(int i=0;i<siz;i++)
	{
		String text=driver.findElements(By.className("day")).get(i).getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("23"))
		{
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
	}
			
	}
	
	public static void main(String[] args) {
		calenderTest();
		
	}

}
