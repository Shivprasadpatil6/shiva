package testLayer1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer1.AddCustomerPage;
import pageLayer1.HomePage;
import pageLayer1.ManagerPage;

public class AddNeWCustomer {
	
	public static void main(String[]args) throws InterruptedException
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		     HomePage  home_obj=new HomePage(driver);
	        home_obj.clickOnCustomerLoginButton();
	        ManagerPage manager_obj=new ManagerPage(driver);
	        manager_obj.clickAddCustomerButton();
	        AddCustomerPage addcustomer_obj=new AddCustomerPage(driver);
	        addcustomer_obj.enterFirstName("shivprasad");
	        Thread.sleep(2000);
	        addcustomer_obj.enterLastName("patil");
	        Thread.sleep(1000);
	        addcustomer_obj.enterPostcode("422010");
	        Thread.sleep(1000);
	        addcustomer_obj.clickOnAddCustomer();
	        addcustomer_obj.clickOnAlertPopup();
	        
		
		
		
	}
	
	
	
}
