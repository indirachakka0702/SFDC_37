package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC11 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//li[@id='Account_Tab']")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("JAVA");
		driver.findElement(By.xpath("//input[@id='devname']")).click();
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
	}

}
