package com.nt.subbu;

import java.util.Scanner;

public class SumValue {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the Interger");
     int number=s.nextInt();
     int sum=0;
     while(number!=0) {
    	 int digit=number%10;
    	 sum=sum+digit;
    	 number=number/10;
     }
     System.out.println("sum values:"+sum);
	}//main

}//class
