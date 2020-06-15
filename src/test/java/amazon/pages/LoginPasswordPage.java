package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPasswordPage {


	@FindBy(how = How.ID, using = "ap_password")
	private WebElement password;

	@FindBy(how = How.XPATH, using ="//span[@id='auth-signin-button']/span/input")
	private WebElement signInButton;

	// Constructor
	public LoginPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		this.signInButton.click();
	}
}
