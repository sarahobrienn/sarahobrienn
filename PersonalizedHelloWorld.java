package Lab1_obrien;

/*
 * Sarah O'Brien
 * CSC 2720 LAB 1
 * 08/27/2021
 * 
 */

import java.util.Scanner;

public class PersonalizedHelloWorld 
{
	public static void main(String[] args) 
    {
        //uses scanner for user input
		Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("What is your name? "); //asks name
        
        do //makes the code run this sequence 
        {
            name = scan.nextLine();
            
            if(name.isEmpty()) //if user input is blank then it asks again for the name
            {
               System.out.print("Please enter your name: ");
            }
            else //when given name breaks
            {
              break;
            }
         } 
         
        while (true);//if true then it prints out the name and hello
        { 
        	System.out.print("Hello, " + name + "!");
        }
    }
}

