package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//test1();
		test2();
		
	

	}
	private static void test2() {
		driver.findElement(By.id("name")).sendKeys("Shri");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		String st=driver.switchTo().alert().getText();
		System.out.println(st);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		String st1=driver.switchTo().alert().getText();
		System.out.println(st1);
		driver.switchTo().alert().dismiss();
	}
	private static void test1() {
		driver.findElement(By.id("checkBoxOption1")).click();
		
		Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected(), true);
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
