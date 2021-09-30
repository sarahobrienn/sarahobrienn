package Labss_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: Fraction.java
 * Date: 03/29/2021
 * 
 * This program executes the Fraction code from the FractionScale code.
 * Then determines the fraction depending on if the user scales up or down.
 * Finally, the program prints out the final fraction.  
 * 
 */

public class Fraction
{
	private int numerator;
	private int denominator; //setting numerator and denominator to private int's
	
	public Fraction(int num, int denom)
	{
		numerator = num; //setting numerator to num
		denominator = denom; //setting denominator to denom
	}
	
	public int getDenominator()
	{
		return denominator; //returning denominator
	}
	
	public int getNumerator()
	{
		return numerator; //returning numerator
	}
	
	public Fraction add(Fraction f)
	{
		int denom = (denominator + f.denominator); //denominator for add
		int num = (numerator * f.denominator) + (f.denominator * denominator); //numerator for add
		return new Fraction(num,denom);
	}

	public Fraction divide(Fraction f)
	{
		int denom = (denominator * f.numerator); //denominator for divide
		int num = (numerator * f.denominator); //numerator for divide
		return new Fraction(num,denom);
	}
	
	public Fraction() //sets fraction to 0 and 1 
	{
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction (int num) //sets fraction to num and 1
	{
		numerator = num;
		denominator = 1;
	}
	
	public void scaledown(int factor) //scale down if enter 0
	{
		checkFactor(factor);
		denominator = (denominator * factor);
	}
	
	public void scaleup(int factor) //scale up if enter 1
	{
		numerator *= factor;
	}
	
	public void checkFactor(int factor)
	{
		if(factor == 0)
		{
			System.out.println("Warning, Scale factor can't be 0 for scale down.");
			System.exit(0);
		}
	}
	
	public void scale(int factor, boolean flag)
	{
		if(flag) 
		{
			scaleup(factor);
		}
		else
		{
			scaledown(factor);
		}
	}
	
	
}
