package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	    driver.findElement(By.xpath("//a[contains(text(),'Sunday April 26, 2020')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")).click();
	    Thread.sleep(2000);
	   waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='evt5']")));
	    driver.findElement(By.xpath("//img[contains(@class,'comboboxIconOn')]")).click();
	   Alert a1 = driver.switchTo().alert();
	   driver.findElement(By.xpath("//a[contains(text(),'Other')]")).click();
	   WebElement endTime = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	   Select dropdown1 = new Select(endTime);
	   dropdown1.selectByVisibleText("9:00 PM");
	   driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
	   waitForPageElementToVisible(driver.findElement(By.xpath("(//div[contains(@class,'multiLineEventBlock dragContentPointer')])[1]")));
	   driver.findElement(By.xpath("(//div[contains(@class,'multiLineEventBlock dragContentPointer')])[1]")).click();
	   driver.findElement(By.name("comboboxIcon")).click();
	}	

}
