package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class TC19 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("tryLexDialogX")).click();
        Thread.sleep(2000);
        WebElement interval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
        Select dropdown = new Select(interval);
        dropdown.selectByIndex(0);       
        WebElement include = driver.findElement(By.xpath("//select[@id='open']"));
        Select dropdown1 = new Select(include);
        dropdown1.selectByIndex(0);
        driver.findElement(By.xpath("(//table//input[contains(@name,'go')])[2]")).click();
        Thread.sleep(2000);
        String expectedReport = "Opportunity Report";
        String actualReport = driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']")).getText();
        if(expectedReport.equals(actualReport))
        {
        	 System.out.println("Test case Pass");
        }
        else 
        {
            System.out.println("Test case Fail");	
        }
	}

}
