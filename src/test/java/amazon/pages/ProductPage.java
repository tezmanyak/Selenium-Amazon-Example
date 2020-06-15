package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private String productCheck;

	@FindBy(how = How.ID, using = "productTitle")
	private WebElement productName;

	@FindBy(how = How.ID, using = "add-to-wishlist-button-submit")
	private WebElement addListButton;

	@FindBy(how = How.ID, using = "nav-link-accountList")
	private WebElement profilePageButton;
	
	// Constructor
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.productCheck = this.productName.getText();
	}

	public String getProductName() {
		return this.productCheck;
	}

	public void clickOnAddListButton() {
		this.addListButton.click();
	}

	public void clickOnProfileButton() {
		this.profilePageButton.click();
	}
}
