//Jessie Zarate CSC 151 - Chapter 8 Assignment 1
/*
 * Write an application that allows a user to enter the names and 
 * birthdates of up to 10 friends. Continue to prompt the user for names and birthdates 
 * until the user enters the sentinel value ZZZ for a name or has entered 10 names, whichever 
 * comes first. When the user is finished entering names, produce a count of how many names were 
 * entered, and then display the names. In a loop, continuously ask the user to type one of the names and 
 * display the corresponding birthdate or an error message if the name has not been previously entered. 
 * The loop continues until the user enters ZZZ for a name. Save the application as BirthdayReminder.java.
 */

import java.util.Scanner;

public class BirthdayReminder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] name = new String[10];
		String[] birthday = new String[10];
		String registeredName;
		int i = 0;
		final String QUIT = "ZZZ";
		int count = 0;
		int nameSearch = 0;
		boolean isInRegistery = false;
		
		for(i = 0; i < name.length; i++) {
			System.out.println("Please input name and birthday or Enter \"ZZZ\" to quit");
			String currentName = input.nextLine();
			name[i] = currentName;
			if(QUIT.equals(currentName)) {
				break;
			} 
				birthday[i] = input.nextLine();	
				++count;
		} 
		
		System.out.println("you have entered " + count + " names");
		System.out.println("please input a name to find their birthday");
		
		
		
		for(i = 0; i < name.length; i++) {
			if(registeredName.equals(name[i])) {
				isInRegistery = true
			}
		}
		
		
		
		
		
		
		for(i = 0; i < name.length; i++) {
			registeredName = input.nextLine();
			if(!registeredName.equalsIgnoreCase(name[nameSearch])) {
				++nameSearch;
			} 
			if(registeredName.equalsIgnoreCase(name[nameSearch])) {
				System.out.println("you have entered " + registeredName + " their birthday is " + birthday[nameSearch]);
				nameSearch=0;
			}
		
		}
		
	}

}
