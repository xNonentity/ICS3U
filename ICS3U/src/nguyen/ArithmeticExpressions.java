package nguyen;

import java.util.Scanner;

public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Jennifer Nguyen
		// March 9th 2016 
		// Arithmetic Expressions 
		
		Scanner myInput = new Scanner (System.in); 
		
		//Variables of the five numbers
		double numOne; 
		double numTwo; 
		double numThree; 
		double numFour; 
		double numFive; 
		double numSum; 
		double numSub;
		double numProd;
		double numQuot; 
		double numRemain; 
		double numPower; 
		double numSqrR; 
	
		
		//User's input 
		System.out.println("Please input a number.");
		numOne = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("Please input another number.");
		numTwo = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("Please input the next number." );
		numThree = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("Please input another number.");
		numFour = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("Please input the last number.");
		numFive = Integer.parseInt(myInput.nextLine()); 
		
		//Math calculations 
		
		numSum = numOne + numTwo + numThree+ numFour + numFive; 
		numSub = numThree - numTwo; 
		numProd = numOne * numFive; 
		numQuot = numFour / numTwo; 
		numRemain = numFour % numTwo; 
		numPower = Math.pow(numOne, numThree); 
		numSqrR = Math.sqrt(numFive); 
		
	    //The outputs 
		
		System.out.println("Your five numbers:" + numOne + ", " + numTwo + ", " + numThree + ", " + numFour + ", " + numFive);
		System.out.println("Sum: " + numSum);
		System.out.println("Subtraction of the second number from the third: " + numSub);
		System.out.println("Product of the first and fifth number: " + numProd);
		System.out.println("Quotient of the forth number divided by the second: " + numQuot);
		System.out.println("The remainder when dividing the forth by the second: " + numRemain);
		System.out.println("First number to the power of the third number: " + numPower);
		System.out.println("Square root of the fifth number: " + numSqrR);
		

	}

}
