package javaException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class HandleException {
	private WebDriver driver;
	private String projectPath = System.getProperty("user.dir");

	@Test
	public void TC_01() throws IOException {
		// String projectPath = System.getProperty("user.dir");
		// System.setProperty("webdriver.gecko.driver", projectPath +
		// "\\browserDrivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://live.techpanda.org/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='automation']")).click();

	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}