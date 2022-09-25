
package 
selenium;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LaunchWindowTab {
	static WebDriver driver=null;
	
	public static void main(String[] args) {
	//	switchToFrameTest();
		try {
			printLinkCount();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
	 //driver.close();

	}

	private static void printLinkCount() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//https://rahulshettyacademy.com/AutomationPractice/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Count of links on the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Size of links on footer
		WebElement wb=driver.findElement(By.id("gf-BIG"));
		System.out.println(wb.findElements(By.tagName("a")).size());
		
		//Links count of first coloumn of footer section
		WebElement wb1=wb.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int siz=wb1.findElements(By.tagName("a")).size();
		System.out.println(siz);
		
		//Click on each link in coloumn and check if page is openeing 
		for(int i=0;i<siz;i++)
		{
			String st2=Keys.chord(Keys.CONTROL, Keys.ENTER);
			wb1.findElements(By.tagName("a")).get(i).sendKeys(st2);
			Thread.sleep(2000);
			
		}
		Set<String> win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window( it.next());
			System.out.println(driver.getTitle());
		Thread.sleep(2000);
		}
		
		driver.close();
	}

	private static void switchToFrameTest() {
		String[] st= {"Brocolli", "Cauliflower"};
		List as=Arrays.asList(st);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		//https://rahulshettyacademy.com/AutomationPractice/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement w=driver.findElement(By.id("draggable"));
		w.click();
		System.out.println("clickd successfully");
		Actions a=new Actions(driver);
		WebElement w1=driver.findElement(By.id("droppable"));
		a.dragAndDrop(w, w1).build().perform();
		driver.switchTo().defaultContent();
		
	}




}
