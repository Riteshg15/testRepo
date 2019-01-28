package Others;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class UnitHtmlDriver {
	public static void main(String[] args) throws IOException, Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
     WebDriver driver=new HtmlUnitDriver();
		/*Advantage
		Testing is happening behind the scene--no browser is launch.
		very fast--execution of testcases--performance of the script
		*/
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		Thread.sleep(3000);
		System.out.println("Before logging:-" + driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("rvgawande");
		driver.findElement(By.name("password")).sendKeys("tiger123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("After logging" + driver.getTitle());
	} 
}
