package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC16  extends BrowserUtility1{

	public static void main(String[] args) throws Exception{
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("tryLexDialogX")).click();
        waitForPageElementToVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='opp3']")));
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("Software_lead");
		driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@id='opp9']")).click();
		driver.findElement(By.xpath("//td[contains(text(),'28')]")).click();
	    WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
		Select dropdown = new Select(stage);
		dropdown.selectByIndex(3);
		driver.findElement(By.xpath("//input[@id='opp12']")).clear();
		driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@id='opp17']")).sendKeys("Accounting");
		WebElement leadSou = driver.findElement(By.xpath("//select[@id='opp6']"));
		Select dropdown1 = new Select(leadSou);
		dropdown1.selectByIndex(2);
		driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']")).click();;
	    String expectedText = "Software_lead";
	    String actualText = driver.findElement(By.xpath("//h2[contains(@class,'pageDescription')]")).getText();
	    if(expectedText.equals(actualText))
	    {
	    	System.out.println("Test case Pass");
	    }
	    else
	    {
	    	System.out.println("Test case Fail");
	    }
	}

}
