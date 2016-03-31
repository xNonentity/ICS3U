package nguyen;

import java.util.Scanner;

public class GradesForLoop {

	public static void main(String[] args) {
		
		//Jennifer Nguyen
		//March 31 2016
		
		Scanner myInput = new Scanner(System.in);
		
		//Variables
		int userAnswer;
		int userGrades;
		
		//User's input 
		System.out.println("How many grades are you inputting?");
		userAnswer = Integer.parseInt(myInput.nextLine());

		//For loop
		for (int i = 1; i <= userAnswer; i++) {
			
			System.out.println("What are your grades?");
			userGrades = Integer.parseInt(myInput.nextLine());
			
			//Grades 
			
			//Fail
			if (userGrades <= 49) {

				System.out.println("Mark: " + userGrades);
				System.out.println("Grade: F");
			}
			
			//A "D"
			else if (userGrades <= 59) {

				System.out.println("Mark: " + userGrades);
				System.out.println("Grade: D");
			}
			
			//A "C"
			else if (userGrades <= 69) {

				System.out.println("Mark: " + userGrades);
				System.out.println("Grade: C");
			}
			
			//A "B"
			else if (userGrades <= 79) {

				System.out.println("Mark: " + userGrades);
				System.out.println("Grade: B");
			}
			
			//An "A"
			else if (userGrades <= 100) {

				System.out.println("Mark: " + userGrades);
				System.out.println("Grade: A");
			}
			
			//undefined. 
			else {
				
				System.out.println("Mark: " + userGrades);
				System.out.println("Grade: X");
				
			}
				
			
		}
		//Finished output. 
		System.out.println("Finished.");
	}

}
