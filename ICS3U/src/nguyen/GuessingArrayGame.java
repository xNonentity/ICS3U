package nguyen;

import java.util.Scanner;

public class GuessingArrayGame {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String answer;
		int guesses = 0;

		String[] randItems = new String[] { "Husky", "Poodle", "German Sheperd", "Corgie", "Beagle", "Shih Ztu",
				"Chow Chow", "Pit Bull", "American Eskimo", "Collie", "Dalmatian", "Greyhound", "Bulldog",
				"Golden Retriever", "Yorkshire", "Pug", "Chihuahua", "Pomeranian", "Akita", "Shiba", "Boxer",
				"Great Dane", "Maltese", "Pointer" }; //24

		System.out.println("Hi, let's play a guessing. Think of a type of dog and enter any key to play.");
		input.nextLine();

		for (int i = 23; i != -1; i--) {

			guesses++;

			int randNum = (int) (Math.random() * 24);
			System.out.println("Is it a " + randItems[randNum]);
			
			answer = input.nextLine();

			if (answer.equalsIgnoreCase("Yes")) {
				System.out.println("I win!");
				System.out.println("I got it in " + guesses + " guesses!");
				i = 0;
			}

		}

		if (guesses == 24) {
			System.out.println("Darn, I made " + guesses + " guesses..");
			System.out.println("I don't know anymore, you win.");
		}

	}

}
