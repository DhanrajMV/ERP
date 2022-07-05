package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/***
 * 
 * @author Dhanraj MV
 *
 */
public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter User Name']")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@placeholder='Enter Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@class='submit__input']")
	public WebElement captcha;
	
	@FindBy(xpath="(.//*[normalize-space(text()) and normalize-space(.)='Required field cannot be left blank'])[1]/following::button[1]")
	private WebElement loginButton;

	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getCaptcha() {
		return captcha;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
