package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
/***
 * 
 * @author Dhanraj MV
 *
 */
public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
