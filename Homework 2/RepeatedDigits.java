package Labs_OBrien;

import java.util.Scanner;


/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: RepeatedDigits.java
 * Date: 02/10/2021
 * 
 * This program has the user input a long digit of numbers.
 * Then, the program counts how many times the certain digit of 1-9 repeats or shows up.
 * Finally the program prints out the user input and the count occurences.
 * 
 */


public class RepeatedDigits 
{
	public static void main(String[] args)
	{
		//the scanner allows the user to input a sequence of numbers
		  Scanner scan = new Scanner(System.in);
	      System.out.print("Enter a number or 0 to end: ");
	      int num = scan.nextInt();
	      
	      while(num >= 1)
	      	{
	    	  // if the numbers are greater or equal to 1 then the program will run
	    	  int occurences[] = new int[10];
	    	  //calls method 
	    	  countOccurences(num, occurences);
	    	  System.out.println("");
	    	  
	    	  System.out.print("Enter a number or 0 to end: ");
	    	  num = scan.nextInt();
	    	  //if the user input 0 the program will end
	      	}
	}

	public static void countOccurences(int num, int occurences[])
	{
		   int digit = 0;

		   while(num > 0)
		   {
			   // as long as the number is above 0 the program will run
		       digit = (num % 10); 
		       occurences[digit] = (occurences[digit] + 1); 
		       num = (num / 10); 
		   }
		       System.out.print("Digit:          ");
		       //the program will print out the digit that was inputted
		    for (int x = 0; x <= 9; x++)
		       {
		    		System.out.print(x + " "); 
		       }
		       System.out.println("");
		       System.out.print("Occurences:     ");
		       
		       for (int x = 0; x <= 9; x++)
		       		{
		    	   //prints out occurances of the inputted numbers
		    	   		System.out.print(occurences[x] + " "); 
		       		}
		       //spaces for readability
		       System.out.println("");
		   }
	}  


