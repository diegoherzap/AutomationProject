package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage /*extends BasePage*/{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		//super(driver, wait);
	}
	
	@FindBy(id="li_myaccount")
	WebElement myAccount;
	
	@FindBy(xpath="//a[@href='https://www.phptravels.net/login']")
	WebElement login;
	
	@FindBy(how=How.CLASS_NAME, using = "select2-chosen")
	WebElement destinationSpan;
	
	@FindBy(id="s2id_autogen9")
	WebElement destinationInput;
	
	@FindBy(className="class='btn btn-lg btn-block btn-danger pfb0 loader'")
	WebElement searchButton;
	
	public void clickLogin() {
		myAccount.click();
		login.click();
	}

	public void searchDestination(String string) {
		//WebDriverWait wait = new WebDriverWait (driver, 10);
		destinationSpan.click();
		destinationInput.sendKeys(string);
		searchButton.click();
		//Something
	}

}
