package nguyen;

import java.util.Scanner;
/*
 * Jennifer Nguyen
 * May 30th 2016 
 * Using an isDivisable and Prime methods to determine whether the user's number is a prime number or not
 */

public class PrimeNumber {
	//Global variable
	public static int num;

	public static void main(String[] args) {
		
		//Scanner
		Scanner input = new Scanner(System.in);
		String again;
		boolean end = false; 

		//User's input
		while (end == false) {
		System.out.println("Please enter a number.");
		
		num = input.nextInt();
			
			if (isPrime(num))
			{
				System.out.println("Fortunately, " + num +" is prime!");
			}
			else
			{
				System.out.println("Unfortunately, " + num + " is not prime!");
			}
		
		System.out.println("Want to enter another number? ('Yes' or 'No')");
		input.nextLine();
		again = input.nextLine();

		//If statement determining if the program shall continue
		if (again.equalsIgnoreCase("Yes")) {

			end = false;
			
		} else {
			
			end = true;

		}
		
		}

	}
	//If it's divisible 
	public static boolean isDivisible (int num, int counter) {
		
		if(num % counter != 0)
			
		{
			return (false);
		}
	
		return(true);
	
	}
	//If its a prime
	public static boolean isPrime (int num){
		
		if(num == 0 || num == 1)
		{
			return(false);
		}
		
		for(int counter = 2; counter < num; counter++)
		{
			if (isDivisible(num, counter) == true)
			{
				return (false);
			}
		}
		
		return(true);
	}

}
