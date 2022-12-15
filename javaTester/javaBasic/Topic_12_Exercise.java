package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Exercise {
	String courseName = "Automation Testing Advanced";

	@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		for (char character : courseNameArr) {
			if (character <= 'Z' && character >= 'A') {
				count++;

			}

		}
		System.out.println(" Sum of uppercase =" + count);
	}

}
