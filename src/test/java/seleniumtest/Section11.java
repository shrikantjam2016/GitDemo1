package seleniumtest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section11 {
	static  WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//click count of links
		linksTest();
	}

	private static void linksTest() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int count=driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		WebElement wb=driver.findElement(By.id("gf-BIG"));
		int count1=wb.findElements(By.tagName("a")).size();
		System.out.println(count1);
		
		WebElement foot=wb.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(foot.findElements(By.tagName("a")).size());
		
		for(int i=1;i<foot.findElements(By.tagName("a")).size();i++)
		{
			String select=Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			//foot.findElements(By.tagName("a")).get(i).click();
			
			foot.findElements(By.tagName("a")).get(i).sendKeys(select);
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
			Set<String> ab=driver.getWindowHandles();
			
			Iterator<String> st=ab.iterator();
			while(st.hasNext())
			{
				driver.switchTo().window(st.next());
				System.out.println(driver.getTitle());
			}
		
		
	}

}
