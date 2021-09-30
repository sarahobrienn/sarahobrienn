package Labss_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: Ticket.java
 * Date: 04/20/2021
 * 
 * The program is the main program for the Ticket's inheritances.
 * Then, the program uses Advanced, Student Advanced, and Walkup tickets classes to run how much tickets are.
 * Finally, the code uses inheritance and return statements to show which student owes which amount. 
 */

public class Ticket 
{
	//declares the variables
	int number;
    double price;
   
    public Ticket(int number) 
    {
        this.number = number;
    }
   
    public double getPrice() 
    {
        return price;
    }
   
    public String toString() 
    {
    	//printing out the number of the ticket and the price of the ticket
        return "Number " + number + ", price: " + price;
    }
   
    public static void main(String[] args) 
    {
    	//making the different tickets and different prices
    	//student advanced later 
        Ticket studentadv = new StudentAdvanceTicket(1,3);
        //student advanced  
        Ticket studentadvLater = new StudentAdvanceTicket(2,14);
        //advanced ticket
        Ticket advTick = new AdvanceTicket(3,9);
        //walkup ticket
        Ticket walkUp = new WalkupTicket(4);
        //ten days in advanced ticket
        Ticket tenAdv = new AdvanceTicket(0, 10);
        System.out.println("Price of ticket purchased 10 days in advance: "+ tenAdv.getPrice());
        System.out.println(studentadv + " (ID required) (This student bought a ticket 14 days before the event)");
        System.out.println(studentadvLater + " (ID required) (This student bought a ticket 3 days in advanced)");
        System.out.println(advTick + " (This person bought a ticket 9 days in advanced)");
        System.out.println(walkUp + " (This person bought this ticket walking up)");
        //also telling how many days in advanced or walking up
    }
}
