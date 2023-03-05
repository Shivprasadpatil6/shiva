package pageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//buttonn[contains(text(),'Customer Login')]")
	private WebElement customer_login_btn;
	
	public void clickOnCustomerLoginButton()
	{
		customer_login_btn.click();
	}

}
