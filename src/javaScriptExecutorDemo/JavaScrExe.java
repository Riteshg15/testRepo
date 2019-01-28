package javaScriptExecutorDemo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
//public class JavaScriptExecutor {
public class JavaScrExe {
 
public static void main(String[] args) throws IOException {
 
// Path of geckodriver
System.setProperty("webdriver.firefox.marionette","E:\\Selenium Driver\\geckodriver.exe");
 
// Initialize WebDriver
WebDriver driver = new FirefoxDriver();
 
// Wait For Page To Load
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 
// Go to URL
driver.get("http://www.stqatools.com/");
 
// Maximize Window
driver.manage().window().maximize();
 
// How to generate Alert Pop window in selenium ?
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("alert('hello world!');");
 
// How to get innertext of the entire webpage in Selenium?
String sText = js.executeScript("return document.documentElement.innerText;").toString();
 
// How to navigate to different page using Javascript?
js.executeScript("window.location = 'https://www.stqatools.com'");
 
// How to enter value into textbox:
js.executeScript("document.getElementById('email').value=sandeep@stqatools.com'");
 
// How to click a button:
js.executeScript("document.querySelector('#enterimg').click()");
 
// How to refresh a window:
js.executeScript("history.go(0)");
 
// How to get the text of a particular web element:
String text = js.executeScript("return document.getElementById('btn2').innerHTML").toString();
System.out.println("WebElement Text is : " + text);
 
// How to get the title of the WebPage:
String title = js.executeScript("return document.title").toString();
System.out.println("Page Title is : " + text);
 
// How to scroll vertically for certain pixels:
js.executeScript("window.scrollBy(0,500)");
 
// How to scroll till the bottom of the web page:
js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
 
// How to scroll to a particular element:
js.executeScript("document.querySelector('#countries').scrollIntoView()");
 
// How to navigate back to page:
js.executeScript("window.history.back()");
 
// How to navigate to forward page:
js.executeScript("window.history.forward()");
 
}
 
}


