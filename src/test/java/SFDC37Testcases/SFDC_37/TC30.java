package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC30 extends BrowserUtility1 {

	public static void main(String[] args)  throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='devname']")));
	    driver.findElement(By.xpath("//input[@id='devname']")).sendKeys("EFGH");
	    driver.findElement(By.xpath("(//input[@name='save'])[1]")).click();
	    if(driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]")).isDisplayed())
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
