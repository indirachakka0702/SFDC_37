package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;

public class forgotPassword_4B extends BrowserUtility1{

	public static void main(String[] args) {
		launchBrowser("ch");
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("22131");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		String errMes = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(errMes);
	}

}
