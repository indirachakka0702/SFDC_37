package SFDC37Testcases.SFDC_37;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TC37 extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Home')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.id("tryLexDialogX")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//td[@class='calToday']")).click();
	   waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")));
	    driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]")).click();
	    Thread.sleep(2000);
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
		driver.findElement(By.xpath("//div[@id='timePickerItem_38']")).click();
		driver.findElement(By.xpath("//input[@id='IsRecurrence']")).click();
		driver.findElement(By.xpath("//input[@id='rectypeftw']")).click();  //weekly selection
		driver.findElement(By.xpath("//input[@id='RecurrenceStartDateTime']")).click();
		driver.findElement(By.xpath("//a[@class='calToday']")).click();
		
		String oldDate = "4/27/2020";  
		System.out.println("Date before Addition: "+oldDate);
		//Specifying date format that matches the given date
		SimpleDateFormat sdf = new SimpleDateFormat("m/dd/yyyy");
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(oldDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		   
		//Number of Days to add
		c.add(Calendar.DAY_OF_MONTH, 2);  
		//Date after adding the days to the given date
		String newDate = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		System.out.println("Date after Addition: "+newDate);
	   driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']")).sendKeys(newDate);
	   driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]")).click();
	   driver.findElement(By.xpath("//img[contains(@class,'monthViewIcon')]")).click();
	  if(driver.findElement(By.xpath("//td[contains(@class,'calToday')]")).isDisplayed())
	   {
		  System.out.println("Test case pass");
		  
	   }
	   else
	   {
		   System.out.println("Test case Fail");
	   }
	  quitBrowser();
	}

}
