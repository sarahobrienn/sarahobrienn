package Labs_OBrien;

import java.util.Scanner;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: TicTac
 * Date: 03/02/2021
 * 
 * The program implements the game tic-tac-toe
 * This program uses arrays and if/else statements to use the user's input to place x and o's on the board
 * Finally, the program adds up the x's and o's up and determines a winner when the x's or o's go into a row 
 */

public class TicTac 
{
	//calls the player 1 and player 2's letters
	public static String player1 = "O";
	public static String player2 = "X";
	private String [] [] gameBoard;

		
	
	public static void main (String[]args) 
	{
		//calls scanner for user input
		Scanner scan = new Scanner(System.in);  
		
		//calls tictac as an object
		TicTac object = new TicTac();
		
		System.out.println("Welcome to TicTacToe! We have the following empty board, input a number 0-2: ");
		int x = 0;
		object.gameBoard();

		//calls array for the x's and o's to go into the game board
		char [][] gameBoard = new char [3][3];
				
		//calling the counts of x's and o'x and where they are located to find a winner 
		while (x <= 8) 
	       {
	    	   object.moves(scan, object.player1);
	    	   x++;
	    	   
	    	   if (x >= 5) 
	    	   {
	    		   if (object.winner(player1)) 
	    		   {
	    			   System.out.println("Winner! Player 1! Congrats!");   
	    		   }
	    	   }
	    	   
	    	   object.gameBoard();
	    	   object.moves(scan, object.player1);
	    	   x++;
	    	   
	    	   //finds player 2 as winner
	    	   if (x >= 5) 
	    	   {
	    		   if (object.winner(player2)) 
	    		   {
	    			   System.out.println("Winner! Player 2! Congrats!"); 
	    		   }
	    	   }
	    	   object.gameBoard();
	    	   object.moves(scan, object.player2);
	    	   x++;
	    	   if (x >= 5)
	    	   {
	    		   //draw if code doesn't work, or if player 1 and player 2 win
	    		   if(object.winner(null))
	    		   {
	    			   System.out.println("Draw!");   
	    		   }
	    	   }
		 }
	}
	
	public void moves(Scanner scan, String play) 
	{ 
		int columnIndex;
		int rowIndex;
		Boolean end = false;

		while(!end) 
		{
		   //asking user to enter next row
		   rowIndex = 0; //from -1 to 0
		   columnIndex = 0;
		   System.out.print("Enter the next row index:");

		if (scan.hasNextInt()) 
		{
			rowIndex = scan.nextInt();
		}

		//asking user to enter next column
		System.out.print("Enter the next column index:");

		if (scan.hasNextInt()) 
		{
			columnIndex = scan.nextInt();
		}

	    else if ((rowIndex > 2) || (columnIndex > 2) || (rowIndex < 0) ||(columnIndex< 0)) 
		{
			continue;
		}

		else if (gameBoard[columnIndex][rowIndex] != null )
		{
			//will allow game to continue, but user must input a number 0-2
			System.out.println("Someone is already here, try somewhere else");
			continue;
		}
		else 
		{
			gameBoard[columnIndex][rowIndex] = play;
			return;
		}
	}
	return;
}
	
	public TicTac() 
	{
		//array with 3 characters 
		gameBoard = new String[3][3];
	}

	public void gameBoard() 
	{
		//prints out top of game board
		System.out.println("------------------");

		for(int x = 0; x < gameBoard.length; x++) 
		{
			//prints spacers for board
			System.out.print(" | ");
			
			for(int y = 0; y < gameBoard[x].length; y++) 
			{
				if(gameBoard[x][y] == null ) 
				{
					System.out.print(" - ");
				} 
				else 
				{
					System.out.print(gameBoard[x][y]);
				}

				if(y<2) 
				{
					System.out.print(" | ");
				} 
				else 
				{
					System.out.println("");
					System.out.println("------------------");
				}
			}
		}
	}
	
	public Boolean winner(String play) 
	{
		//program that determines a winner
		int plays = 0; 
		int player2 = 0;
		int player1 = 0;

		int[] boardwin = new int[gameBoard[0].length];   

		for (int i = 0; i < gameBoard.length; i++) 
		{
			for (int j = 0; j < gameBoard[i].length; j++) 
			{
				if (gameBoard[i][j] == null ) 
				{
					continue;
				}

		if (gameBoard[i][j].equals(play)) 
		{
			//counts board plays 
			plays++;
			boardwin[j]++;
			
			if (i == j) 
			{
				player2++;
			}
			else if (2 == (i + j)) 
			{
				player1++;
			}
		}
	}

		if (plays == 3) 
		{
			//continues playing 
			return true;
		}
	}
		if (3 == player1 || 3 == player2) 
		{
			//continues playing
			return true;
		}

		for (int i = 0; i < boardwin.length; i++) 
		{
			if (boardwin[i] == 3) 
			{
				return true;
			}
		}
			return false;
		}

	

}
