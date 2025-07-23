package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.util.Scanner;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";
		Scanner scanner = new Scanner(System.in);

		// 1. Ask the user to enter their name
		System.out.println("enter your name");
		String name = scanner.nextLine();
		System.out.println("Uppercase name:" + name.toUpperCase());
		for (int i = 0; i < name.length(); i++) {
			char currentChar = name.charAt(i);
			if (i % 2 == 0) {
				currentChar = Character.toUpperCase(currentChar);
			}
			else {
				currentChar = Character.toLowerCase(currentChar);
			}
			goofyName += currentChar;
		}
		System.out.println("ur goofy name is:"+goofyName);
 
		// 2. Print upper case name sctothe console using .toUpperCase()
		//    Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.

				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
	
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
			
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
			
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	}
}

