package SFDC37Testcases.SFDC_37;

import java.util.ArrayList;

import org.openqa.selenium.By;

public class TC31 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
	    waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='fname']")));
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("ABCDE");
	    driver.findElement(By.xpath("//input[@id='devname']")).click();
	    driver.findElement(By.xpath("(//input[@name='cancel'])[1]")).click();
	   String view = driver.findElement(By.xpath("//select[@id='fcf']")).getText();
	   String[] viewList = view.split("\n");

	   String notexpected = "ABCDE";
	   int count =0;
	    for(int i=0;i<viewList.length;i++)
	    {
	    	if((viewList[i])!= notexpected)
	    	{
	    		count++;
	    	}
	    	else
	    	{
	    		System.out.println("Test case Fail");
	    	}
	    }
	    if(count!=0)
	    {
	    	System.out.println("Test case Pass");
	    }
	   
	    Thread.sleep(3000);
	    quitBrowser();
		

	}

}
