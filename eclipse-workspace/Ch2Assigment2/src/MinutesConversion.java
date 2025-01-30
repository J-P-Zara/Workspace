//Jessie Zarate 1/29/2025 CSC 151 ch2 Assignment 2
/*
 * Write a program that accepts a number of minutes and converts it both to hours and days. 
 * For example, 6,000 minutes equals 100 hours and equals 4.167 days. 
 * Save the program as MinutesConversion.java.
 */

import java.util.Scanner;

public class MinutesConversion {

	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		int minutes=20;
		final double MINUTES_IN_HOUR=60;
		final int HOURS_IN_DAY=24;
		
		System.out.print("Please enter number of minutes");
		minutes = inputDevice.nextInt();
		
		double minutesToHours = minutes / MINUTES_IN_HOUR;
		double hoursToDays = minutesToHours / HOURS_IN_DAY;
		
		System.out.println(minutes + " equals " + minutesToHours + " hours and equals " 
				+ hoursToDays + " days");
		
	}

}
