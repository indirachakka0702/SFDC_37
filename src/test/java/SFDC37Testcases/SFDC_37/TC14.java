package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC14 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("tryLexDialogX")).click();
	
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[@id='ext-gen148']")));
		driver.findElement(By.xpath("//img[@id='ext-gen148']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Created Date')]")).click();
        driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		driver.findElement(By.xpath("//table[@id='ext-comp-1112']")).click();
		
		driver.findElement(By.xpath("//img[@id='ext-gen154']")).click();
		driver.findElement(By.xpath("//table[@id='ext-comp-1114']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ext-gen63']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[contains(@name,'memorizenew')]")));
		driver.findElement(By.xpath("//input[contains(@name,'memorizenew')]")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='report_name']")));
		driver.findElement(By.xpath("//input[@id='report_name']")).sendKeys("JavaScript");
		driver.findElement(By.xpath("//input[@id='devName']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	}

}
