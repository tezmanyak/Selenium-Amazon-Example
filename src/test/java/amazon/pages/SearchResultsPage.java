package amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResultsPage {
	
	private WebDriver driver;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/span/div/span/h1/div/div[1]/div/div/span[1]")
	private WebElement resultBox;
	
	@FindBy(how = How.XPATH, using = "//div[@id='search']/div/div[2]/div/span[8]/div/div/span/div/div/ul/li[3]/a")
	private WebElement secondButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div[1]/div[2]/div/span[4]/div[1]/div[3]/div/span/div/div/div[2]/div[1]/div/div/span/a/div")
	private WebElement testObject;
	
	// Constructor
		public SearchResultsPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
		public void assertResultCheck() {
			String resultCheck = this.resultBox.getText();
			Assert.assertTrue(resultCheck.contains("results"));
		}
		
		public void assertSecondPageCheck() {
			String actualUrl = this.driver.getCurrentUrl();
			Assert.assertTrue(actualUrl.contains("page=2"));
		}
		
		
		public void clickOnSecondButton() {
			this.secondButton.click();
			}
		public void clickOnObjectButton() {
			this.testObject.click();
			}
}
