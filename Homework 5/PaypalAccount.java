package Labss_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: PaypalAccount.java
 * Date: 04/20/2021
 * 
 * The program assists the Bank program.
 * Then, the program uses balance and accountId as instance variables.
 * Finally, the code gives each instance variable a unique ID. 
 */

public class PaypalAccount 
{
	   //declaring variables
	   double balance;
	   int accountID ;

	   public PaypalAccount() 
	   {
	       super();
	   }
	   public PaypalAccount(int inAccountID, double inBalance) 
	   {
	       super();
	       this.accountID = inAccountID;
	       this.balance = inBalance;
	   }
}
