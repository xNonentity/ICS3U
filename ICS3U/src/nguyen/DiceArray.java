package nguyen;
/*
 * Jennifer Nguyen
 * April 27 2016
 * Assignments to hand In #1 Dice Program 
 * The program rolls 10,000 times and will tell you how many rolls each number had. 
 */

public class DiceArray {

	public static void main(String[] args) {
		// Jennifer Nguyen
		// April 22 2016
		// Dice Array Assignment
		
		int[] totals = new int[11];
		int dice;
		int diceTwo;
		int total;

		

		for (int i = 0; i < 10000; i++) {
			dice = (int) (Math.random() * 6) + 1;
			diceTwo = (int) (Math.random() * 6) + 1;
			total = dice + diceTwo; 
			if (total == 2) {

				totals[0]++;
			}

			else if (total == 3) {

				totals[1]++;
			}
			
			else if (total == 4) {

				totals[2]++;
			}
			
			else if (total == 5) {

				totals[3]++;
			}
			else if (total == 6) {

				totals[4]++;
			}
			else if (total == 7) {

				totals[5]++;
			}
			else if (total == 8) {

				totals[6]++;
			}
			else if (total == 9) {

				totals[7]++;
			}
			
			else if (total == 10) {

				totals[8]++;
			}
			
			else if (total == 11) {

				totals[9]++;
			}
			else if (total == 12) {

				totals[10]++;
			}
		}
		
		System.out.println("Total - Number of Rolls");
		System.out.println("2      " + totals[0] );
		System.out.println("3      " + totals[1] );
		System.out.println("4      " + totals[2] );
		System.out.println("5      " + totals[3] );
		System.out.println("6      " + totals[4] );
		System.out.println("7      " + totals[5] );
		System.out.println("8      " + totals[6] );
		System.out.println("9      " + totals[7] );
		System.out.println("10     " + totals[8] );
		System.out.println("11     " + totals[9] );
		System.out.println("12     " + totals[10] );
	}

}
