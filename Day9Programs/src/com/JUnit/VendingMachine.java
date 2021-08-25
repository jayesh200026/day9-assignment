package com.JUnit;

import java.util.Scanner;

public class VendingMachine {
	
	public static void vendingMachine() {
		int[] cash= {1000,500,100,50,10,5,2,1};
		int[] count= {0,0,0,0,0,0,0,0,0};
		
		Scanner r =new Scanner(System.in);
		System.out.println("enter the amount");
		int amount=r.nextInt();
		int change=amount;
		//while(change!=0)
		//{
			for(int i=0;i<cash.length;i++)
			{
				int q=change/cash[i];
				count[i]+=q;
				change=change % cash[i];
				
				
			}
		//}
			
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0) {
			System.out.println(count[i]+" "+cash[i]);
			}
		}
		
	}

}
