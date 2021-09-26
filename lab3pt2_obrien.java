package lab3_obrien;
import java.util.Scanner;

/*
 * Sarah O'Brien
 * CSC 2720 Lab 3 Pt 2
 * 09/10/2021
 */

public class lab3pt2_obrien 
{
	public static void main(String[] args) 
	{
			//asking user for matrix row input
	    	Scanner scan = new Scanner(System.in);
		    System.out.println("Please enter number of matrix rows (max 5) : ");
		    //setting row input as row
	        int row = scan.nextInt();

	        //asking user for matrix elements
		    System.out.println("Please enter elements in matrix: ");
		    //creating a new array with the rows
	        int matrix[][]=new int[row][row];
	        
	        //for loop to setup matrix
	        for(int a = 0; a < row; a++)
	        {
	        	for(int b = 0; b < row; b++)
	        	{
	        		matrix[a][b]=scan.nextInt();
	        	}
	        }
	        {
	        	//executing function of rotating
	        	rotateClockwise(row,matrix);
	        }
	        	//executing function of printing matrix 
	        	printMat(matrix,row);
	    }
	
	//function for rotating clockwise
	public static void rotateClockwise(int row, int matrix[][])
	{
	  for (int a = 0; a < row; a++)
	  {
	    for (int b = a; b < row; b++)
	    {
	    	//using a temporary array for matrix
	    	int temp = matrix[a][b];
	    	//switching element positions in matriz
	    	matrix[a][b] = matrix[b][a];
	    	matrix[b][a] = temp;
	    }
	   }
	  
	  	//switching upper and lower portions of matrix
	    for(int a = 0; a < row; a++)
	    {
	    	int lower = (row - 1);
	    	int upper = 0;
	    	
	    	//while loop to execute the switching of upper and lower matrix
	    	while(upper < lower)
	    	{
	    		int temp = matrix[a][upper];
	    		matrix[a][upper]=matrix[a][lower];
	    		upper++;
	    		matrix[a][lower] = temp;
	    		lower--;
	    	}
	      }
	    }

		//function for printing matrix 
	    public static void printMat(int matrix[][], int row)
	    {
	    	//printing out rotated matrix
	    	System.out.println("Rotated Matrix: ");
	    	for(int a = 0; a < row; a++)
	    	{
	    		for(int b = 0; b < row; b++)
	    		{
	    			//printing out each row
	    			System.out.print(matrix[a][b]+" ");
	    		}
	    	System.out.println("");
	    	}
	    }
	}

/*
 * Explanation: Part 2 is a better and more efficient code because it doesn't create another matrix, this calls
 * for less space when executing the code. I prefer this way because of how quick it takes to code and understand.
 * Time complexity for this code:  O(n^2)
 * Space complexity for this code: O(1)
 */

