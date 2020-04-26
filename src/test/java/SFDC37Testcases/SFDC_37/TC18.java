package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC18 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("tryLexDialogX")).click();
        waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
		String expectedReport ="Stuck Opportunities";
		String actualReport = driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']")).getText();
		if(expectedReport.equals(actualReport))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}

	}

}
