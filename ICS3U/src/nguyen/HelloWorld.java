package nguyen;

import java.util.Scanner;

public class HelloWorld {

	//Jennifer Nguyen
	// March 9th 2016 

	
                  

	public static void main(String[] args) 
	{
		
		Scanner myInput = new Scanner(System.in); 
		
		//Variables 
		int parentsAge; 
		int childsAge; 
		int differenceAge; 
		String mothersName; 
		String childsName; 
		
		System.out.println("What is your name?"); //Parent's Name 
		mothersName = myInput.nextLine(); 
		
		System.out.println("What is your birth year?"); //Parent's age
		parentsAge = Integer.parseInt(myInput.nextLine()); 
		
		System.out.println("What is your child's name?"); //Child's name 
		childsName = myInput.nextLine(); 
		
		System.out.println("What is your child's birth year?"); //Child's age 
		childsAge = Integer.parseInt(myInput.nextLine()); 
		
		//Calculation
		differenceAge = childsAge = parentsAge; 
		
		System.out.println("Hi " + mothersName + ", you were born in " + parentsAge + " and you had " + childsName + " at the age of " + differenceAge + " years old" + ".");
	}

}
