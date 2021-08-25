package com.Logical;

import java.util.Scanner;

public class Fibonacci {
	public static void fibonacci() {
		Scanner r =new Scanner(System.in);
		System.out.println("enter thenvalue of n for fibonacci series");
		int n=r.nextInt();
		int firstTerm=0,secondTerm=1,nextTerm;
		System.out.println("Fibanacci series upto"+n+"is");
		for(int i=1;i<=n;i++)
		{
			System.out.print(firstTerm+" ");
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
	}

}
