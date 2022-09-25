package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locater {
	public static void main(String[] args) throws InterruptedException {
		String name="rahul";
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//logintest(driver, name);
		
		forgetPassword(driver);

	}
/**
 * 
 * @param driver
 * @throws InterruptedException
 */
	private static void forgetPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		/*
		 * String text=driver.findElement(By.cssSelector(".reset-pwd-btn")).getText();
		 * System.out.println(text);
		 */
		String pass=driver.findElement(By.cssSelector("form p")).getText();
		String pass1=pass.split("'")[1];
		System.out.println(pass1);
		driver.close();
		
		
	}

	private static void logintest(WebDriver driver, String name) throws InterruptedException {
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(3000);
		String st=driver.findElement(By.tagName("p")).getText();
		System.out.println(st);
		Assert.assertEquals(st, "You are successfully logged in.");
		
		String name1=driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		System.out.println(name1);
		Assert.assertEquals(name1, "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
	}

}
