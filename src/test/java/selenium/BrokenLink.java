package selenium;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		brokenlink();
		
		//Open a link in NewTab in selenium
		openNewLink();
		
	}
	private static void openNewLink() {
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
	private static void brokenlink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//https://rahulshettyacademy.com/AutomationPractice/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert s=new SoftAssert();
		for(WebElement wb:links)
		{
			try
			{
			String st1=wb.getAttribute("href");
			HttpsURLConnection cn=(HttpsURLConnection) new URL(st1).openConnection();
			cn.setRequestMethod("HEAD");
			cn.connect();
			int responseCode=cn.getResponseCode();
			System.out.println(responseCode);
			s.assertTrue(responseCode>400, wb.getText()+"="+responseCode);
			
			}
			catch(Exception e)
			{
				System.out.println("kahia tari zala");
			}
			
		}
		s.assertAll();
	
		
	
	}


}
