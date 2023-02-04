package com.nopcommerce.user;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import commons.PageGeneratorManager;
import pageObjects.nopCommerce.user.UserAddressPageObject;
import pageObjects.nopCommerce.user.UserCustomerInforPageObject;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserMyProductReviewPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;
import pageObjects.nopCommerce.user.UserRewardPointPageObject;

public class Level_09_Dynamic_Locator extends BaseTest {

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		firstName = "Automation";
		lastName = "FC";
		password = "123456";
		email = "afc" + generateFakeNumber() + "@mail.vn";
		homePage = PageGeneratorManager.getUerHomePage(driver);

	}

	@Test
	public void User_01_Register_Login() {
		registerPage = homePage.clickToRegisterLink();

		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(email);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		registerPage.clickToRegisterButton();

		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		loginPage = homePage.clickToLoginLink();
		loginPage.inputToEmailTextbox(email);
		loginPage.inputToPasswordTextbox(password);
		homePage = loginPage.clickToLoginButton();

		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());

		customerInforPage = homePage.clickToMyAccountLink();
		Assert.assertTrue(customerInforPage.isCustomerInforPageDisplayed());
	}

	@Test
	public void User_02_Switch_Page() {
		// Customer Infor -> Address
		addressPage = customerInforPage.openAddressPage(driver);
		// Address -> My Product Review
		myProductReviewPage = addressPage.openMyProductReviewPage(driver);
		// My Product Review -> Reward point
		rewardPointPage = myProductReviewPage.openRewardPointPage(driver);
		// Reward point -> Address
		addressPage = rewardPointPage.openAddressPage(driver);
		// Address -> Reward point
		rewardPointPage = addressPage.openRewardPointPage(driver);
		// Reward point -> My Product Review
		myProductReviewPage = rewardPointPage.openMyProductReviewPage(driver);

	}

	@Test
	public void User_03_Dynamic_Page_01() {
		// My Product Review -> Reward point
		rewardPointPage = (UserRewardPointPageObject) myProductReviewPage.openPagesAtMyAccountPageByName(driver,
				"Reward points");
		// Reward point -> Address
		addressPage = (UserAddressPageObject) rewardPointPage.openPagesAtMyAccountPageByName(driver, "Address");
		// Address -> Reward point
		rewardPointPage = (UserRewardPointPageObject) addressPage.openPagesAtMyAccountPageByName(driver,
				"Reward points");
		// Reward point -> My Product Review
		myProductReviewPage = (UserMyProductReviewPageObject) rewardPointPage.openPagesAtMyAccountPageByName(driver,
				"My Product Review");
		// My Product Review -> Customer Infor
		customerInforPage = (UserCustomerInforPageObject) customerInforPage.openPagesAtMyAccountPageByName(driver,
				"Customer Infor");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private UserCustomerInforPageObject customerInforPage;
	private UserAddressPageObject addressPage;
	private UserMyProductReviewPageObject myProductReviewPage;
	private UserRewardPointPageObject rewardPointPage;
	private WebDriver driver;
	private String firstName, lastName, password, email;

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
