package seleniumtest;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCartApp {
	static  WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		allPdoduct();
	}
	private static void allPdoduct() {
		
		String[] prod= {"Cucumber","Brocolli"};
		List<WebElement> li=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<li.size();i++)
		{
			String a[]=li.get(i).getText().split("-");
		String ab=a[0].trim();
			List<String> al=Arrays.asList(prod);
			int j=0;
			if(al.contains(ab))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==prod.length)
					break;
			}
		}
		
	}

}
