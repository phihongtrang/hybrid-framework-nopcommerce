package javaOOP;

public class Topic_02_Variable_Property {
	// Access Modifier
	// Data type
	// Variable name
	// Variable value

	private String studentName = "Automation FC"; // Biến toàn cục - Global variable

	// static variable: dùng và gán lại được
	public static String studentAddress = "Ho Chi Minh";

	// Dùng trong phạm vi class (cho tất cả các instance/ object dùng
	private static String studentPhone = "0987654321";

	// final variable: không cho phép gán lại / override lại
	// cố định dữ liệu k cho phép thay đổi trong quá trình chạy
	protected final String country = "Vietnam";

	// static final variable: hằng số (constant)
	// không được ghi đè
	// có thể truy cập rộng rãi cho tất cả instace/ thread
	static final float PI_NUMBER = 3.13235f;

	// Access modifier: default
	int studentID = 1501;

	// Hàm (method) - Static
	public static void main(String[] args) {
		// Biến cục bộ - local variable: hàm
		String studentName = "Automation FC";
		if (studentName.startsWith("Automation")) {
			// Biến cục bộ - local variable: block code
			int number = 100;
		}

		studentAddress = "Da Nang";
		studentPhone = "9876543211";
	}

	// Constructor
	public Topic_02_Variable_Property() {
		// Biến cục bộ - local variable: constructor
		String studentName = "Automation FC";
	}

	// Hàm (method) - non-static
	public void display() {
		// Biến cục bộ - local variable: hàm
		String studentName = "Automation FC";
	}
}