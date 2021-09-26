package lab3_obrien;

import java.util.Scanner;

/*
 * Sarah O'Brien 
 * CSC 2720 Lab 3 Pt 1
 * 09/09/2021
 */

public class lab3pt1_obrien 
{
	public static void main(String[] args)
	   {
		  //asking user to input number of matrix rows
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Please enter number of matrix rows (max 5) : ");
	      int rows = scan.nextInt();
	      
	      //asking user to input number of matrix columns
	      System.out.println("Please enter number of matrix columns (max 5) : ");
	      int columns = scan.nextInt();
	      
	      //creating an array of the number of rows and columns
	      int[][] numbers = new int[rows][columns];
	      
	      //filling matrix with numbers
	      fillMat(scan, numbers, rows, columns);
	      //printing the matrix
	      printMat(numbers, rows, columns);
	      //rotating 90 degrees clockwise the matrix
	      rotateClockwise(numbers);
	   }
	
	   //filling the matrix function
	   public static void fillMat(Scanner scan, int num[][], int rows, int columns)
	   {
		  //asking user to input the elements of the matrix
	      System.out.println("Please enter elements in matrix, 1 to " + (rows*columns));
	      //setting up the amount of rows
	      for(int a = 0; a < rows; a++)
	      {
	    	 //setting up the amount of columns
	         for(int b = 0; b < columns; b++)
	         {
	        	//array of numbers the user provides turns into new array
	            num[a][b] = scan.nextInt();
	         }
	      }
	   }
	   
	   //function for printing the matrix
	   public static void printMat(int num[][], int rows, int columns)
	   {
		  //printing the matrix before the rotation
	      System.out.println("Printing 2d array in matrix form : ");
	      System.out.println("Before:");
	      for(int a = 0; a < rows; a++)
	      {
	         for(int b = 0; b < columns; b++)
	         {
	            System.out.print(num[a][b] + " ");
	         }
	         System.out.println();
	      }
	   }
	   
	   	//function for rotating the matrix clockwise
	    public static void rotateClockwise(int num[][])
	 	{
	    	//printing out the matrix after the rotation
	    	System.out.println("After: ");
	    	for (int a = 0; a < 4; a++)
	    	{
	    		for (int b = 3; b >= 0; b--)
	    			//printing out arranged numbers
	    			System.out.print(num[b][a] + " ");
	            	System.out.println();
	        }
	    }  
}
	