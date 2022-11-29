package javaBasic;

import org.openqa.selenium.WebDriver;

public class Topic_06_Condition_Statement {
	WebDriver driver;

	public void TC_01_If() {
		boolean status = 5 > 3;

		System.out.println(status);

		// Hàm if nhận 1 điều kiện đúng
		// Kiểm tra duy nhất 1 đk
		// Nếu điều kiện đúng thì sẽ action trong phần thân
		if (status) {
			// Đúng thì vào phần thân của if
			// Sai thì bỏ qua
			System.out.println("Go to if");

		}

	}
	
	public void TC_02_If_Else() {
		// Có tới 2 điều kiện: nếu như đúng thì vào if - sai thì vào else
		// Nếu driver start với browser như Chorme/ Firefox/ Edge/ Safari thì dùng hàm click
		// Thông thường ( built in) của Selenium WebElement
		// Nếu driver là IE thì dùng hàm click của JavascriptExecutor
		
		
	}
}
