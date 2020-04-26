package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC21 extends BrowserUtility1 {

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(3000);
	    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
		System.out.println(driver.findElement(By.xpath("//select[@id='fcf']")).getText());

	}

}
