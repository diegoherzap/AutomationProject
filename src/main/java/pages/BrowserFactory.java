package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;

	public static WebDriver startBrowser(String browserName, String baseUrl) {
		
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\dev\\webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\dev\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
			driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		return driver;
	}
}
