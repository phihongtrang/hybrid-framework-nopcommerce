package com.nopcommerce.user;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObjects.nopCommerce.user.UserHomePageObject;
import pageObjects.nopCommerce.user.UserLoginPageObject;
import pageObjects.nopCommerce.user.UserRegisterPageObject;

public class Level_06_Page_Generator_Manager_PI extends BaseTest {
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLoginPageObject loginPage;
	private WebDriver driver;
	private String firstName, lastName, password, existingEmail, invalidEmail, notFoundEmail;

	@Parameters("browser")
	@BeforeClass
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);

		firstName = "Automation";
		lastName = "FC";
		password = "123456";
		invalidEmail = "afc@afc.com";
		existingEmail = "afc" + generateFakeNumber() + "@mail.vn";
		notFoundEmail = "afc" + generateFakeNumber() + "@mail.com";

		homePage = new UserHomePageObject(driver);

		System.out.println("Pre-Condition - Step 01: Click to Register link");
		homePage.clickToRegisterLink();
		registerPage = new UserRegisterPageObject(driver);

		System.out.println("Pre-Condition - Step 02: Input to required fields");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(existingEmail);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Pre-Condition - Step 03: Click to Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Pre-Condition - Step 04: Verify success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

		System.out.println("Pre-Condition - Step 05: Logout");

	}

	@Test
	public void Login_01_Empty_Data() {
		homePage.clickToLoginLink();

		loginPage = new UserLoginPageObject(driver);

		loginPage.clickToLoginButton();

		assertEquals(loginPage.getErrorMessageAtEmailTextbox(), "Please enter your email");

	}

	@Test
	public void Login_02_Invalid_Email() {
		homePage.clickToLoginLink();

		loginPage = new UserLoginPageObject(driver);
		loginPage.inputToEmailTextbox(invalidEmail);
		loginPage.clickToLoginButton();

		assertEquals(loginPage.getErrorMessageUnsuccessfull(),
				"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_03_Email_Not_Found() {
		homePage.clickToLoginLink();

		loginPage = new UserLoginPageObject(driver);
		loginPage.inputToEmailTextbox(notFoundEmail);
		loginPage.clickToLoginButton();

		assertEquals(loginPage.getErrorMessageUnsuccessfull(),
				"Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}

	@Test
	public void Login_04_Existing_Email_Empty_Password() {
		homePage.clickToLoginLink();

		loginPage = new UserLoginPageObject(driver);
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox("");
		loginPage.clickToLoginButton();

		assertEquals(loginPage.getErrorMessageUnsuccessfull(),
				"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_05_Existing_Email_Incorrect_Password() {
		homePage.clickToLoginLink();

		loginPage = new UserLoginPageObject(driver);
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox("654321");
		loginPage.clickToLoginButton();

		assertEquals(loginPage.getErrorMessageUnsuccessfull(),
				"Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}

	@Test
	public void Login_06_Valid_Email_Password() {
		homePage.clickToLoginLink();

		loginPage = new UserLoginPageObject(driver);
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox(password);
		loginPage.clickToLoginButton();

		// Login thành công -> Homepage
		homePage = new UserHomePageObject(driver);
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();

	}

	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
