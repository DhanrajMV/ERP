package leaveRequest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import genericLibrary.BaseTest;
import pomRepository.LoginPage;


/***
 * 
 * @author Dhanraj MV
 *
 */
public class TC_01 extends BaseTest {

	@Test
	public void login() throws InterruptedException{	
		
	driver.get(DEFAULT_URL);
	LoginPage loginpage=new LoginPage(driver);
	loginpage.getUsernameTextField().sendKeys("000851");;
	loginpage.getPasswordTextField().sendKeys("A");
	loginpage.getCaptcha().click();
	Thread.sleep(3000);
	WebElement signIn = loginpage.getLoginButton();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", signIn);
	
	
	
	
	}
}
