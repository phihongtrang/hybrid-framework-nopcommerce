package javaOOP;

public abstract class Topic_04_Non_Access_Modifier {

	// Static: Variable/ Method
	// Dùng cho tất cả các instance/object
	// Phạm vi cho toàn bộ system sử dụng nó
	// Có thể override được
	static String browserName = "Chrome";
	String serverName = "Testing";
	final String colorCar = "Red";

	final static String REGISTER_BUTTON = "Register Button";

	public static void main(String[] args) {
		System.out.println(browserName);

		browserName = "Firefox";
		System.out.println(browserName);

//		Topic_04_Non_Access_Modifier server = new Topic_04_Non_Access_Modifier();
//		System.out.println(server.serverName);
//
//		server.ClickToElement("Button");
//		sendKeyToElement("Link");
//
//		System.out.println(server.colorCar);
	}

	public void clickToElement(String elementName) {
		System.out.println(elementName);
	}

	public static void sendKeyToElement(String elementName) {
		System.out.println(elementName);
	}

	public final void setCarName() {

	}

}