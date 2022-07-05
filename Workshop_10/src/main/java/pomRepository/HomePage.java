package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/***
 * 
 * @author Dhanraj MV
 *
 */
public class HomePage extends BasePage {

	public HomePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(id="myAccountButton")
	private WebElement guestDropDown;
	
	@FindBy(linkText="Log Out")
	private WebElement logOut;
	
	@FindBy(xpath="//button[contains(text(),'Delete Account')]")
	private WebElement logOutDeleteButton;

	@FindBy(id="closeSignUpButton")
	private WebElement closeSignUpButton;
	
	@FindBy(xpath="(//a[contains(.,'Invoices')])[2]")
	private WebElement invoice; 
	
  	@FindBy(linkText="Clients")
	private WebElement clientLink;
	
	@FindBy(linkText="Products") 
	private WebElement productsLink;
  
	public WebElement getInovice() {
		return invoice;
	}
	
	public WebElement getClientLink() {
		return clientLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getGuestDropDown() {
		return guestDropDown;
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getLogOutDeleteButton() {
		return logOutDeleteButton;
	}
	
	public WebElement getCloseSignUpButton() {
		return closeSignUpButton;
	}

	//Business Logics
	public void logOut() {
		getGuestDropDown().click();
		getLogOut().click();
	}
}

	

