package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAccount  {

	
	@FindBy(id="email")
	private WebElement emailId;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgotpassword;
	
	@FindBy(name="firstname")
	private WebElement firstnamebox;
	
	@FindBy(name="lastname")
	private WebElement lastnamebox;
	
	@FindBy(name="reg_email__")
	private WebElement emailbox;
	
	@FindBy(name="reg_email_confirmation__")
	private WebElement confirmemailbox;
	
	@FindBy(name="reg_passwd__")
	private WebElement passwordbox;
	
	@FindBy(name="birthday_day")
	private WebElement daydd;
	
	@FindBy(name="birthday_month")
	private WebElement monthdd;
	
	@FindBy(name="birthday_year")
	private WebElement yeardd;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement maleradio;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement femaleradio;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement customradio;
	
	@FindBy(name="websubmit")
	private WebElement signupbtn;
	
	public CreateNewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void accountEmailId(String email) {
		emailId.sendKeys(email);
	}
	
	public void accountPassword(String passwords) {
		password.sendKeys(passwords);
	}
	
	public void forgotPassowrdLink() {
		forgotpassword.click();
	}
	
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement newaccountlink;
	
	
	public void firstName(String firstname) {
		firstnamebox.sendKeys(firstname);
	}
	
	public void lastName(String lastname) {
		lastnamebox.sendKeys(lastname);
	}
	
	public void emailId(String eid) {
		emailbox.sendKeys(eid);
	}
	
	public void confirmEmailId(String ceid) {
		confirmemailbox.sendKeys(ceid);
	}
	
	public void password(String password) {
		passwordbox.sendKeys(password);
	}
	
	public WebElement dayTab() {
		return daydd;
	}
	
	public WebElement monthTab() {
		return monthdd;
	}
	
	public WebElement yearTab() {
		return yeardd;
	}
	
	public void femaleBtn() {
		femaleradio.click();
	}
	
	public void maleBtn() {
		maleradio.click();
	}
	
	public void customBtn() {
		customradio.click();
	}
	
	public void signupBtn() {
		signupbtn.click();
	}
	public void newAccLink() {
		newaccountlink.click();
	}
	
	public void loginBtn() {
		loginbtn.click();
	}
	
	
	
	
	
}
