package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC32 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
	    driver.findElement(By.xpath("//input[@name='new']")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
	    driver.findElement(By.xpath("//input[@id='name_lastcon2']")).sendKeys("Indian");
	    driver.findElement(By.xpath("//input[@id='con4']")).sendKeys("Global Media");
	    driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save_new']")).click();
	    if(driver.findElement(By.xpath("//h2[@class='pageDescription']")).isDisplayed())
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
