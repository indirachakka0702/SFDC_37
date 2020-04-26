package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC37 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")).click();
	    Thread.sleep(2000);
	   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='evt5']")));
	    driver.findElement(By.xpath("//img[contains(@class,'comboboxIconOn')]")).click();
	    

	}

}
