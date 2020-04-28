package SFDC37Testcases.SFDC_37;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC36 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("tryLexDialogX")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='calToday']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")));
		driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")).click();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.className("comboboxIcon")));
		driver.findElement(By.className("comboboxIcon")).click();
		ArrayList <String>windowTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(1));
		driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
		driver.switchTo().window(windowTabs.get(0));
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='EndDateTime_time']")));
		driver.findElement(By.xpath("//input[@id='EndDateTime_time']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[@id='timePickerItem_42']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		Thread.sleep(2000);
		quitBrowser();
	}	

}
