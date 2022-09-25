package seleniumtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		scrollDown();
	}
	private static void scrollDown() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Thread.sleep(2000);
		//document.querySelector(".tableFixHead").scrollTop=5000
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> l=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int calc=0;
		for(int i=0;i<l.size();i++)
		{
			String st=l.get(i).getText();
			int val=Integer.parseInt(st);
			calc=calc+val;
			
			
		}
		System.out.println(calc);
		
		String output=driver.findElement(By.cssSelector(".totalAmount")).getText();
		String a=output.split(":")[1].trim();
		int val2=Integer.parseInt(a);
		
		if(calc==val2)
		{
			System.out.println("Value is matched");
		}
		
	}

}
