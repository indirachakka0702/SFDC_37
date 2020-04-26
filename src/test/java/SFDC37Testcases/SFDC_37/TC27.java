package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC27 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
	    WebElement recent = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
	    Select dropdown = new Select(recent);
	    dropdown.selectByIndex(0);
	    waitForPageElementToVisible(driver.findElement(By.xpath("//div[@class='bFilterView']")));
		if(driver.findElement(By.xpath("//div[@class='bFilterView']")).isDisplayed())
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
