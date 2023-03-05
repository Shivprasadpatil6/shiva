package pageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver driver;
	public AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//input[contains(@class,'form-control ng-pristine')])[1]")
	private WebElement firstname_txtbox;
	
	@FindBy (xpath="(//input[contains(@class,'form-control ng-pristine')])[2]")
	private WebElement lastname_txtbox;
	
	@FindBy(xpath="(//input[contains(@class,'form-control ng-pristine')])[3]")
	private WebElement postcode_txtbox;
	
	@FindBy(xpath="//button[text()='Add Customer']")
	private WebElement add_customer_btn;
	
	public void enterFirstName(String firstname)
	{
		firstname_txtbox.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		lastname_txtbox.sendKeys(lastname);
	}
	
	public void enterPostcode(String postcode)
	{
		postcode_txtbox.sendKeys(postcode);
	}
	
	public void clickOnAddCustomer()
	{
		add_customer_btn.click();
	}
	
	public void clickOnAlertPopup()
	{
		driver.switchTo().alert().accept();
	}
	
	 
	
	
	

}
