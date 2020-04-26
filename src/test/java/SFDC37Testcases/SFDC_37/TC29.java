package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC29 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'CK')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'CK')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("(//div[contains(@class,'content')])[1]")));
		if(driver.findElement(By.xpath("(//div[contains(@class,'content')])[1]")).isDisplayed())
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
