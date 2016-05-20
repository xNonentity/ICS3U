package nguyen;

import java.text.DecimalFormat;
import java.util.Scanner; 
/**
 * This program takes two numbers from the user and in separate methods have the two numbers 
 * add, subtract, multiply and divide. 
 * @author Jennifer Nguyen
 * @version May 20th 2016 
 */

public class MathWithMethods { 
	
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
		numAddition (numOne, numTwo);
		numSubtraction (numOne, numTwo);
		numMultiply (numOne, numTwo);
		numDivision (numOne, numTwo); 
		
	} 
	/**
	 * This takes the two numbers and adds. 
	 * @param addOne - double 
	 * @param addTwo - double 
	 */
	
	public static void numAddition (double addOne, double addTwo) { 
		
		double ansAdd; 
		
		ansAdd = addOne + addTwo; 
		
		System.out.println(addOne + " + " + addTwo + " = " + (round.format(ansAdd)));
		
	} 
	
	/**
	 * This takes two numbers and subtracts.
	 * @param subOne - double 
	 * @param subTwo - double 
	 */
	
	public static void numSubtraction (double subOne, double subTwo) { 
		
		double ansSub; 
		
		ansSub = subOne - subTwo; 
		
		System.out.println(subOne + " - " + subTwo + " = " + (round.format(ansSub)));
		
	} 
	
	/**
	 * This takes two numbers and multiplies.
	 * @param multOne - double 
	 * @param multTwo - double 
	 */
	
public static void numMultiply (double multOne, double multTwo) { 
		
		double ansMult; 
		
		ansMult = multOne * multTwo; 
		
		System.out.println(multOne + " * " + multTwo + " = " + (round.format(ansMult)));
		
	} 
/**
 * This takes two numbers and divides.
 * @param divOne - double 
 * @param divTwo - double 
 */

public static void numDivision (double divOne, double divTwo) { 
	
	double ansDiv; 
	
	ansDiv = divOne / divTwo; 
	
	System.out.println(divOne + " / " + divTwo + " = " + (round.format(ansDiv)));
	
}

}
