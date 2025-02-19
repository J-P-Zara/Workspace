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


public class Automobile {
	private int id;
	private String make;
	private String model;
	private String color;
	private int year;
	private int mph;
	
	public Automobile(int Id, String make, String model, 
			String color, int year, int mph) {
		this.setId(Id);
		this.setMake(make);
		this.setModel(model);
		this.setColor(color);
		this.setYear(year);
		this.setMph(mph);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id > 9999 || id < 0) {
			this.id = 0;
		}
		else {
			this.id = id;
		}
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year <= 2005 || year >= 2019) {
			this.year = 0;
		}
		else {
			this.year = year;
		}
			
	}
	public int getMph() {
		return mph;
	}
	public void setMph(int mph) {
		if(mph < 10 || mph > 60) {
			this.mph = 0;
		}
		else {
			this.mph = mph;
		}
	}
	

}
