package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC06 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")));
		driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
		Thread.sleep(5000);
		//waitForPageElementToVisible(driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']")));
		driver.switchTo().frame("contactInfoContentId");
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
		 waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='lastName']")));
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("chakka");
		driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")));
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")).click();
		driver.switchTo().frame(0);
		waitForPageElementToVisible(driver.findElement(By.xpath("//body[contains(text(),'Share an update')]")));
		driver.findElement(By.xpath("//body[contains(text(),'Share an update')]")).sendKeys("Hi");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
		String actual = "Hi";
		String expected = driver.findElement(By.xpath("//p[contains(text(),'Hi')]")).getText();
		if(actual.equals(expected))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}
		//driver.switchTo().parentFrame();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")));
		driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]")).click();;
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")));
		driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
		driver.findElement(By.xpath("//input[@id='chatterFile']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures");
		driver.findElement(By.xpath("//span[@id='userThumbnailPhoto']//img[@class='chatter-photo']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[@id='uploadLink']")));
		driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
		driver.switchTo().frame(driver.findElement(By.id("uploadPhoto")));
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures");
		driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:save']")).click();
		driver.switchTo().parentFrame();
		
		
	}

}
