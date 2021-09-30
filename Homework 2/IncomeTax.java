package Labs_OBrien;

import java.util.Scanner;

import java.util.Random;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: IncomeTax.java
 * Date: 02/10/2021
 * 
 * This program takes the name and the income of the user's input and then calculates it depending on how high the income is.
 * Then depending on the income, the user could get taxed 1%, 2%, 3%, etc.
 * Finally, the program prints out everyones taxes and who had the highest taxes. 
 * 
 */


public class IncomeTax 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
	    Scanner scan = new Scanner(System.in);
	    double taxable = 0;
	    double taxIncome = 0;
	    int x = 0;
	    //creating variables assigned to 0 to allow for int's to be replaced
	    
	    
	    int numberPeople = rand.nextInt(15) + 1;
	    System.out.println("There will be " + numberPeople + " calculated");
	    //picks a random number of people going to be taxed 
	    	
	    	for(int a = 1; a < numberPeople - 1; a++)
		    	{
	    			System.out.print("Enter this persons income: ");
	    			int total = scan.nextInt();
	    	    	taxable = taxIncome(total);
	    	    	//taxable becomes the income tax times the total value of income
	    	
	    	    	if(taxable > taxIncome)
	    	    		{
	    	    		//assigns x to the person that is numbered
	    	    			taxIncome = taxable;
	    	    			x = a;
	    	    		}	
		    	}
	    	//prints out max person with taxes
	    	System.out.print("Person " + x + " down has the max value of $" + taxIncome);
	}
	
	 public static double taxIncome(int total)
	 {
		 //takes income from each person and calculates taxes on it then adds the extra amount of taxes
	    	if(total < 750)
	    		{
	    			double tax = (total * .01);
	    			System.out.println("The tax due is: $" + tax);
	    		}
	    	else if (total < 2500)
	    		{
	    	    	double tax = (7.5 + (.02 * (total - 750)));
	    	    	System.out.println("The tax due is: $" + tax);
	    		}
	    	else if (total < 5000)
	    		{
	    			double tax = (82.5 + (.04 * (total - 2500)));
	    			System.out.println("The tax due is: $" + tax);
	    		}
	    	else if (total < 8000)
	    		{
	    			double tax = (142.50 + (.05 * (total - 5000)));
	    			System.out.println("The tax due is: $" + tax);
	    		}
	    	else if (total > 8000)
	    		{
	    			double tax = (230.00 + (.06 * (total - 8000)));
	    			System.out.println("The tax due is: $" + tax);
	    		}
	    	//returns total number tax
	    	return total;
	    	}
	}

	


