package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC33  extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//li[@id='home_Tab']")));
		driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='hoverItem68']")));
	    String expected =driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")).getText();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']")));
	    String actual = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']")).getText();
	    actual = actual.trim();
	    if(expected.equals(actual))
	    {
	    	System.out.println("Test case Pass");
	    }
	    else
	    {
	    	System.out.println("Test case Fail");
	    }
        Thread.sleep(3000);
        quitBrowser();
	}

}
