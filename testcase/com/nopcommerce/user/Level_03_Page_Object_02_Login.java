package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;
import pageObjects.RegisterPageObject;

public class Level_03_Page_Object_02_Login extends BasePage {
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");
	private String firstName, lastName, password, emailAddress;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");

		firstName = "Automation";
		lastName = "FC";
		password = "123456";
		emailAddress = "afc" + generateFakeNumber() + "@mail.vn";

		homePage = new HomePageObject(driver);
		
		
		System.out.println("Pre-Condition - Step 01: Click to Register link");
		homePage.clickToRegisterLink();

		System.out.println("Pre-Condition - Step 02: Input to required fields");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(emailAddress);
		registerPage.inputToPasswordTextbox(password);
		registerPage.inputToConfirmPasswordTextbox(password);

		System.out.println("Pre-Condition - Step 03: Click to Register button");
		registerPage.clickToRegisterButton();

		System.out.println("Pre-Condition - Step 04: Verify success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

	}

	@Test
	public void Login_01() {

		
	}
	
	@Test
	public void Login_02() {
		
		
	}
	
	@Test
	public void Login_03() {
		
		
	}
	
	@Test
	public void Login_04() {
		
		
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
