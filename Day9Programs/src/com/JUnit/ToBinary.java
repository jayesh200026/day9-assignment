package com.JUnit;

import java.util.Scanner;

public class ToBinary {
	public static void toBinary() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=r.nextInt();
		int q=num;
		String rem;
		String bits="";
		while(q!=0) {
			rem=Integer.toString(q%2);
			bits=rem+bits;
			q=q/2;
		}
		System.out.println(bits);
		
	}

}
