package javaBasic;

import org.testng.Assert;

public class Topic_04_Operator {
	
	public static  void main(String[] args) {
		int number = 10;
		number += 5;
		System.out.println(number);
		
		// 15/3 = 3
		System.out.println(number / 5);
		
		//15%6 2 dư 3
		System.out.println(number % 7);
		
		// In number ra trước
		System.out.println(number++);
		
		// Tăng number lên trước
		System.out.println(++number);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			
		}
		
		Assert.assertTrue(5 < 6);
		String address = "Ho Chi Minh";
		
		if (!(address == "Ha Noi")) {
			System.out.println("Address is not the same");
			
		}
		
		// Tam nguyên: = ? :
		boolean status = (address == "Ha Noi") ? true : false;
		System.out.println(status);
		

	}
}
