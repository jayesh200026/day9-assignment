package com.JUnit;

import java.util.Scanner;

public class TempratureConversion {
	
	public static void tempConversion() {
		
		System.out.println("Select the scale\n1 for fahrenheit\n2 for Celcius");
		Scanner r =new Scanner(System.in);
		int scale=r.nextInt();
		System.out.println("Enter the temperature");
		double temp=r.nextDouble();
		if(scale==1)
		{
			printCelcius(temp);
		}
		else
		{
			printfahrenheit(temp);
		}
		
	}

	private static void printfahrenheit(double c) {
		double res=(c*9/5)+32;
		System.out.println("Temprature in degree fahrenheit is"+res);
		return;
		
	}

	private static void printCelcius(double f) {
		
		double res=(f-32)*5/9;
		System.out.println("Temprature in degree Celcius is"+res);
		return;
	}

}
