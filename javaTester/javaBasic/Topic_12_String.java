package javaBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_12_String {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String schoolName = "Automation Testing";
		String schoolAddress = "Automation Testing";
		String courseAddress = "Ho Chi Minh City";

		System.out.println("Độ dài = " + schoolName.length());
		System.out.println("Lấy ra 1 kí tự = " + schoolName.charAt(0));
		System.out.println("Nối chuỗi = " + schoolName.concat(schoolAddress));

		System.out.println("Kiểm tra 2 chuỗi bằng nhau tuyệt đối = " + schoolName.equals("Automation Testing"));
		System.out.println("Kiểm tra 2 chuỗi bằng nhau tương đối = " + schoolName.equalsIgnoreCase(courseAddress));

		System.out.println("Có bắt đầu bằng 1 kí tự/ chuỗi kí tự = " + schoolName.startsWith("A"));
		System.out.println("Có bắt đầu bằng 1 kí tự/ chuỗi kí tự = " + schoolName.startsWith("Automation"));

		System.out.println("Có chứa 1 kí tự/ chuỗi kí tự = " + schoolName.contains("Automation"));
		System.out.println("Có chứa 1 kí tự/ chuỗi kí tự = " + schoolName.contains("T"));
		System.out.println("Có chứa 1 kí tự/ chuỗi kí tự = " + schoolName.contains("Testing"));

		System.out.println("Có kết thúc bằng 1 kí tự/ chuỗi kí tự = " + schoolName.endsWith("g"));
		System.out.println("Có kết thúc bằng 1 kí tự/ chuỗi kí tự = " + schoolName.endsWith("Testing"));
		System.out.println("Có kết thúc bằng 1 kí tự/ chuỗi kí tự = " + schoolName.endsWith("Automation"));

		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự = " + schoolName.indexOf("A"));
		System.out.println("Vị trí của 1 kí tự/ chuỗi kí tự = " + schoolName.indexOf("Testing"));

	}

}
