package nguyen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IntegerIfStatementProgram {

	public static void main(String[] args) {
		// Jennifer Nguyen
		// March 22 2016
		
		//Variables
		int integer; 
		int integerDiv;
		
		
		Scanner myInput = new Scanner(System.in); 
		DecimalFormat decimal = new DecimalFormat ("0.0#");
		
		System.out.println("Please input an integer."); 
		integer = Integer.parseInt(myInput.nextLine()); 
		
		//If statement for whether the integer is positive or negative 
		if (integer >= 0){
			System.out.println("Your integer is a positive number.");
		}
		else 
		{ 
			System.out.println("your integer is a negative number.");
		}
		
		//If statement for whether the integer is divisble by 7 
		if ((integer % 7) == 0) 
		{ 
			System.out.println("Your integer can be divisible by 7.");
			integerDiv = integer / 7;  //Diving the integer 
			System.out.println(integer + " ÷ 7 = " + integerDiv );
		}
		else 
		{
			System.out.println("Your integer can not be divisible by 7.");
			
		}
	}

}
