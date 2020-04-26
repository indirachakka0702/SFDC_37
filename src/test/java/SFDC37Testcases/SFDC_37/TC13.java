package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC13 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")));
		driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		driver.findElement(By.id("tryLexDialogX")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='srch']")));
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
		driver.findElement(By.xpath("(//div//input[contains(@name,'goNext')])[2]")).click();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]")).click();
		Thread.sleep(3000);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		

	}

}
