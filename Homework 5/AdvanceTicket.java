package Labss_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: AdvancedTicket.java
 * Date: 04/20/2021
 * 
 * The program extends the Ticket program.
 * Then, the program tells how many days in advanced to determine price.
 * Finally, the code uses if/else statements to determine price. 
 */

public class AdvanceTicket extends Ticket
{
	public AdvanceTicket(int number,int daysInAdvance) 
	{
        super(number);
        //if 9 days or less then price is $30
        if (daysInAdvance <= 9) 
        {
            price = 30;
        } 
        //if price 10 days or after  in advance price is $40
        else 
        {
            price = 40;
        }
    }
}
