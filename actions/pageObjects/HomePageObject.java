package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public void clickToRegisterLink() {
		clickToElement(driver, HomePageUI.REGISTER_LINK);

	}

}
