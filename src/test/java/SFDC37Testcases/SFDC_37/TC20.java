package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC20 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(3000);
	    String expectedText = "Home";
		String actualText = driver.findElement(By.xpath("//h2[@class='pageDescription']")).getText();
		if(expectedText.equals(actualText))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
	}

}
