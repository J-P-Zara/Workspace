//Jessie Zarate 02/04/2025 chapter 3 assignment 1
/*
 * Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on 
 * the job, plus $12 per hour for travel time to the job site.
 * The main() method prompts the user for the name of a job (for example, Smith bathroom remodel), 
 * the cost of materials, the number of hours of work required, and the number of hours travel time.
 * Pass the numeric data to a method that computes an estimate for the job and returns the computed 
 * value to the main() method which displays the job name and estimated price.
 */

import java.util.Scanner;

public class HomeRepair {

	public static void main(String[] args) {
		String jobName;
		double costOfMaterials, hoursWorked, travelTime;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("Please enter name of job >>");
		jobName = inputDevice.nextLine();
		
		System.out.print("Please enter the cost of materials, number of hours of work required,"
				+ " and the number of hours travel time seperated by spaces >>");
		costOfMaterials = inputDevice.nextDouble();
		hoursWorked = inputDevice.nextDouble();
		travelTime = inputDevice.nextDouble();
		
		double jobEstimate = calculatePrice(costOfMaterials, hoursWorked, travelTime);
		System.out.println("The estimated cost of" + jobName + " is $" + jobEstimate);
				
	}
	public static double calculatePrice(double costOfMaterials, double hoursWorked, double travelTime) {
		final double STD_RATE = 35;
		final double TRAVEL_COST = 12;
		double jobEstimate = costOfMaterials + (hoursWorked*STD_RATE) + (travelTime*TRAVEL_COST);
		
		return jobEstimate;

	
	
	}
	
	

}
