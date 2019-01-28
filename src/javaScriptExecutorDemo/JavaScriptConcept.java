package javaScriptExecutorDemo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptConcept {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/
		driver.get("https://www.freecrm.com/");
		Thread.sleep(2000);
		//driver.findElement(By.name("username")).sendKeys("rvgawande");
		//driver.findElement(By.name("password")).sendKeys("tiger123");;
	//driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	WebElement button=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	
	/*WebElement ele= driver.findElement(By.xpath("//input[@type='email' and @id='email']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	
	WebElement ele1=driver.findElement(By.xpath("//input[@type='password' and @id='pass']"));
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele1);
	
	WebElement ele2=driver.findElement(By.xpath("//input[@type='submit' and @id='u_0_2']"));
	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: black; border: 2px solid red;');", ele2);
	
*/
	
	//flash(element, driver);
	
	drawBorder(button,driver);
	/*//take screenshot
	File src=   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src,new File("./Screenshot/element.png"));*/
	
	//generateAlert(driver, "There is an issue with login button on login page");
	//click on any element by using JS-executor
	clickElementByJS(button,driver);
	
	//driver.navigate().refresh(); //by selenium
	
	refreshBrowserByJS(driver);
	}
	
	/*public static void generateAlert(WebDriver driver,String message) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
		
	}*/
	public static void clickElementByJS(WebElement button,WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
	}
	
	public static void refreshBrowserByJS(WebDriver driver){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go[0]");
	}
	/*public static void flash(WebElement element,WebDriver driver )	{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript(arg0, arg1)
			String bgcolor=element.getCssValue("backgroundColor");
			
			for (int i = 0; i < 10; i++) {
				changeColor("rgb(200,0,0)",element,driver);
				changeColor(bgcolor,element,driver);
			}
		}
     public static void changeColor(String color, WebElement element, WebDriver driver) {
    	 JavascriptExecutor js=(JavascriptExecutor)driver;
    	 js.executeScript("argument[0].style.backgroundcolor= '" +color+"'",element);
    	 try{
    		 Thread.sleep(2000);
    	 }catch (Exception e) {
			
		}*/
	

	public static void drawBorder(WebElement button, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border= '3px solid red'" , button);
	}
}


