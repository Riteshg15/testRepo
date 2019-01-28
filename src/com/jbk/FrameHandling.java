package com.jbk;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(" https://www.engprod-charter.net/");Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("alkesh"+Keys.TAB+"alkesh");
		driver.switchTo().alert().accept();
		
		
		/*driver.findElement(By.name("username")).sendKeys("riteshvg");
		driver.findElement(By.name("password")).sendKeys("gawande111");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	    */
	}

}
