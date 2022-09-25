package selenium;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SeleniumTest {
	static WebDriver driver=null;
	
	public static void main(String[] args) {
		String[] st= {"Brocolli", "Cauliflower"};
		List as=Arrays.asList(st);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//https://rahulshettyacademy.com/AutomationPractice/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> d=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0;i<d.size();i++)
	{
		int j=0;
		String s=d.get(i).getText();
		s=s.split(" ")[0];
		if(as.contains(s)&&(j<3))
		{
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			j++;
			System.out.println(s);
		}
		//System.out.println(s);
	}

	 driver.close();

	}




}
