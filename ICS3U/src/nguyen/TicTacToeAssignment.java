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
		int row;
		int column;
		
		Scanner input =new Scanner (System.in);
		
		while (winner==false)
		{
			System.out.println("What are the coordinates you would like to place the X(e.g. 3 1)");
			System.out.println("E.g 1 & 3 (1 being the row, 3 being the column."); 
			System.out.println("Note: Input row first, then input column number.");
		
			row = input.nextInt();
			column = input.nextInt();
		
			gameBoard[row-1][column-1] = "|  X  |";
		
			//Displays the tic tac toe 
			System.out.println(gameBoard[0][0] + "   " + gameBoard[0][1] + "   " + gameBoard[0][2]);
			System.out.println(gameBoard[1][0] + "   " + gameBoard[1][1] + "   " + gameBoard[1][2]);
			System.out.println(gameBoard[2][0] + "   " + gameBoard[2][1] + "   " + gameBoard[2][2]);
		
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
			}
			if (!gameBoard[0][0].equals("") &&! gameBoard[0][1].equals("") &&! gameBoard[0][2].equals("") &&! gameBoard[1][0].equals("") &&! gameBoard[1][1].equals("") && gameBoard[1][2].equals("") &&! gameBoard[2][0].equals("") &&! gameBoard[2][1].equals("") &&! gameBoard[2][2].equals("")){
			
				System.out.println("Aw, it was a tie."); 
				winner = true; 
		    }
			
			if (winner == false)
			{
			System.out.println("What are the coordinates you would like to place the O(e.g. 3 1)");
		
			row = input.nextInt();
			column = input.nextInt();
		
			gameBoard[row-1][column-1]= "|  O  |";
		
			//Display the tic tac toe 
			System.out.println(gameBoard[0][0] + "   " + gameBoard[0][1] + "   " + gameBoard[0][2]);
			System.out.println(gameBoard[1][0] + "   " + gameBoard[1][1] + "   " + gameBoard[1][2]);
			System.out.println(gameBoard[2][0] + "   " + gameBoard[2][1] + "   " + gameBoard[2][2]);
			
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
			
			if (!gameBoard[0][0].equals("") &&! gameBoard[0][1].equals("") &&! gameBoard[0][2].equals("") &&! gameBoard[1][0].equals("") &&! gameBoard[1][1].equals("") && gameBoard[1][2].equals("") &&! gameBoard[2][0].equals("") &&! gameBoard[2][1].equals("") &&! gameBoard[2][2].equals("")){
			
				System.out.println("Aw, it was a tie.");
			}
		}
	}

	}
}
