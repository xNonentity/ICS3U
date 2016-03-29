package nguyen;

import java.util.Scanner;

public class RandomDiceGenerator {

	public static void main(String[] args) {
		// Jennifer Nguyen
		// March 23 2016

		Scanner myInput = new Scanner(System.in);

		// Variables

		int dieOne;
		int dieTwo;
		int resultUser;
		int compUser;
		String userInput;
		
		//Boolean to set a true or false
		boolean gameEnd = false;

		//While loop 
		while (gameEnd == false) {
			// Generating for User
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;

			resultUser = dieOne + dieTwo; // Math for result for user

			// Generating for computer
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;

			compUser = dieOne + dieTwo; // Math for result for computer

			// If statement
			if (resultUser > compUser) {

				System.out.println("You have won!");
				System.out.println("Your score: " + resultUser);
				System.out.println("Computer's score: " + compUser);
			}

			else {
				System.out.println("The computer has won.");
				System.out.println("Your score: " + resultUser);
				System.out.println("Computer's score: " + compUser);

			}

			System.out.println("Do you want to play again? ('YES' or 'NO')");
			userInput = myInput.nextLine();

			//If statement determining if the program shall continue
			if (userInput.equals("YES")) {

				gameEnd = false;
			} else {
				gameEnd = true;

			}
		}

	}

}
