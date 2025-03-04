//Jessie Zarate 03/01/2025 Chapter 7 Assignment 1

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		//String wordExample = "Lion! And Tiger! and bear...oh my!";
		String userInput = input.nextLine();
		StringBuilder example = new StringBuilder(userInput);
		int wordCount = 0;
		char aChar;
		boolean isWord = false;
		//it is intially set to false because if it is a letter it will bet set to 
		//true and (!isword) says that false does not equal true so it set it to true
		//it will not increase the increment by one until it becomes false again
		
		for(int position = 0; position < example.length(); position++)  {
			aChar = example.charAt(position);
	
			if(Character.isLetter(aChar)) {
				if(!isWord) {
					wordCount++;
					isWord = true; 
				}
			} 
			else {
					isWord = false;	
			}
			
		}

		System.out.println("There are " + wordCount + " words in the string");

		
	}

}
