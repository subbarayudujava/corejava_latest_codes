package com.arrays;

import java.util.*;

public class DemoString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		int length = str.length();
		System.out.println("using To string");
		System.out.println(str.toString());
		System.out.println("length:" + length);
		System.out.println("using for loop method");
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			System.out.println(ch + "");
		}
		
		System.out.println("======Reverse the String=====");
		for (int i = length-1; i > 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
	}

}
