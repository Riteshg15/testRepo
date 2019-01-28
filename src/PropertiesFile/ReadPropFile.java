package PropertiesFile;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, Exception {
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C://Users//Ritesh//Desktop//config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Dbname"));
		//System.out.println(prop.getProperty("TestURL"));
		
		String str=prop.getProperty("Email");
		System.out.println(str);
		String str1=prop.getProperty("browser");
	    System.out.println(str1);
	    String str2=prop.getProperty("TestURL");
	    System.out.println(str2);
	    
	    if (str1.equals("chrome")) {
	    	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		    driver=new ChromeDriver();
	    }else
	    if (str1.equals("firefox")) {
	    	System.setProperty("webdriver.firefox.marionette", "E:\\Selenium Driver\\geckodriver.exe");
		    driver=new FirefoxDriver();
		    
		    driver.get(str2);
		    Thread.sleep(4000);
		    
		    driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("Firstname"));
		    driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("Lastname"));
		    driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("Password"));
	    	
	    	}
		}
	}


