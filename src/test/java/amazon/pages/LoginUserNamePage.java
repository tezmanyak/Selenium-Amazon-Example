package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginUserNamePage {


	@FindBy(how = How.ID, using = "ap_email")
	private WebElement userName;

	@FindBy(how = How.XPATH, using ="//input[@id='continue']")
	private WebElement continueButton;

	// Constructor
	public LoginUserNamePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	public void clickOnContinueButton() {
		this.continueButton.click();
	}
}
