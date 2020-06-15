package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WishListPage {
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[7]/div[3]/div/ul/li/span/div/div/div/div[2]/div[3]/div/div[1]/div[1]/div/div[1]/h3")
	private WebElement productName;

	@FindBy(how = How.XPATH, using = "//input[@name='submit.deleteItem']")
	private WebElement deleteButton;
	
	@FindBy(how = How.XPATH, using = "//span/div/div[2]/div/div/div")
	private WebElement deletedProduct;
	
	// Constructor
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void assertProductCheck(String name) {
		String resultCheck = this.productName.getText();
		Assert.assertEquals(name, resultCheck);
	}

	public void assertDeleteCheck() {
		String deleteCheck = deletedProduct.getText();
		Assert.assertTrue(deleteCheck.contains("Deleted"));
	}
	
	public void clickOnDeleteButton() {
		this.deleteButton.click();
	}

}
