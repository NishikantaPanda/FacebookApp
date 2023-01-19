package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pomPage.CreateNewAccount;
import pomPage.ForgotAccount;

public class TestCase2 extends StepGroup {

	@Test
	public void testCase2() throws IOException, InterruptedException {
		CreateNewAccount cna = new CreateNewAccount(driver);
		cna.forgotPassowrdLink();
		Thread.sleep(2000);
		ForgotAccount fa = new ForgotAccount(driver);
		fa.searchAccount(pf.getProperty("AccountName"));
		Thread.sleep(2000);
		fa.searchBtn();
		
		Point place = fa.privacyPolicyAddress().getLocation();
		int x = place.getX();
		int y = place.getY();
		Thread.sleep(2000);
		du.scrollBar(driver, x, y);
		
		fa.privacyPolicy();
		Thread.sleep(2000);
		
		
	
		
		
		
	}
}
