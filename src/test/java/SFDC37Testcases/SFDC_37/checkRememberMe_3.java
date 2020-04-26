package SFDC37Testcases.SFDC_37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class checkRememberMe_3 extends BrowserUtility1 {

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
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("password"));
			 WebElement rememberMe = driver.findElement(By.xpath("//label[@class='fl pr db tn3']"));
			 rememberMe.click();
			 driver.findElement(By.xpath("//input[@id='Login']")).click();
			 
			 String actualOutput ="Indirapriyadarsi...";
			 String expectedOutput = driver.findElement(By.xpath("//span[@id='userNavLabel']")).getText();
			 if(actualOutput.equals(expectedOutput))
			 {
				 System.out.println("Test case Pass");
			 }
			 else
			 {
				 System.out.println("Test case Fail");
			 }
			 driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
			 /*WebElement ele= driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			 Select dropDown1 = new Select(ele);
			 dropDown1.selectByIndex(4);*/
			 waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
			 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			    
			 
	}

}
