package SFDC37Testcases.SFDC_37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC07 extends BrowserUtility1{

	public static void main(String[] args) throws Exception {
		launchBrowser("ch");
		loginToBrowser();
		waitForPageElementToVisible(driver.findElement(By.xpath("//span[@id='userNavLabel']")));
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		Thread.sleep(3000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//div[@id='PersonalInfo']")));
		driver.findElement(By.xpath("//div[@id='PersonalInfo']")).click();
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Download ')]")).getText());
		driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
		driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
	    WebElement content= driver.findElement(By.xpath("//select[@id='p4']"));
		Select dropDown1 = new Select(content);
		dropDown1.selectByIndex(8);
		Thread.sleep(1000);
		waitForPageElementToVisible(driver.findElement(By.xpath("//select[@id='duel_select_0']")));
		WebElement ele =driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));	
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");*/
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",ele);
		driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
		driver.findElement(By.xpath("//div[@id='EmailSetup']")).click();
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='sender_name']")));
		driver.findElement(By.xpath("//input[@id='sender_name']")).sendKeys("Induc");
		driver.findElement(By.xpath("//input[@id='sender_email']")).sendKeys("indira0702@gmail.com");
		WebElement yes= driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
		yes.click();
		driver.findElement(By.xpath("//input[@name='save']")).click();
		driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
		driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
		waitForPageElementToVisible(driver.findElement(By.xpath("//input[@id='testbtn']")));
		driver.findElement(By.xpath("//input[@id='testbtn']")).click();
		
	}

}
