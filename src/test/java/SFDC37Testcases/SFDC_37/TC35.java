package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC35 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//img[contains(@class,'allTabsArrow')]")));
		driver.findElement(By.xpath("//img[contains(@class,'allTabsArrow')]")).click();
		Thread.sleep(2000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='customize']")));
		driver.findElement(By.xpath("//input[@name='customize']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Subscriptions')]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//select[@id='duel_select_1']//option[contains(text(),'Subscriptions')]")).click();
		driver.findElement(By.xpath("//img[@class='leftArrowIcon']")).click();
		driver.findElement(By.xpath("(//td//input[contains(@name,'save')])[2]")).click();
	    driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	    Thread.sleep(2000);
		loginToBrowser();
		 String view = driver.findElement(By.xpath("//ul[@id='tabBar']")).getText();
		 String notexpected = "Subscriptions";
		   
		    	if(view.contains(notexpected))
		    	{
		    		System.out.println("Test case Fail");
		    	}
		    	else
		    	{
		    		System.out.println("Test case Pass");
		    	}
		   Thread.sleep(3000);
		    quitBrowser();
			
	}
}
