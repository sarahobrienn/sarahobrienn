package Labss_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: StudentAdvancesTicket.java
 * Date: 04/20/2021
 * 
 * The program extends the AdvanceTicket program.
 * Then, the program takes the amount of days in advanced to determine price.
 * Finally, the code assigns price based on the days in advanced. 
 */

public class StudentAdvanceTicket extends AdvanceTicket
{
	public StudentAdvanceTicket(int number, int daysInAdvance) 
	{
		//if student comes early, tickets are $15 which is half of advanced ticket price depending on how early
        super(number, daysInAdvance);
        price = price / 2;
    }
}
