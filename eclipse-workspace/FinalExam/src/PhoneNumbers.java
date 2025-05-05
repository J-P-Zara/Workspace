//Jessie Zarate 05/03/2025 CSC 151 - FINAL EXAM
/*
 * A personal phone directory contains room for first names and
phone numbers for 30 people. Assign names and phone
numbers for the first 10 people. Prompt the user for a name,
and if the name is found in the list, display the corresponding
phone number. If the name is not found in the list, prompt the
user for a phone number, and add the new name and phone
number to the list. Continue to prompt the user for names until
the user enters quit. After the arrays are full (containing 30
names), do not allow the user to add new entries. Save the file
as PhoneNumbers.java. Note: Use parallel String arrays to
store the names and numbers.
 */

import java.util.Scanner;

public class PhoneNumbers {

	public static void main(String[] args) {
		String[] names = new String[30];
		String[] phoneNum = new String[30];	
		String registeredName = null;
		final String QUIT = "quit";
		Scanner input = new Scanner(System.in);
		int p=10;
		names[0]= "Elizabeth";
		names[1]= "Ethan";
		names[2]= "Liam";
		names[3]= "Maya";
		names[4]= "Zoey";
		names[5]= "Noah";
		names[6]= "Aria";
		names[7]= "Lucas";
		names[8]= "Ava";
		names[9]= "David";
		
		phoneNum[0] = "919-378-4234";
		phoneNum[1] = "202-555-0134";
		phoneNum[2] = "303-555-0198";
		phoneNum[3] = "415-555-0072";
		phoneNum[4] = "646-555-0147";
		phoneNum[5] = "512-555-0111";
		phoneNum[6] = "718-555-0176";
		phoneNum[7] = "801-555-0100";
		phoneNum[8] = "917-555-0164";
		phoneNum[9] = "213-555-0155";
		
		do {
			System.out.println("Please enter a name");
			registeredName = input.nextLine();
			if(QUIT.equalsIgnoreCase(registeredName)) {
				break;
			} 
			boolean isInRegistery = false;
			int nameSearch = 0;
			for(int i = 0; i < names.length; i++) {
					if(registeredName.equals(names[i])) {
						isInRegistery = true;
						nameSearch = i;
						break;
					}			
				}
			//System.out.println(nameSearch);
			if(isInRegistery) {
				System.out.println("The name you have entered is " + registeredName + ". Their phone number is " 
						+ phoneNum[nameSearch]);	
			} else {
				if(p>=30) {
					System.out.println("Phone Registery exiting program");
					break;
				}
				
				System.out.println("The name you have entered is a new name. "
						+ "Please input their phone number");
					names[p] = registeredName;
					phoneNum[p] = input.nextLine();
					p++;
				
			}
			
		} while(!registeredName.equals(QUIT));
		

	
	}
		

}
