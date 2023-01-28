package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.CustomerInforPageUI;

public class CustomerInforPageObject extends BasePage {
	WebDriver driver;

	public CustomerInforPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isCustomerInforPageDisplayed() {
		waitForElementVisible(driver, CustomerInforPageUI.CUSTOMER_INFO_HEADER);
		return isElementEnable(driver, CustomerInforPageUI.CUSTOMER_INFO_HEADER);
	}

}
