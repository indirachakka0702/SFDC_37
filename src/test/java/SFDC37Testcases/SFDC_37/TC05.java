package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class TC05 extends BrowserUtility1{

	public static void main(String[] args) {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		String values= driver.findElement(By.xpath("//div[@id='userNav-menuItems']")).getText();
		System.out.println(values);

	}

}
