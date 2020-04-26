package SFDC37Testcases.SFDC_37;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TC08 extends BrowserUtility1{

	public static void main(String[] args) {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='userNavMenu']")).getText());
        driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']")).click();
        ArrayList <String>windowTabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(windowTabs.get(1));
		driver.close();
	}

}
