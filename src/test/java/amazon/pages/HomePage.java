package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	private WebDriver driver;

	private static String PAGE_URL = "https://www.amazon.com";

	@FindBy(how = How.XPATH, using = "//div[@id='nav-logo']/a/span")
	private WebElement amazonLogo;

	@FindBy(how = How.XPATH, using = "//a[@id='nav-link-accountList']/span")
	private WebElement loginButton;

	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.driver.get(PAGE_URL);
		PageFactory.initElements(driver, this);
	}

	public void assertAmazonLogo() {
		Assert.assertTrue(amazonLogo.isDisplayed());
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
