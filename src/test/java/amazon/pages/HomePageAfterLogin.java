package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageAfterLogin {

	@FindBy(how = How.XPATH, using = "//span[contains(.,'Hello, tezgün')]")
	private WebElement accountName;

	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Go']")
	private WebElement searchButton;
	
	// Constructor
	public HomePageAfterLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void assertLoginCheck() {
		Assert.assertTrue(accountName.isDisplayed());
	}
	
	public void setSearchText(String searchText) {
		this.searchBox.sendKeys(searchText);
	}

	public void clickOnSearchButton() {
		this.searchButton.click();
	}
}
