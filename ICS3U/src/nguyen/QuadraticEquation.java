package nguyen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		//Jennifer Nguyen
		// March 10th 2016 
		
		//Variables 
		
		int varA;  
		int varB; 
		int varC; 
		double varSub;
		double varRootsPos;
		double varRootsNeg; 
		
		Scanner myInput = new Scanner(System.in); 
		DecimalFormat decimal = new DecimalFormat ("0.0#"); 
		
		//input of the variables
		
		System.out.println("Please input your 'A' value.");
		varA = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("Please input your 'B' value.");
		varB = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("Please input your 'C' value."); 
		varC = Integer.parseInt(myInput.nextLine());
		
		System.out.println("Your quadratic equation: " + varA + "x^2 + " + varB + "x + " + varC);

		//Discriminant + calculations 
		varSub = (Math.pow(varB,2) - 4 * varA * varC); 
		varRootsPos = (-varB  + (Math.sqrt(varSub))) / (2 * varA); 
		varRootsNeg = (-varB - (Math.sqrt(varSub))) / (2 * varA); 
		
		if (varSub == 0) //One root only
		{ 
			System.out.println("You have one root.");
			varRootsPos = (-varB  + (Math.sqrt(varSub))) / (2 * varA); 
			varRootsNeg = (-varB - (Math.sqrt(varSub))) / (2 * varA); 
			System.out.println("Roots: " + decimal.format(varRootsPos) + " or " + decimal.format(varRootsNeg));
		}
		
		else if (varSub > 0) //Two roots only
		{
			System.out.println("You have two roots.");
			varRootsPos = (-varB  + (Math.sqrt(varSub))) / (2 * varA); 
			varRootsNeg = (-varB - (Math.sqrt(varSub))) / (2 * varA); 
			System.out.println("Roots: " + decimal.format(varRootsPos) + " or " + decimal.format(varRootsNeg));
		}
		
		else //Discriminant is negative therefore no roots 
		{
			System.out.println("You have no roots.");
		}
		
	
		
	}

}
