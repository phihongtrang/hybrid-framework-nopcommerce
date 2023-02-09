package javaOOP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Topic_05_This_Super extends BaseOOP {

	private int firstNumber;
	private int secondNumber;
	// private long longTimeout = 45;

	private WebDriver driver;

	public void setImplicitWait() {
		driver.manage().timeouts().implicitlyWait(super.longTimeout, TimeUnit.SECONDS);
	}

	public void clickToElement() {
		// Không dùng supper thì sẽ gọi hàm ở Class con
		setImplicitWait();
		super.setImplicitWait();
	}

	public Topic_05_This_Super() {
		super("Chrome");
		System.out.println("Constuctor của Class con");
	}

	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public void showNumber() {
		this.sumNumber();
	}

	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super();
	}

}