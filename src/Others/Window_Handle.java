package Others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handle {
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.firefox.marionette","E:\\Selenium Driver\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		 
		driver.get("http://www.popuptest.com/goodpopups.html");
		 
		// Current window location store into Parent Window string.
		String parentWindow = driver.getWindowHandle();
		 
		// Click some link that opens a new window.
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		 
		// Store newly open window into Child Window using getWindowHandles.
		for (String childWindow : driver.getWindowHandles()) {
		 
		// Switch to Newly open window using switchTo().
		driver.switchTo().window(childWindow);
		 
		}
		 
		// Close newly opened window when done with it.
		driver.close();
		 
		// switch back to the Parent window.
		driver.switchTo().window(parentWindow);
		 
		}

}
