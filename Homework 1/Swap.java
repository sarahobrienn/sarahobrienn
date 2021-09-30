package Labs_OBrien;

import java.util.Scanner;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: Swap
 * Date: 02/02/2021
 * 
 * This program takes an input of a number and string from a user in order to swap the digits and letters of both.
 * Then, the methods swap the letters by changing the string to a char and swapping each char, and then the method takes the number and changes the digits with a while loop.
 * Finally, the program prints out the swapped string and number in the main method.  
 */

public class Swap 
{
	public static void main (String[] args)
		{		
			//main method used to print out the questions for the number/string and prints out the result of the swapped string and digit
			Scanner scan = new Scanner(System.in);
			System.out.print("Input a number to be swapped: ");
			int number = scan.nextInt();
			System.out.println("The number swapped is: " + swapDigitPairs(number));
        
			System.out.print("Input a string to be swapped: ");
			String string = scan.next();
			System.out.print("The string swapped is: " + swapLetterPairs(string));
		}
	
	  public static String swapLetterPairs(String string)
	    {  
		  //this method swaps the letters of the string by changing to a char and swapping every other number
		  int lengthString = string.length()-1;
	      char[] newChar = string.toCharArray();
		  char temp = 0;

		  for (int i=0; i < lengthString; i++)
		  	{   
			    temp = newChar[i];    
			    newChar[i] = newChar[i+1];
			    newChar[i+1] = temp;
			    i++;
			}
		  return (new String (newChar));
		 }

	  public static int swapDigitPairs(int number) 
	  	{ 
		  	//this method takes the number inputted and swaps ever letter and returns the new number
		  	int end = 1;
		  	int start = 0;
		  	int min = 8;
		  	
		    while (number >= min) 
		    	{		
		        	start = start + end * 10 * (number % 10);
		        	number = number / 10;
		        	start = start + end * (number % 10);
		        	number = number / 10;
		        	end = (end * 100);
		    	}	
		    int returnNumber = start + end * number;
		    return (returnNumber);
	  	}
}

