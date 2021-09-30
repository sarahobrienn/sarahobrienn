package Labss_OBrien;

import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: Bank.java
 * Date: 04/20/2021
 * 
 * The program asks for the users amount of accounts to generate, then pulls up their bank account ID.
 * Then, the program pulls up the lowest and highest student accounts and displays their id and bank account.
 * Finally, the code consists of random object to determine a high and low account and arrays to get a substring of account ID's. 
 */

public class Bank 
{
 public static void main(String[] args) 
 {   
	 //code uses a scanner object to ask the user for the amount of accounts to generate
	 Scanner scan = new Scanner(System.in);
	 //uses a random to find the highest and lowest account  
     Random rand = new Random();
     double balance = 0;
   
     //asks user for number from 0-1000
     System.out.print("Enter the number of accounts to generate: ");
     int numOfAccount= scan.nextInt();
   
     //if user inputs a number over 1000
     if (numOfAccount >= 1001) 
     {
         System.out.println("Number of account should be less than 1000");
     }

     PaypalAccount[] payPalAccObject = new PaypalAccount[numOfAccount];

     //creates balance for user ID
     for (int x = 0; x < numOfAccount; x++) 
     {
         balance = rand.nextDouble() * 1000.0;
         payPalAccObject[x] = new PaypalAccount(x, balance);        
     }

     //campus ID
     String GSUcampusID = "141-88-2014";
     System.out.print("My Pather ID is " + GSUcampusID);
     System.out.println();
   
     //takes first three numbers of account for accountID
     int pantherAcc = Integer.parseInt(GSUcampusID.substring(0, 3));
     int lowestPos = 0;
     int highPos = 0;
     double total = 0;
     double largestBal = payPalAccObject[0].balance;
     double lowBal = payPalAccObject[0].balance;
     
   
     for (int x = 0; x <= numOfAccount - 1; x++) 
     {
        if (payPalAccObject[x].accountID == pantherAcc)
        {
          x = numOfAccount + 1;
          System.out.printf("My bank account ID is " + pantherAcc + " and balance is: $" + "%.1f", payPalAccObject[numOfAccount - 1].balance);
          System.out.println();
         }
     }
        
     boolean accFound = false;

     //if account not found
     if (!accFound) 
     {
         payPalAccObject[numOfAccount - 1].accountID = pantherAcc;
         payPalAccObject[numOfAccount - 1].balance = Double.parseDouble(GSUcampusID.substring(4, 6) + GSUcampusID.substring(8, GSUcampusID.length())) / 100.00;
         System.out.printf("My bank account ID is " + pantherAcc+ " and balance is: $" + "%.1f", payPalAccObject[numOfAccount - 1].balance);
         System.out.println();
     }

     for (int x = 0; x <= numOfAccount - 1; x++) 
     {
    	 //creates highest balance and account
         if (payPalAccObject[x].balance > largestBal) 
         {
             largestBal = payPalAccObject[x].balance;
             highPos = x;
         }
         //creates lowest balance and account
         if (payPalAccObject[x].balance < lowBal) 
         {
             lowBal = payPalAccObject[x].balance;
             lowestPos = x;
         }
         total = total + payPalAccObject[x].balance;
     }
   
     //prints out average balance
     double average;
     System.out.print("The average balance is: $");
     average = (total / numOfAccount);
     System.out.printf("%.1f", average);
     System.out.println();
     //prints out account with largest balance
     System.out.printf("The account with the largest balance: accountID = " + payPalAccObject[highPos].accountID + ", balance = %.1f",payPalAccObject[highPos].balance);
     System.out.println();
     //prints out account with lowest balance
     System.out.printf("The account with the lowest balance: accountID = " + payPalAccObject[lowestPos].accountID + ", balance = %.1f",payPalAccObject[lowestPos].balance);
     System.out.println();
 }

}