//Jessie Zarate 02/18/2025 Chapter 5 Assignment 2
/*
 * Create an Automobile class for a dealership. Include fields for an ID number, 
 * make, model, color, year, and miles per gallon. Include get and set methods 
 * for each field. Do not allow the ID to be negative or more than 9999; 
 * if it is, set the ID to 0. Do not allow the year to be earlier than 2005 
 * or later than 2019; if it is, set the year to 0. Do not allow the miles per 
 * gallon to be less than 10 or more than 60; if it is, set the miles per gallon 
 * to 0. Include a constructor that accepts arguments for each field value and 
 * uses the set methods to assign the values. Write an application that declares 
 * several Automobile objects and demonstrates that all the methods work correctly. 
 * Save the files as Automobile.java and TestAutomobiles.java.
 */
public class TestAutomobiles {

	public static void main(String[] args) {
		Automobile one = new Automobile(99999, "Ford", "F150", "white", 2003, 9);
		input(one);
		Automobile two = new Automobile((-1000), "Ford", "F150", "grey", 2020, 61);
		input(two);
		Automobile three = new Automobile(1234, "Ford", "F150", "red", 2016, 23);
		input(three);
		
		
		
	}

	private static void input(Automobile one) {
		System.out.println("ID number: " + one.getId() + "\nYear: " + one.getYear() +
			" \nColor: " + one.getColor() + "\nMake: " + one.getMake() 
			+ "\nModel: " + one.getModel());
		System.out.println("------------------");
	}

}
