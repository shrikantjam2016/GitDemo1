package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	static WebDriver driver=null;
	
	
	public static void main(String[] args) {
		autoDropDown();
	}


	private static void autoDropDown() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		//https://rahulshettyacademy.com/AutomationPractice/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.id("fromCity")).sendKeys("Mum");
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		
		
	}

}
