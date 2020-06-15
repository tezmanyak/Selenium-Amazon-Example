package amazon;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazon.pages.HomePage;
import amazon.pages.HomePageAfterLogin;
import amazon.pages.LoginPasswordPage;
import amazon.pages.LoginUserNamePage;
import amazon.pages.ProductAfterAddListPage;
import amazon.pages.ProductPage;
import amazon.pages.ProfilePage;
import amazon.pages.SearchResultsPage;
import amazon.pages.WishListPage;
import amazon.utils.Utils;

public class Main {

	@Test
	public void amazonTest() {
		String resourceName = "chromedriver.exe";
		 
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(resourceName).getFile());
		String absolutePath = file.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", absolutePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		HomePage homePage = new HomePage(driver);
		
		homePage.assertAmazonLogo();
		
		homePage.clickOnLoginButton();
		LoginUserNamePage loginUserNamePage = new LoginUserNamePage(driver);
		loginUserNamePage.setUserName("tezgunb@gmail.com");
		loginUserNamePage.clickOnContinueButton();
		LoginPasswordPage loginPasswordPage = new LoginPasswordPage(driver);
		loginPasswordPage.setPassword("100889");
		loginPasswordPage.clickOnSignInButton();
		HomePageAfterLogin homePageAfterLogin = new HomePageAfterLogin(driver);
		
		homePageAfterLogin.assertLoginCheck();
		
		homePageAfterLogin.setSearchText("samsung");
		homePageAfterLogin.clickOnSearchButton();
		SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
		
		searchResultsPage.assertResultCheck();
		
		searchResultsPage.clickOnSecondButton();
		
		searchResultsPage.assertSecondPageCheck();
		Utils.sleepSecond(5);
		searchResultsPage.clickOnObjectButton();
		Utils.sleepSecond(2);
		ProductPage productPage = new ProductPage(driver);
		String product = productPage.getProductName();
		productPage.clickOnAddListButton();
		Utils.sleepSecond(3);
		ProductAfterAddListPage productAfterAddListPage = new ProductAfterAddListPage(driver);
		productAfterAddListPage.clickOnCloseButton();
		Utils.sleepSecond(3);
		productPage.clickOnProfileButton();
		Utils.sleepSecond(3);
		ProfilePage profilePage = new ProfilePage(driver);
		profilePage.clickOnListLink();
		WishListPage wishListPage = new WishListPage(driver);
		
		wishListPage.assertProductCheck(product);
		
		Utils.sleepSecond(1);
		wishListPage.clickOnDeleteButton();
		Utils.sleepSecond(2);
		
		wishListPage.assertDeleteCheck();
	}
}
