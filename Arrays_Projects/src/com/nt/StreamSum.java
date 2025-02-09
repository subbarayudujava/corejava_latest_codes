package com.nt;
import java.util.*;
/*
 * public class EvenNumbers {
 * 
 * public static void main(String[] args) {
 * 
 * int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; int sum = 0;
 * System.out.println("Even numbers from 1 to 10");
 * 
 * 
 * for(int i=0;i<numbers.length;i++) {
 * 
 * // if(numbers[i]%2==1) {//odd numbers
 * 
 * if(numbers[i]%2==1) {//even numbers sum=sum+numbers[i]; } }
 * System.out.println(sum);
 * 
 * 
 * }// mai
 * 
 * }// class
 */
import java.util.Arrays;
import java.util.List;

public class StreamSum {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = number.stream().filter(k -> k % 2 == 0) // Filter even numbers
				.reduce(0, (a, b) -> a + b); // Sum the even numbers
		System.out.println("Sum of even numbers: " + sum);
	}
}
