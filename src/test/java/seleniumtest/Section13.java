package seleniumtest;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Section13 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
			//chromeOptionsTest();
			//deleteCookies();
			//takingScreenShot();
			brokenLink();
		
	}
	private static void brokenLink() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// a[href*=SoapUI]
		String b=driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

		System.out.println(b);
		
		try {
			HttpURLConnection conn=(HttpURLConnection) new URL(b).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode=conn.getResponseCode();
			System.out.println(respcode);
			
		
		
		
		// li[class='gf-li'] a
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert s=new SoftAssert();
		for(WebElement link:links)
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn1=(HttpURLConnection) new URL(url).openConnection();
			conn1.setRequestMethod("HEAD");
			conn1.connect();
			int respcode1=conn.getResponseCode();
			System.out.println(respcode1);
			
		s.assertEquals(respcode1>400, "The link with Text"+link.getText()+" is broken with code" +respcode1);
			
		}
		s.assertAll();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void takingScreenShot() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot d=(TakesScreenshot) driver;
		File src=d.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("D:\\Screenshot.jpg") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static void deleteCookies() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().addCookie(null);
		driver.manage().deleteCookieNamed("asdf");
		
	}
	private static void chromeOptionsTest() {
		ChromeOptions op=new ChromeOptions(); //Also block pop up dialogs
		Proxy px=new Proxy();
		px.setHttpProxy("ipaddress:4444");
		//SSL certificate accept
		op.setAcceptInsecureCerts(true);
		//Setting Proxy to chrome behavaoiur 
		op.setCapability("proxy", px);
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
	}

}
