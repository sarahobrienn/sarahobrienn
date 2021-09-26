package Lab1_obrien;

/*
 * Sarah O'Brien
 * CSC 2720 LAB 1
 * 08/27/2021
 * 
 */

import java.util.*;

public class GuessMyNumber 
{
	public static void main(String[]args) 
	{
		   Scanner scan = new Scanner(System.in); //scanner for user input
	       System.out.print("Enter n : "); //asking to enter a number
	       int input; //variable for input
	       input = scan.nextInt(); //input becomes a scanner
	       
	       while(input < 1) //if input is negative then asks to make it a positive number
	       {
	    	   System.out.println("Enter a positive integer for n: ");
	    	   input = scan.nextInt();
	       }
	       
	       System.out.println("Welcome to Guess My Number!"); //welcoming to game
	       System.out.println("Please think of a number between 0 and "+ (input-1) + ".");
	       guesses(0,(input-1));  //asking user to input a number from 0 to between their number
	 }
	
	public static void guesses(int minimum , int maximum) //function for guesses
	{
		Scanner scanner = new Scanner(System.in);

		if(minimum == maximum) //when input equals each other
		{
			System.out.println("Is your number: " + minimum +" ? "); //asking a number randomly
			System.out.println("Please enter C for correct, H for too high, or L for too low.");
			System.out.print("Enter your response(H/L/C): "); //having user input H L or C
			char ans = scanner.next().charAt(0);
		
		while((ans != 'C') && (ans != 'H') && (ans != 'L'))
		{
			System.out.print("Enter your response(H/L/C): ");
			ans = scanner.next().charAt(0); //while the answer is not H L or C asks again for those
		}
		
		if(ans=='C') //if answer is C , then correct
			
			System.out.println("Thank you for playing Guess My Number!");
		}
		else
		{
			int mid =(int)Math.ceil(((double)(minimum + maximum)) / 2.0); //divides min and max for middle number
			System.out.println("Is your number: "+ mid +"?");
			System.out.println("Please enter C for correct, H for too high, or L for too low.");
			System.out.print("Enter your response(H/L/C): ");//asking for H L or C
			char ans = scanner.next().charAt(0);

			while((ans != 'C') && (ans != 'H') && (ans != 'L'))
			{
				System.out.print("Enter your response (H/L/C): ");
				ans = scanner.next().charAt(0); //keeps asking for letter until number found
			}
			
			if(ans == 'C') //if answer found, then thanks user
				System.out.println("Thank you for playing Guess My Number! ");
			else if(ans =='H') //if too high will go down
				guesses(minimum,mid - 1);
			else //if too low will go up
				guesses(mid + 1,maximum);
			}
		}
}


