//Jessie Zarate CSC 151 - Chapter 9 Assignment 1
/*
 * Write an application containing an array of 15 String values 
 * (that are not originally in alphabetical order), 
 * and display them in ascending order. Save the file as StringSort.java.
 * 
 * Write an application that accepts any number of 
 * String values from a user up to 15, and display them in ascending order. 
 * Save the file as StringSort2.java.
 */

import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		
		String[] words = new String[15];
		words[0] = new String("Cat");
		words[1] = new String("Dog");
		words[2] = new String("Bat");
		words[3] = new String("Animal");
		words[4] = new String("Pig");
		words[5] = new String("Fish");
		words[6] = new String("Train");
		words[7] = new String("Car");
		words[8] = new String("Camera");
		words[9] = new String("Photo");
		words[10] = new String("Print");
		words[11] = new String("Laptop");
		words[12] = new String("Rhino");
		words[13] = new String("Goat");
		words[14] = new String("Hippo");
		
		
		int a = 1;
		String temp;
		while(a< words.length) 
		{
			temp = words[a]; 
			int b = a-1;
			while(b>=0 && words[b].compareToIgnoreCase(temp) > 0)
			{
				words[b + 1] = words[b];
				b--;
			}
			words[b+1] = temp;
			++a;
		}
		
		for(int i = 0; i< words.length; i++) {
			System.out.println(words[i]);
		}
		
	}

}
