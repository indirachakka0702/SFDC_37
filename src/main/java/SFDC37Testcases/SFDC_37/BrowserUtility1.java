package SFDC37Testcases.SFDC_37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility1 {
	public static WebDriver driver = null;
	
	static void launchBrowser(String sBrowser)
		{
			if(sBrowser.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
			else
			{
				System.out.println("You have not given browser type correctly");
			}
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com/");
		}
		
		 static void quitBrowser()
		 {
			 driver.quit();
		 }
		 static void loginToBrowser()
		 {

			  File file = new File("C:\\Users\\chapa004\\Documents\\Indu\\Workspaces\\Eclipse\\JavaTraining\\SFDC_37/test1.properties");
			 FileInputStream fileInput = null;
			  try
			  {
				   fileInput = new FileInputStream(file);
				  
			  }
			  catch(FileNotFoundException e)
			  {
				  System.out.println(e);
			  }
			  
			  Properties prop = new Properties();
			  try
			  {
				  prop.load(fileInput);
			  }
			  catch(Exception a)
			  {
				  System.out.println(a);
			  }
				
			  waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='username']")));
			 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(prop.getProperty("username"));
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("password"));
			 driver.findElement(By.xpath("//input[@id='Login']")).click();
		 }
		 static void  waitForPageElementToVisible(WebElement eleToWait)
		 {
			 WebDriverWait wait = new WebDriverWait(BrowserUtility1.driver,30);
			 wait.until(ExpectedConditions.visibilityOf(eleToWait));
		 }
	}


