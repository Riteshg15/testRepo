package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","E:\\Selenium Driver\\geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("http://www.stqatools.com");
	    
	 // Click on link to open iFrame
	 		driver.findElement(By.id("iFrame_Name")).click();
	  
	 		// Switch to Frame
	 		driver.switchTo().frame("iframe");
	  
	 		// Perform operation on Frame
	 		driver.findElement(By.id("tinymce")).sendKeys("Text_To_frame");
	  
	 		// Switch back to defaultContent
	 		driver.switchTo().defaultContent();
	  
	 		// Switch between one frame to another
	 		driver.switchTo().frame("iframe_1").switchTo().frame("iframe_2");
	  
	 	}
	}


