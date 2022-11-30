package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Topic_08_Foreach {
//
//	@Test
//	public void TC_01_For() {
//
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//
//		}
//
//		// Array
//		String[] cityName = { "HN", "HCM", "ĐN", "CT" };
//		// 4
//
//		// Array/ List/ Set/ Queue (index)
//
//		// For kết hợp if: Thỏa mãn điều kiện mới action
//		// Biến đếm - dùng để điều kiện để filter
//
//		for (int i = 0; i < cityName.length; i++) {
//			if (cityName[i].equals("ĐN")) {
//				// Action
//				System.out.println("Do action");
//			}
//
//		}
//
//	}

	@Test
	public void TC_02_For_each() {
		String[] cityName = { "HN", "HCM", "ĐN", "CT", "HP", "KH" };
		// Dùng để chạy qua tất cả các giá trị
		for (String city : cityName) {
			System.out.println(city);

		}
		
		// Java Collection
		// Class: ArrayList/ LinkedList/ Vector/...
		// Interface: List/ Set/ Queue
		List<String> cityAddress = new ArrayList<String>();
		System.out.println(cityAddress.size());
		

		// Compile (Coding)
		cityAddress.add("BG");
		cityAddress.add("HG");
		cityAddress.add("SP");
		System.out.println(cityAddress.size());
		
		// Runtime (running)
		for (String city : cityName) {
			cityAddress.add(city);	
		}
		System.out.println(cityAddress.size());
		
		for (String cityAdd : cityAddress) {
			System.out.println(cityAdd);
		
		}
		
		
		
	}
}
