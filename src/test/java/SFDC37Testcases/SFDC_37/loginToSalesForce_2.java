package SFDC37Testcases.SFDC_37;

public class loginToSalesForce_2 extends BrowserUtility1{

	public static void main(String[] args) {
		launchBrowser("ch");
		loginToBrowser();
		String actualUrl = "https://na172.salesforce.com/setup/forcecomHomepage.apexp?setupid=ForceCom";
		String expectedUrl = driver.getCurrentUrl();
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("Test case Pass");
		}
		else
		{
			System.out.println("Test case Fail");
		}

	}

}
