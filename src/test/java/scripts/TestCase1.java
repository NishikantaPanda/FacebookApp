package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pomPage.CreateNewAccount;

public class TestCase1 extends StepGroup {

	@Test
	public void testCase1() throws IOException, InterruptedException {
		
		CreateNewAccount cna = new CreateNewAccount(driver);
		cna.newAccLink();
		Thread.sleep(2000);
		cna.firstName(pf.getProperty("firstname"));
		Thread.sleep(2000);
		cna.lastName(pf.getProperty("lastname"));
		Thread.sleep(2000);
		cna.emailId(pf.getProperty("email"));
		Thread.sleep(2000);
		cna.confirmEmailId(pf.getProperty("cemail"));
		Thread.sleep(2000);
		cna.password(pf.getProperty("password"));
		Thread.sleep(2000);
		du.dropDown(cna.dayTab(), pf.getProperty("text1"));
		Thread.sleep(2000);
		du.dropDown(cna.monthTab(), pf.getProperty("text2"));
		Thread.sleep(2000);
		du.dropDown(cna.yearTab(), pf.getProperty("text3"));
		Thread.sleep(2000);
		cna.maleBtn();
		Thread.sleep(2000);
		cna.signupBtn();
		Thread.sleep(4000);
		
		
		
	}
	
}
