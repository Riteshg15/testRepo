package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		/*action.clickAndHold(driver.findElement(By.xpath(".//*[@id='draggable']"))).moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']")))
		.release().build().perform();
		*/
		WebElement element=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement ele2=driver.findElement(By.xpath(".//*[@id='droppable']"));
		action.dragAndDrop(element, ele2);
        		
	}

}
