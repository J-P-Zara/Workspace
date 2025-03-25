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

public class StringSort2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] words = new String[15];
		final String QUIT = "ZZZ";

		System.out.println("Please enter up to 15 random words to alphabatize"
				+ " or enter \"ZZZ\" to quit");
		for(int i = 0; i < words.length; i++) {
			String currentWord = input.nextLine();
			if(QUIT.equals(currentWord)) {
				break;
			} 
			words[i] = currentWord;
		}
		
		
		int a = 1;
		String temp;
		while(a< words.length) 
		{
			if(words[a] == null) {
				break;
			}
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
			if(words[i] == null) {
				break;
			}
			System.out.println(words[i]);
		}
		
		
	}

}
