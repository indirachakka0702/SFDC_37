package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC15 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("tryLexDialogX")).click();
        
        waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='open']")));
        System.out.println(driver.findElement(By.xpath("//select[@id='open']")).getText());
		Thread.sleep(4000);
		
	}

}
