package com.Logical;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void perfectNumber() {
		
		Scanner r=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter the value of n");
		n=r.nextInt();
		for(int i=1;i<=n/2;i++)
		{
			if(n % i ==0) {
				sum+=i;
			}
		}
		if(sum==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
		
	}

}
