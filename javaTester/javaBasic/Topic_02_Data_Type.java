package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
// Primitive type/ value type: Nguyên thủy
	byte bNumber;
	
	short sNumber;
	
	long lNumber;
	
	float fNumber;
	
	double dNumber;
	
	char cChar;
	
	boolean bStatus = false;
	
	// Reference type: Tham chiếu
	
	// String
	String address = "Hồ Chí Minh";
	
	// Array
	String[] studentAddress = { address, "Hà Nội", "Đà Nẵng" };
	Integer[] studentNumber = { 15, 20, 50 };
	
	// Class
	Topic_02_Data_Type topic;
	
	// Interface
	WebDriver driver;
	
	//Object
	Object aObject;
	
	// Collection
	// List/ Set/ Queue/ Map
	List<WebElement> homePageLink = driver.findElements(By.tagName("a"));
	Set<String> allWindows = driver.getWindowHandles();
	List<String> productName = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		
	}

}
