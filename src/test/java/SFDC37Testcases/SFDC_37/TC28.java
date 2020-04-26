package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC28 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='fcf']")));
	    WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
	    Select dropdown = new Select(view);
	    dropdown.selectByIndex(4);
	    driver.findElement(By.xpath("//input[@name='go']")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//form[@id='00B5w00000D7UTI_actionForm']")));
		if(driver.findElement(By.xpath("//form[@id='00B5w00000D7UTI_actionForm']")).isDisplayed())
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
