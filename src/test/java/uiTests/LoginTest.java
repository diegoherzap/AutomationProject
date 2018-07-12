package uiTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class LoginTest extends BaseTest{
	
	@Test
	public void clickLogin() {
		HomePage hp = new HomePage(driver);
		hp.clickLogin();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}

}
