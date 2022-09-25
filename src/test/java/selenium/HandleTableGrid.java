package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTableGrid {
	static WebDriver driver=null;
public static void main(String[] args) {
	tableTest();
}

private static void tableTest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30345/srh-vs-rcb-3rd-match-indian-premier-league-2020");
	//https://rahulshettyacademy.com/AutomationPractice/
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement table1=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int coln=table1.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	//int rowC=
	
}
}
