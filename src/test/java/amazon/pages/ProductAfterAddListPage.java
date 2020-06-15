package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductAfterAddListPage {


	@FindBy(how = How.CSS, using = ".a-button-close:nth-child(2)")
	private WebElement closeButton;

	// Constructor
	public ProductAfterAddListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void clickOnCloseButton() {
		this.closeButton.click();
	}

}
