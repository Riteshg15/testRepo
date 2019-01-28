package com.jbk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text=alert.getText();
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct Alert message");
		}else{
			System.out.println("in-correct Alert message");
		}
		
		alert.accept();
		//alert.dismiss();

	/*driver.get("https://html.com/input-type-file/");
	driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\Ritesh\\Desktop\\Extend.html");
	*/
   }


     public static boolean isAlertPresent(WebDriver driver){
    	try{
    		driver.switchTo().alert();
    		return true;
    		}
    	catch (NoAlertPresentException e) {
    		return false;
					}
    	}
}
        