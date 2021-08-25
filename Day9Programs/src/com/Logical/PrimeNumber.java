package com.Logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void primeNumber() {
		Scanner r=new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n");
		n=r.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0) {
				System.out.println(n+" is not a prime number");
				System.exit(0);
			}
		}
		System.out.println(n+" is a prime number");
	}

}
