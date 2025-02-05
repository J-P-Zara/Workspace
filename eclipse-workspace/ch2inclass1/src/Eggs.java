//Jessie Zarate 1/29/2025 CSC 151 ch 2 assignment 1


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
		double dozenPrice = dozen * PRICE_FOR_DOZEN;
		double sum = dozenPrice + singlePrice;
		
		System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen "
		+ "at $3.25 per dozen and " + remainder + " loose eggs at 45 cents each for a total "
		+ "of $" + sum);
		
		
	}

}
