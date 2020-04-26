package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC34 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
	
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//li[@id='home_Tab']")));
		driver.findElement(By.xpath("//li[@id='home_Tab']")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")));
	    driver.findElement(By.xpath("//h1[@class='currentStatusUserName']")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")));
	    driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img")).click();
	    Thread.sleep(2000);
	    driver.switchTo().frame("contactInfoContentId");
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
	    driver.findElement(By.xpath("//input[@id='lastName']")).clear();
	    driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Abcd");
	    driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
	    String actual = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']")).getText();
	    if(actual.contains("Abcd"))
	    {
	    	System.out.println("Test case Pass");
	    }
	    else
	    {
	    	System.out.println("Test case Fail");
	    }

	}

}
