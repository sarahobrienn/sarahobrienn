package Labs_OBrien;

import java.util.Scanner;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: Parameters
 * Date: 02/02/2021
 * 
 * This program asks the user to first input an operator and then to input two numbers. 
 * Then the program uses an if/else if/else statement to determine how to find the product or sum of each equation.
 * Finally, the program outputs what the inputs were, and outputs the answer of the equation, all using SOP statements. 
 */

public class Parameters
{
	public static void main(String[] args)
	{
		//main argument performing inputs and outputs
		System.out.print("Enter an operator: ");
		Scanner scan = new Scanner(System.in);
		char operator=scan.next( ).charAt(0);
		
		System.out.print("Enter a first number: ");
		int firstNum = scan.nextInt();
		
		System.out.print("Enter a second number: ");
		int secondNum = scan.nextInt();
		
		System.out.println("You inputted: " + "(" + operator + "," + firstNum + "," + secondNum + ")");
		
		parameters(firstNum, secondNum, operator);
	}
	
	private static void parameters(int firstNum, int secondNum, char operator) 
		{
			//performs equations the user gives
			if(operator == '*')
				{
					System.out.println("The multiplication answer is: " + (firstNum * secondNum));
				}
			else if (operator == '+')
				{
					System.out.println("The addition answer is: " + (firstNum + secondNum));	
				}
			else if (operator == '-')
				{
					System.out.println("The subtraction answer is: " + (firstNum - secondNum));
				}
			else if (operator == '/')
				{
					System.out.println("The division answer is: " + (firstNum / secondNum));
				}
			else if (operator == '%')
				{
					System.out.println("The remainder answer is: " + (firstNum % secondNum));
				}
			else
				{
				//used in case the operators are inputted
					System.out.println("The operator inputted isn't valid, try inputting a different operator");
				}
		}
}


