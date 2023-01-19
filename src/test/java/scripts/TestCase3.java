package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pomPage.CreateNewAccount;

public class TestCase3 extends StepGroup {

	@Test
	public void testCase3() throws IOException, InterruptedException {
		
		CreateNewAccount cna = new CreateNewAccount(driver);
		cna.accountEmailId(pf.getProperty("email"));
		Thread.sleep(2000);
		cna.accountPassword(pf.getProperty("password"));
		Thread.sleep(2000);
		cna.loginBtn();
		Thread.sleep(6000);
		
	}
}
