package Others;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TakeScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		//Take screenshot and store as a file format.
		File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Now copy the Screenshot to desired location using copyfile //method
		  //String currentdir = System.getProperty("user.dir");
		  FileUtils.copyFile(src,new File("./Screenshot/google.png"));
	}
}


//package capture_screenshot;

/*import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	@Test
	public void capturescreenshot() throws Exception {
		System.setProperty("webdriver.firefox.marionette", "E:\\Selenium Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Automation");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot/facebook.png"));
	   
        System.out.println("Screenshot taken");
		driver.quit();*/

	

