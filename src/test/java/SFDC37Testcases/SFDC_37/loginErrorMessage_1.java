package SFDC37Testcases.SFDC_37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginErrorMessage_1 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
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
	 driver.findElement(By.xpath("//input[@id='password']"));
	 driver.findElement(By.xpath("//input[@id='Login']")).click();
	 
	 String expectedOutput = "Please enter your password.";
	 String actualOutput = driver.findElement(By.xpath("//div[@id='error']")).getText();
	 System.out.println(actualOutput);
	 if(expectedOutput.equals(actualOutput))
	 {
		 System.out.println("Test case Pass");
	 }
	 else
	 {
		 System.out.println("Test case Fail");
	 }
	}

}
