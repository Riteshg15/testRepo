package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_Dropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","E:\\Selenium Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("file:///E:/Selenium%20Software/Offline%20Website/pages/examples/add_user.html");
	    
	    Select select=new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
	    select.selectByVisibleText("Maharashtra");
	}

}
