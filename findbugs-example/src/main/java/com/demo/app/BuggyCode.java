package com.demo.app;

public class BuggyCode {

	public void bugs() {
		String name = null;
		System.out.println("Name Length : " + name.length());

		int[] nums = { 1, 2, 3, 4, 5, 6 };
		System.out.println(nums[6]);
	}
}
