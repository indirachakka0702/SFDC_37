package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC10 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")).click();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.xpath("//input[@name='new']")).click();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='acc2']")));
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("Selenium");
		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
		Select dropdown1 = new Select(type);
		dropdown1.selectByIndex(6);
		WebElement cusPri = driver.findElement(By.xpath("//select[@id='00N5w00000HYXL6']"));
		Select dropdown2 = new Select(cusPri);
		dropdown2.selectByIndex(1);
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(5000);
	}

}
