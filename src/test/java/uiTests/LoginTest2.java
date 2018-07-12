package uiTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BrowserFactory;
import pages.HomePage;

public class LoginTest2 {

	@Test(priority=0)
	public void verifyLoginButtonWorks() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.phptravels.net");
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.clickLogin();
		Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
	}
	
	@Test(priority=1)
	public void verifyDestinationSearchWorks() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.phptravels.net");
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.searchDestination("Dubai");
		Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
	}

}
