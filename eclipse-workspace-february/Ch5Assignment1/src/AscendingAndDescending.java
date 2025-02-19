//Jessie Zarate 02/17/2025 CSC 151 Chapter 5 Assignment 1

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		int small = 0;
		int middle = 0;
		int large = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three integers >>");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		
		if(num1 <= num2 && num1 <= num3)
			small = num1;
		else
			if(num2<=num1 && num2 <= num3)
			small = num2;
			else
				if (num3<=num1 && num3<=num2)
					small = num3;
		
		if (num1 >= num2 && num1 >= num2)
			large = num1;
		else
			if(num2 >= num1 && num2>=num3)
				large = num2;
			else
				if(num3 >= num1 && num3 >= num2)
					large  = num3;
		
		if(num1 >= num2 && num1 <= num3 || num1 <= num2 && num1 >= num3)
			middle = num1;
		else
			if(num2 >= num1 && num2 <= num3 || num2 <= num1 && num2 >= num3)
				middle = num2;
			else
				if(num3 >= num1 && num3 <= num2 || num3 <= num1 && num3 >= num2)
					middle = num3;
		
		System.out.println("the intgers in ascending order is" + small + ","
				+ middle + "," + large);
					
					
		

		
		
	}

}
