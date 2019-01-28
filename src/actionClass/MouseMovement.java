package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//li[@id='header-addons']"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Travel Insurance")).click();
		
	} 

}
