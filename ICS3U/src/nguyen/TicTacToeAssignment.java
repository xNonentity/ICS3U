package nguyen;
/*
 * Jennifer Nguyen
 * May 11 2016 
 * Two Dimensional Array! 
 * Tic Tac Toe Game of Two Dimensional Array
 */
import java.util.Scanner;

public class TicTacToeAssignment {

	public static void main(String[] args) {
		
		//Variables 
		String [][] gameBoard=new String [3][3];
		gameBoard[0][0] = "";
		gameBoard[0][1] = "";
		gameBoard[0][2] = "";
		gameBoard[1][0] = "";
		gameBoard[1][1] = "";
		gameBoard[1][2] = "";
		gameBoard[2][0] = "";
		gameBoard[2][1] = "";
		gameBoard[2][2] = "";
		
		boolean winner = false;
		boolean[][] doneAlrdy = new boolean[3][3];
		boolean x = false;  
		boolean o = false; 
		int row;
		int column;
		boolean playAgain = false; 
		String again; 
		
		Scanner input =new Scanner (System.in);
		
		while (!playAgain)
		{
			System.out.println("E.g 1 & 3 1 being the row, 3 being the column."); 
			System.out.println("Note: Input row first, then input column number.");
		while (!winner)
		{
			System.out.println("Player X!");
			System.out.println("What are the coordinates you would like to place the X(e.g. 3 1)");
		
			row = input.nextInt();
			column = input.nextInt();
			
			//they don't use the same coordinates 
			if (!doneAlrdy[row-1][column-1]){
				doneAlrdy[row-1][column-1] = true; 
			
		
			gameBoard[row-1][column-1] = "|  X  |";
		
			//Displays the tic tac toe 
			System.out.println(gameBoard[0][0] + "\t" + gameBoard[0][1] + "\t" + gameBoard[0][2]);
			System.out.println(gameBoard[1][0] + "\t" + gameBoard[1][1] + "\t" + gameBoard[1][2]);
			System.out.println(gameBoard[2][0] + "\t" + gameBoard[2][1] + "\t" + gameBoard[2][2]);
		
			//Situations of winner 
			if(gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][0] == gameBoard[0][2] &&! gameBoard[0][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2] &&! gameBoard[1][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][0] == gameBoard[2][2] &&! gameBoard[2][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[0][0] == gameBoard[1][0] && gameBoard[0][0] == gameBoard[2][0] &&! gameBoard[1][0].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][0] == gameBoard[1][2] &&! gameBoard[1][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][0] == gameBoard[2][2] &&! gameBoard[2][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] &&! gameBoard[2][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0] &&! gameBoard[0][2].equals(""))
			{
				System.out.println(" X player wins!");
				winner = true;
			}
			else
			{
				winner = false;
			} //CATS GAME 
			if (!gameBoard[0][0].equals("") &&! gameBoard[0][1].equals("") &&! gameBoard[0][2].equals("") &&! gameBoard[1][0].equals("") &&! gameBoard[1][1].equals("") && gameBoard[1][2].equals("") &&! gameBoard[2][0].equals("") &&! gameBoard[2][1].equals("") &&! gameBoard[2][2].equals("")){
			
				System.out.println("Aw, it was a tie."); 
				winner = true; 
		    }
			x = false;
			//Same coordinates
			} else {
				System.out.println("Sorry, thst's been used already.");
				x = true; 
			}
		
			
			if (!winner)
			{
			System.out.println("Player O!");
			System.out.println("What are the coordinates you would like to place the O(e.g. 3 1)");
		
			row = input.nextInt();
			column = input.nextInt();
			
			if (!doneAlrdy[row-1][column-1])
			{ 
				doneAlrdy[row-1][column-1] = true; 
			
		
			gameBoard[row-1][column-1]= "|  O  |";
		
			//Display the tic tac toe 
			System.out.println(gameBoard[0][0] + "\t" + gameBoard[0][1] + "\t" + gameBoard[0][2]);
			System.out.println(gameBoard[1][0] + "\t" + gameBoard[1][1] + "\t" + gameBoard[1][2]);
			System.out.println(gameBoard[2][0] + "\t" + gameBoard[2][1] + "\t" + gameBoard[2][2]);
			
			//Situations of winner 
			if(gameBoard[0][0] == gameBoard[0][1] && gameBoard[0][0] == gameBoard[0][2] &&! gameBoard[0][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[1][2] &&! gameBoard[1][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][0] == gameBoard[2][2] &&! gameBoard[2][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[0][0] == gameBoard[1][0] && gameBoard[0][0] == gameBoard[2][0] &&! gameBoard[1][0].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[1][0] == gameBoard[1][1] && gameBoard[1][0] == gameBoard[1][2] &&! gameBoard[1][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[2][0] == gameBoard[2][1] && gameBoard[2][0] == gameBoard[2][2] &&! gameBoard[2][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[0][0] == gameBoard[1][1] && gameBoard[0][0] == gameBoard[2][2] &&! gameBoard[2][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else if(gameBoard[0][2] == gameBoard[1][1] && gameBoard[0][2] == gameBoard[2][0] &&! gameBoard[0][2].equals(""))
			{
				System.out.println("O player wins!");
				winner = true;
			}
			else
			{
				winner = false;
			}
			//CATS GAME 
			if (!gameBoard[0][0].equals("") &&! gameBoard[0][1].equals("") &&! gameBoard[0][2].equals("") &&! gameBoard[1][0].equals("") &&! gameBoard[1][1].equals("") && gameBoard[1][2].equals("") &&! gameBoard[2][0].equals("") &&! gameBoard[2][1].equals("") &&! gameBoard[2][2].equals("")){
			
				System.out.println("Aw, it was a tie.");
			}
			o = false; 
			//Using the same coordinates 
			} else {
				System.out.println("Sorry, that's been used already.");
				o = true; 
			}
		}
		}
		//Play Again!? 
		System.out.println("Do you want to play again?");
		input.nextLine();
		again = input.nextLine(); 
		//YES
		if (again.equalsIgnoreCase("Yes")) 
		{
			//RESET 
			playAgain = false; 
			winner = false; 
			gameBoard[0][0] = "";
			gameBoard[0][1] = "";
			gameBoard[0][2] = "";
			gameBoard[1][0] = "";
			gameBoard[1][1] = "";
			gameBoard[1][2] = "";
			gameBoard[2][0] = "";
			gameBoard[2][1] = "";
			gameBoard[2][2] = "";
			
			doneAlrdy[0][0] = false;
			doneAlrdy[0][1] = false;
			doneAlrdy[0][2] = false;
			doneAlrdy[1][0] = false;
			doneAlrdy[1][1] = false;
			doneAlrdy[1][2] = false;
			doneAlrdy[2][0] = false;
			doneAlrdy[2][1] = false;
			doneAlrdy[2][2] = false;
			
			x = false;  
			o = false; 
		} //NO
		else { 
			System.out.println("Goodbye!");
			
		}
	}

	}
}
