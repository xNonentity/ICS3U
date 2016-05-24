package nguyen;

import java.text.DecimalFormat;
import java.util.Scanner; 
/**
 * This program takes two numbers from the user and in separate methods have the two numbers 
 * add, subtract, multiply and divide and return to the main method.
 * @author Jennifer Nguyen
 * @version May 20th 2016 
 */

public class FunWithMath2 { 
	
	public static DecimalFormat round = new DecimalFormat ("0.00"); //For rounding 

	public static void main(String[] args) {
		
		//Variables
		double numOne; 
		double numTwo; 
		
		Scanner input = new Scanner (System.in); 
		
		//Input of the two numbers
		System.out.println("Please input your first number.");
		numOne = input.nextDouble(); 
		
		System.out.println("Please input your second number.");
		numTwo = input.nextDouble();  
		
		//Call on the methods. 
		
		System.out.println(numOne + " + " + numTwo + " = " + round.format(numAddition(numOne,numTwo)));
		System.out.println(numOne + " - " + numTwo + " = " + round.format(numSubtraction(numOne,numTwo)));
		System.out.println(numOne + " * " + numTwo + " = " + round.format(numMultiply(numOne,numTwo)));
		System.out.println(numOne + " / " + numTwo + " = " + round.format(numDivision(numOne,numTwo)));
		
	} 
	/**
	 * This takes the two numbers and adds. 
	 * @param addOne - double 
	 * @param addTwo - double 
	 */
	
	public static double numAddition (double addOne, double addTwo) { 
		
		double ansAdd; 
		
		ansAdd = addOne + addTwo; 
		
		return ansAdd; 
	} 
	
	/**
	 * This takes two numbers and subtracts.
	 * @param subOne - double 
	 * @param subTwo - double 
	 */
	
	public static double numSubtraction (double subOne, double subTwo) { 
		
		double ansSub; 
		
		ansSub = subOne - subTwo; 
		return ansSub; 
	} 
	
	/**
	 * This takes two numbers and multiplies.
	 * @param multOne - double 
	 * @param multTwo - double 
	 */
	
public static double numMultiply (double multOne, double multTwo) { 
		
		double ansMult; 
		
		ansMult = multOne * multTwo; 
		
		return ansMult; 
		
	} 
/**
 * This takes two numbers and divides.
 * @param divOne - double 
 * @param divTwo - double 
 */

public static double numDivision (double divOne, double divTwo) { 
	
	double ansDiv; 
	
	ansDiv = divOne / divTwo; 
	
	return ansDiv; 
	
}

}
