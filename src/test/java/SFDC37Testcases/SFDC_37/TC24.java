package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC24 extends BrowserUtility1{

	public static void main(String[] args)  throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Leads')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys("ABCD");
		WebElement leadStatus = driver.findElement(By.xpath("//select[@id='lea13']"));
	    Select dropdown = new Select(leadStatus);
	    dropdown.selectByIndex(1);
	    driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("(//div[contains(@class,'content')])[1]")));
		if(driver.findElement(By.xpath("(//div[contains(@class,'content')])[1]")).isDisplayed())
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
