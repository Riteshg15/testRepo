package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class LocatorConcept {
 public static void main(String[] args) {
		
  System.setProperty("webdriver.chrome.driver","E:\\Selenium Driver\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fb%2FUnder-10%2Fbn_7001623770%3F_trkparms%3D");
  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ritesh"); 
  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gawande");
  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ritesh@gmail.com");
  driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("55555");
  //driver.findElement(By.xpath("//input[@name='checkbox-default']")).click();
  	}
}
