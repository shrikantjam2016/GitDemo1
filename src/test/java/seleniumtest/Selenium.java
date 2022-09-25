package seleniumtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Selenium {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//test1();
		// test2();
		 //autoSuggestiveDropDown();
		//endToend();
		calender();

	}

	private static void calender() throws InterruptedException {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	}

	private static void endToend() {
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		Assert.assertEquals(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected(), false);
		int count=driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		
	}

	private static void autoSuggestiveDropDown() throws InterruptedException {
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List<WebElement> wb=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement op:wb)
		{
			if(op.getText().equals("India"))
			{
				op.click();
			}
		}
		
	}

	private static void test1() throws InterruptedException {
		WebElement wb=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(wb);
		List<WebElement> ab=dropdown.getOptions();
		for(int i=0;i<ab.size();i++)
		{
			System.out.println(ab.get(i).getText());
		}
		System.out.println("Berofe click = "+driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		System.out.println("After selection = "+driver.findElement(By.id("divpaxinfo")).getText());
		
	}

	private static void test2() throws InterruptedException {
		/*
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@value='MAA']")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 */
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']")).click();
	}

}
