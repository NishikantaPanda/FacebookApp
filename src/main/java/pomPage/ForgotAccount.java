package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotAccount {

	@FindBy(id="identify_email")
	private WebElement searchaccbox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()='Privacy Policy']")
	private WebElement privacypolicy;
	
	public ForgotAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void searchAccount(String accname) {
		searchaccbox.sendKeys(accname);
	}
	
	public void searchBtn() {
		searchbtn.click();
	}
	
	public void privacyPolicy() {
		privacypolicy.click();
	}
	
	public WebElement privacyPolicyAddress() {
		return privacypolicy;
		
	}
	
	
	
}
