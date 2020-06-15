package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'list')]")
	private WebElement openListLink;
	
	// Constructor
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickOnListLink() {
		this.openListLink.click();
	}
}
