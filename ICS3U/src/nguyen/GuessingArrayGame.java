package nguyen;
/*
 * Jennifer Nguyen
 * April 28 2016
 * Guessing Game Array 
 * You think of a type of dog and the computer guesses! 
 */

import java.util.Scanner;

public class GuessingArrayGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String[] randItems = new String[] { "Husky", "Poodle", "German Sheperd", "Corgie", "Beagle", "Shih Ztu",
				"Chow Chow", "Pit Bull", "American Eskimo", "Collie", "Dalmatian", "Greyhound", "Bulldog",
				"Golden Retriever", "Yorkshire", "Pug", "Chihuahua", "Pomeranian", "Akita", "Shiba", "Boxer",
				"Great Dane", "Maltese", "Pointer" }; //24
		String answer;
		int guesses = 0;
		int i = 0;
		boolean [] guess = new boolean [randItems.length];
		

		System.out.println("Hi, let's play a guessing. Think of a type of dog and enter any key to start. ");
		answer=input.nextLine();
		do {
			
			
			int randNum = (int) (Math.random() * randItems.length);
			//System.out.println("Is it a " + randItems[randNum]);
			//answer = input.nextLine();
			
			
			if (!guess[randNum]){ 
				
				guess[randNum] = true; 
				System.out.println("Is it a " + randItems[randNum]);
				guesses++;
				answer = input.nextLine();
				i++; 
			}
			if (answer.equalsIgnoreCase("Yes")) {
				System.out.println("I win!");
				System.out.println("I got it in " + guesses + " guesses!");
				i = 0;
			} 
			
			if (i == randItems.length) {
				System.out.println("Darn, I made " + guesses + " guesses..");
				System.out.println("I don't know anymore, you win.");
				answer = "yes"; 
			
			
			}
			
		}
		while (answer.equalsIgnoreCase("No"));
		

		
		

	}

}
