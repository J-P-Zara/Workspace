import java.util.Scanner;

public class AlphabeticalSorter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		String wordOne = input.nextLine();
		//StringBuilder sentenceA = new StringBuilder(wordOne);
		String wordTwo = input.nextLine();
		//StringBuilder sentenceB = new StringBuilder(wordTwo);
		String wordThree = input.nextLine();
		//StringBuilder sentenceC = new StringBuilder(wordThree);
		
		//int num1 = wordOne.compareToIgnoreCase(wordTwo);
		//int num2 = wordOne.compareToIgnoreCase(wordThree);
		//int num3 = wordTwo.compareToIgnoreCase(wordThree);
		boolean isAlphabetical = true;
		
		//the compareto method should return a negative value if it is alphabetical for example cat and dog should return a value of -1
		// because c is less than d by one.
		

			if((wordOne.compareToIgnoreCase(wordTwo) <= 0) && (wordTwo.compareToIgnoreCase(wordThree) <= 0)) {
				System.out.println("You entered the strings in alphabetical order");
			}
			else {
				System.out.println("You did not enter the words in alphabetical order ");
			}
			
			
			String firstWord, secondWord, thirdWord;
			if(wordOne.compareToIgnoreCase(wordTwo) > 0) {
				firstWord = wordOne;
				wordOne = wordTwo;
				wordTwo = firstWord;
				//the first word is word one,however, because wordOne is greater than WordTwo that mean that WordTwo is the first word in 
				//alphabetical order
			}
			if(wordTwo.compareToIgnoreCase(wordThree) > 0) {
				secondWord = wordTwo;
				wordTwo = wordThree;
				wordThree = secondWord;	
			}
			if(wordOne.compareToIgnoreCase(wordThree) > 0) {
				thirdWord = wordOne;
				wordOne = wordThree;
				wordThree = thirdWord;	
			}
			
			System.out.println("The three words in alphabetical order are: " + wordOne + "," + wordTwo + "," + wordThree);
			
		
		
		
	//	if((wordOne.compareToIgnoreCase(wordTwo) <= 0) && (wordOne.compareToIgnoreCase(wordThree) <= 0)) {
	//		System.out.println("You entered the strings in alphabetical order");
	//	}
	//	else if ((wordTwo.compareToIgnoreCase(wordOne) <= 0) && (wordOne.compareToIgnoreCase(wordThree) <= 0)){
	//		System.out.println("You did not enter the words in alphabetical order ");
	//	}
	//	else if((wordThree.compareToIgnoreCase(wordOne) <= 0) && (wordThree.compareToIgnoreCase(wordTwo) <= 0)) {
	//		
	//	}
			
		
		

		
			
		
		
		System.out.println(wordOne.compareTo(wordTwo) + " " + wordOne.compareTo(wordThree));


		
		
	}

}
