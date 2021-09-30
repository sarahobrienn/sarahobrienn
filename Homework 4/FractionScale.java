package Labss_OBrien;

import java.util.*;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: FractionScale.java
 * Date: 03/29/2021
 * 
 * This program executes the FractionScale code by helping the Fraction code.
 * Then determines to scale up or down based on the user, and asks the question for the code.
 * Finally, the program prints out the final new fraction.  
 * 
 */


public class FractionScale 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a fraction: "); //enter a starting fraction 
		
		String scale = scan.nextLine();
		int num = scale.indexOf("/");
		String scale1 = scale.substring(0,num).trim();
		String scale2 = scale.substring(num + 1).trim();
		int numerator = Integer.parseInt(scale1); //intializing numerator
		int denominator = Integer.parseInt(scale2);
		
		Fraction fract1 = new Fraction(numerator, denominator);
		System.out.print("Scale up or down (1: up, 0: down): "); //asking to scale up or down
		int x = scan.nextInt();
		
		while(x != 0 && x != 1) //if 1 or 0 not entered, then doesnt work
		{
			System.out.print("Entered number is not 1 or 0, try again. ");
			System.out.print("Scale up or down (1: up, 0: down): ");
			x = scan.nextInt();
		}
		System.out.print("Enter a scale factor: "); // enter a scale factor of any number
		int scaleFract = scan.nextInt();
		fract1.scale(scaleFract, x == 1);
		System.out.println("Scaled fraction is: " + fract1.getNumerator() + "/" + fract1.getDenominator()); //printing new fraction
		
	}
}
