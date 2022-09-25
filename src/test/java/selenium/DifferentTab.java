package selenium;

import java.util.Iterator;
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

public class DifferentTab {
	static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		WebElement wb= driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
		wb.click();
		switchToWindow(2);
		
		
		System.out.println("Window Titles" +driver.getTitle());
		driver.close();
		switchToWindow(1);
		System.out.println("Window Titles" +driver.getTitle());
		 
	}

	private static void switchToWindow(int index) {
		String winId=null;
		Set<String> winIds=driver.getWindowHandles();
		
		Iterator<String> it=winIds.iterator();
		for(int i=0;i<index;i++)
		{
			winId=it.next();
		}
		driver.switchTo().window(winId);
	}

}
