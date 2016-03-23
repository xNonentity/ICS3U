package nguyen;

import java.util.Scanner;

public class RandomPersonNameGenerator {

	public static void main(String[] args) {
		// Jennifer Nguyen
		// March 23 2016
		
		Scanner myInput = new Scanner(System.in); 
		
		//Variables 
		
		String usersName; 
		int randomGen;
		
		//output for user's input
		System.out.println("What is your name?");
		usersName = myInput.nextLine(); 
		
		//Random Generator 
		randomGen = (int)(Math.random() * 10) + 1; 
		
		//If statement
		if (randomGen <= 7){
			
			System.out.println("That's a beautiful name, it's my favorite.");
		}
		
		else 
		{
			System.out.println("That's a really ugly name, I hate it.");
		}
		
		

	}

}
