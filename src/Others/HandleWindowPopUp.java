package Others;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();
		
		String parentwindowId=it.next();
		System.out.println("parent window id "+ parentwindowId);
		String childwindowId=it.next();
		System.out.println("child window id "+ childwindowId);
		
		driver.switchTo().window(childwindowId);
		Thread.sleep(2000);
		System.out.println("child window popup title" + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentwindowId);
		Thread.sleep(2000);
		System.out.println("parent window popup title" + driver.getTitle());
		
	}

}
