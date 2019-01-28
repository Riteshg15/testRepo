package Others;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		
		//isDisplayed method: applicable for all the elements.
		boolean b1=driver.findElement(By.name("submitButton")).isDisplayed();//submit button
        System.out.println(b1);	
        
        //isEnabled():
        boolean b2=driver.findElement(By.name("submitButton")).isEnabled();//submit button
        System.out.println(b2);
        
        //select I Agree checkbox:
        driver.findElement(By.name("agreeTerms")).click();
        boolean b3=driver.findElement(By.name("submitButton")).isEnabled();//submit button
        System.out.println(b3);
        
        //isSelected
        boolean b4=driver.findElement(By.name("agreeTerms")).isSelected();
        System.out.println(b4);
        
        driver.findElement(By.name("agreeTerms")).click();
        boolean b5=driver.findElement(By.name("agreeTerms")).isSelected();
        System.out.println(b5);
        
        
	}

}
