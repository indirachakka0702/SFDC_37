package SFDC37Testcases.SFDC_37;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;

public class forgotPassword_4A extends BrowserUtility1{

	public static void main(String[] args) {
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
		 driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		 waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='un']")));
		 driver.findElement(By.xpath("//input[@id='un']")).sendKeys(prop.getProperty("username"));
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 String checkYourMail =  driver.findElement(By.xpath("//div[@id='content']")).getText();
		 System.out.println(checkYourMail);
	}

}
