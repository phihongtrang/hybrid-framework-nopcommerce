package javaOOP;

public class Topic_03_Method {

	private void showCarName() {
		System.out.println("Huyndai Tucson");
	}

	private static void showCarColor() {
		System.out.println("White");
	}

	public static void main(String[] args) {
		// Gọi vào trong hàm static được
		showCarColor();

		// Gọi qua instance / object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName();

	}

}