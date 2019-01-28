package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.ebay.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//Actions action=new Actions(driver);
	
  }
}
