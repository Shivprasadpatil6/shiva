package pageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {
	
	public ManagerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="")
	private WebElement add_customer_btn;
    
	@FindBy (xpath="")
	private WebElement open_account_btn;
	
	@FindBy (xpath="")
	private WebElement customers_btn;
	
	//action class
	
	
	public void clickAddCustomerButton()
	{
		add_customer_btn.click();
	}
	
	public void clickOpenAccountButton()
	{
		open_account_btn.click();
	}
	public void clickCustomersButton()
	{
		customers_btn.click();
	}
	
	
}
