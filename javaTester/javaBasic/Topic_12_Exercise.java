package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Exercise {
	String courseName = "AuTomation TesTing AdVanced 2022";

	@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLowser = 0;
		int countNumber = 0;
		for (char character : courseNameArr) {
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}
			if (character <= 'z' && character >= 'a') {
				countLowser++;

			}

			if (character <= '9' && character >= '0') {
				countNumber++;

			}

		}
		System.out.println(" Sum of uppercase =" + countUpper);
		System.out.println(" Sum of uppercase =" + countLowser);
		System.out.println(" Sum of uppercase =" + countNumber);
	}

	@Test
	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		for (char c : courseNameArr) {
			if (c == 'a') {
				count++;

			}
			System.out.println(count);
		}
	}

}
