package nguyen;
/* Jennifer Nguyen
 * April 26 2016
 * Some Practice Problems (A) 
 *  Input names into an array and prints them all then prints them backwards 
 */

import java.util.Scanner;

public class NameAssignment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in); 
		
		int numberName;
		
		System.out.println("How many names do you want to enter?");
		numberName =  Integer.parseInt(input.nextLine()); 
		
		String[] names = new String [numberName];
		
		System.out.println("Please input the names.");
		
		for (int i = 0; i < numberName; i++)
		{
			names[i] = input.nextLine();
		} 
		
		for (int i = 0; i < numberName; i++)
		{
			System.out.println(names[i]);
		}
		
		for (int i = numberName -1; i >= 0; i--){ 
			
			System.out.println(names[i]);
		}
		
		
		
		

	}

}
