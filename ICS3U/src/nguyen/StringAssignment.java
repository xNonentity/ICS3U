package nguyen;

/*
 * Jennifer Nguyen
 * May 9th 2016 
 * String Assignment where there will be dashes for a hidden word, the user will guess and the letters will appear
 * User must guess the word 
 */
import java.util.Scanner;

public class StringAssignment {

	public static void main(String[] args) {
		//Scanner 
		 Scanner input = new Scanner (System.in);
		 //Variables
		 String [] randWords = new String[] {"mental", "crazy", "dark", "spiderman","home","author","world" };  
		 String dashes = "";
		 String guess; 
		 
		 //random generator 
		 int random = (int) (Math.random() * randWords.length); 
		 
		 System.out.println("Hey, let's play a guessing game!");
		 System.out.println("Try to guess my word!"); 
		 
		 //for loop 
		 for (int i = 0; i < randWords[random].length(); i++){
			 
			 dashes = dashes+"-"; 
			 
		 }
		 //do while loop
		 do {
			 System.out.println("Guess a letter that's in my word or enter ! to guess the entire word."); 
			 System.out.println(dashes);
			 guess = input.nextLine(); 
			 
			 //guess the entire word 
			 if (guess.equalsIgnoreCase("!"))
			 {
				System.out.println("Okay, guess the word!");
				guess = input.nextLine(); 
				
				if (guess.equalsIgnoreCase(randWords[random])){
					System.out.println("Congratulations! You win!");
				}
				
				else {
					System.out.println("Darn, try again.");
				}
			 }
			 else { 
				 
				 int num = randWords[random].indexOf(guess); 
				 if (num == -1){ 
					 
					 System.out.println("Nope, try again."); 
					 System.out.println("Guess a letter that's in my word or enter ! to guess the entire word."); 
					 System.out.println(dashes);
					 guess = input.nextLine();
					 
				 }
				 else {
					 
					 dashes = dashes.substring(0,num) + guess + dashes.substring(num +1,randWords[random].length()); 
					 System.out.println(dashes);
				 }
				 //if word is all guessed correctly 
				if (dashes.charAt(0)!='-'&& dashes.charAt(1)!='-'&& dashes.charAt(2)!='-'&& dashes.charAt(3)!='-'&& dashes.charAt(4)!='-'&& dashes.charAt(5)!='-'&& dashes.charAt(6)!='-'&& dashes.charAt(7)!='-'&& dashes.charAt(8)!='-'){
					
					System.out.println("Congratulations! You win!");
				}
				 
			 }
		 }
		 while (!guess.equalsIgnoreCase(randWords[random])); 
	}

}
