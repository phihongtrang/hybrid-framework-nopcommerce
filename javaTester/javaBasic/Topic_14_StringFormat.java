package javaBasic;

public class Topic_14_StringFormat {
	// 14 pages = 14 locator
	public static final String CUSTOMER_INFO_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Customer info']";
	public static final String ADDRESS_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Addresses']";
	public static final String MY_PRODUCT_REVIEW_LINK = "//div[contains(@class,'account-navigation')]//a[text()='My product reviews']";
	public static final String REWARD_POINT_LINK = "//div[contains(@class,'account-navigation')]//a[text()='Reward points']";

	// 1 biến cho 14 page hoặc n page (format giống nhau)
	public static String DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME = "//div[contains(@class,'account-navigation')]//a[text()='%s']";

	public static String DYNAMIC_LINK_BY_PAGE_NAME = "//div[contains(@class,'%s')]//a[text()='%s']";

	public static void main(String[] args) {
		// clickToLink(CUSTOMER_INFO_LINK);
		// clickToLink(ADDRESS_LINK);
		// clickToLink(MY_PRODUCT_REVIEW_LINK);
		// clickToLink(REWARD_POINT_LINK);

		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Customer info");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Addresses");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "My product reviews");
		clickToLink(DYNAMIC_SIDEBAR_LINK_BY_PAGE_NAME, "Reward points");

		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "account-navigation", "Addresses");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "footer-upper", "Search");
		clickToLink(DYNAMIC_LINK_BY_PAGE_NAME, "header-upper", "My Account");
	}

	// public static void clickToLink(String locator) {
	// System.out.println("Click to: " + locator);
	// }
	//
	// public static void clickToLink(String dynamicLocator, String pageName) {
	// String locator = String.format(dynamicLocator, pageName);
	// System.out.println("Click to: " + locator);
	// }
	//
	// public static void clickToLink(String dynamicLocator, String areaName, String
	// pageName) {
	// String locator = String.format(dynamicLocator, areaName, pageName);
	// System.out.println("Click to: " + locator);
	// }

	// 1-n tham số động
	public static void clickToLink(String dynamicLocator, String... params) {
		String locator = String.format(dynamicLocator, (Object[]) params);
		System.out.println("Click to: " + locator);
	}
}
