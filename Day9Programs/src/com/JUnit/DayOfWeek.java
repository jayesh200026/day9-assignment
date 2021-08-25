package com.JUnit;

public class DayOfWeek {
	public static void dayOfWeek(String args[])
	{
		int m=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int y=Integer.parseInt(args[2]);
		
		double y0= y-(14-m)/12;
		double x=y0+(y0/4)-(y0/100)+(y0/400);
		double m0=m+12*((14-m)/12)-2;
		int d0=(int)(d+x+31*m0/12) % 7;
		switch(d0)
		{
		case 0:System.out.println("Sunday");
				break;
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednsday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		
		case 6:System.out.println("Saturday");
		break;
		
		
		}
		
	}

}
