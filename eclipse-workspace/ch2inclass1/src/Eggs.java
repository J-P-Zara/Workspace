//Jessie Zarate 1/29/2025 CSC 151 ch 2 assignment 1
/*
 * Meadowdale Dairy Farm sells organic brown eggs to local customers. 
 * It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. 
 * Write a program that prompts a user for the number of eggs in the order and then display the amount
 * owed with a full explanation using the following wording: You ordered 27 eggs. 
 * That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.  
 * You can name the class Eggs.java
 */

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		
		Scanner inputDevice = new Scanner(System.in);
		int eggs=27;
		final int EGGS_IN_DOZEN=12;
		
		System.out.print("Enter order of eggs");
		eggs = inputDevice.nextInt();
		
		int dozen = eggs / EGGS_IN_DOZEN;
		int remainder = eggs % EGGS_IN_DOZEN;
		final double PRICE_OF_INDIVIDUAL_EGG=0.45;
		final double PRICE_FOR_DOZEN=3.25;
		
		double singlePrice = remainder * PRICE_OF_INDIVIDUAL_EGG;
		double DozenPrice = dozen * PRICE_FOR_DOZEN;
		double sum = DozenPrice + singlePrice;
		
		System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen "
		+ "at $3.25 per dozen and " + remainder + " loose eggs at 45 cents each for a total "
		+ "of $" + sum);
		
		
	}

}
