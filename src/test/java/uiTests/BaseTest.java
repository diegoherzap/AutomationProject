package uiTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	WebDriver driver;
	WebDriverWait wait;
	public String baseUrl = "https://www.phptravels.net";
	
	@BeforeClass
	public void initialize() {
		System.setProperty("webdriver.gecko.driver", "C:\\dev\\webdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void terminate() {
		driver.close();
	}

}
