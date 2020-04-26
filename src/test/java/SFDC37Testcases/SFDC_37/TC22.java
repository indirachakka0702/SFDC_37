package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC22 extends BrowserUtility1 {

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(3000);
	    WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
	    Select dropdown = new Select(view);
	    dropdown.selectByIndex(1);
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    Thread.sleep(3000);
	    loginToBrowser();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(4000);
	    waitForPageElementToVisible(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='00B5w00000D7USN_topNav']")));
		if(driver.findElement(By.xpath("//div[@id='00B5w00000D7USN_topNav']")).isDisplayed())
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
	    

	}

}
