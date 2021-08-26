package com.JUnit;

import java.util.Scanner;

public class NewtonsSqrt {
	public static void sqrt() {
		Scanner r =new Scanner(System.in);
		System.out.println("Enter the number");
		double number=r.nextDouble();
		double epslion = 1e-15;
		double sqRoot = number;

		while (Math.abs(sqRoot - number / sqRoot) > epslion * sqRoot) {
			sqRoot = (number / sqRoot + sqRoot) / 2;
		}
		System.out.println("Square root of "+number+" is "+String.format("%.3f", sqRoot ));
	}

}
