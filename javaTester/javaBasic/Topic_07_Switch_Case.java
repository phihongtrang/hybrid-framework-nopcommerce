package javaBasic;



import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	
	@Test
	public void TC_01() {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Nhập A");
		int firstNumber = Scanner.nextInt();
		System.out.println("Nhập toán tử");
		String operator = Scanner.next();
		System.out.println("Nhập B");
		int secondNumber = Scanner.nextInt();
	
		
		switch (operator) {
		case "+": System.out.println("A + B = " + (firstNumber + secondNumber));
			
			break;
		case "-": System.out.println("A - B = " + (firstNumber - secondNumber));
		
		break;
		case "x": System.out.println("A x B = " + (firstNumber * secondNumber));
		
		
		break;
		case ":": System.out.println("A : B = " + (firstNumber / secondNumber));
		
		break;

		
		}
		
	}
	

}
