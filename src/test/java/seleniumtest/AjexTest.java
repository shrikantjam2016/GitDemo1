package seleniumtest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjexTest {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//actionTest();
		//windowSwitch();
		iframeTest();
		
	}
	private static void iframeTest() {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
	}
	private static void windowSwitch() {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> win=driver.getWindowHandles();
		Iterator<String> ab=win.iterator();
		
		
			String wind=ab.next();
			String child=ab.next();
			driver.switchTo().window(child);
		
		String st=driver.findElement(By.cssSelector(".icon.fa.fa-envelope")).getText();
		System.out.println(st);
		
	}
	private static void actionTest() {
		driver.get("https://www.amazon.com/");
	Actions a=new Actions(driver);
		
		WebElement mov=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(mov).build().perform();
	}

}
