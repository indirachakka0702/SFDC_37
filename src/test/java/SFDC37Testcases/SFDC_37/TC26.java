package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC26 extends BrowserUtility1{
	
	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		driver.findElement(By.xpath("(//div//input[@name='save'])[1]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'controls')]")));
		if(driver.findElement(By.xpath("//div[contains(@class,'controls')]")).isDisplayed())
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
