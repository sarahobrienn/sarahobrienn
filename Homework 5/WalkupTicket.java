package Labss_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: WalkupTicket.java
 * Date: 04/20/2021
 * 
 * The program assists the Ticket program.
 * Then, the program super of the number of ticket, and assigns the price to 50.
 * Finally, the code assigns a walkup ticket to $50. 
 */

public class WalkupTicket extends Ticket
{
	public WalkupTicket(int number) 
	{
		//if someone walks up, the ticket will be $50
        super(number);
        price = 50;
    }
}
