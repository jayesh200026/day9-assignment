package com.Logical;

import java.util.Scanner;

public class ReverseNumber {
	public static void reverseNumber() {
		Scanner r=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=r.nextInt();
		int reverse=0;
		int number=n;
		while(number!=0) {
			int rem=number % 10;
			reverse=reverse * 10 + rem;
			number=number/10;
		}
		System.out.println("Reverse of "+n+" is "+reverse);
		
	}

}
