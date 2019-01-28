package Others;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	driver.get("file:///E:/Selenium%20Software/Offline%20Website/pages/examples/dashboard.html");
	
	//1.Get the total counts of links on the page.
	//2.Get the text of each links on the page.
	// All the links are represented by <a> html tag.
		
	List<WebElement>linklist=driver.findElements(By.tagName("a"));
	System.out.println(linklist.size());
	
	for (int i = 0; i <linklist.size(); i++) {
		String link=linklist.get(i).getText();
		System.out.println(link);
	}
  }
}
