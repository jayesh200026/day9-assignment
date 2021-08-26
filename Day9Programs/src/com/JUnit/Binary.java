package com.JUnit;

import java.util.Scanner;

public class Binary {
	public static void nibble() {
		Scanner r = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=r.nextInt();
		String bits=toBinary(num);
		if(bits.length()!=8)
		{
			int len=bits.length();
			for(int i=0;i<8-len;i++)
			{
				bits="0"+bits;
			}
			
			System.out.println("after padding "+bits);
		}
		String nibble1=bits.substring(0, 4);
		String nibble2=bits.substring(4, 8);
		String reversebits=nibble2+nibble1;
		
		System.out.println("nibble1 "+nibble1);
		System.out.println("nibble2 "+nibble2);
		
		System.out.println("reversed bits are "+reversebits);
		int number=0;
		double product;
		
		for(int i=bits.length()-1;i>=0;i--)
		{
			int bit=Character.getNumericValue(reversebits.charAt(i));
			//System.out.println(bit);
			//product= (bit*Math.pow(2, 7-i));
			//System.out.println(product);
			//number=number+product;
			number=(int) (number+(bit*Math.pow(2, 7-i)));
			
		}
		System.out.println("New number after swapping nibbles is "+number);
	}

	private static String toBinary(int num) {
		int q=num;
		String rem;
		String bits="";
		while(q!=0) {
			rem=Integer.toString(q%2);
			bits=rem+bits;
			q=q/2;
		}
		System.out.println("Converted binary value "+bits);
		// TODO Auto-generated method stub
		return bits;
	}

}
