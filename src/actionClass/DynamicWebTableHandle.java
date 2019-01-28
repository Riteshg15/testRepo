package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("rvgawande");
		driver.findElement(By.name("password")).sendKeys("tiger123");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		
	}

}
