package Labss_OBrien;

import java.util.*;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: NBA.java
 * Date: 03/29/2021
 * 
 * This program takes the names of different Spurs and Heat players.
 * Then depending which team wins, the program randomly picks the team that wins the series.
 * Finally, the program prints out the specific team that wins the series, either the Heat or Spurs.
 * 
 */

public class NBA 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String ifAddPlayer;
        String playerName;
        
        //construct Team Heat
        System.out.println("Creat the NBA team of Heats...... ");
        NBATeam heat = new NBATeam("Heat");
        System.out.print("Add a play to Heats? (yes/no): ");
        ifAddPlayer = input.next();

        while (ifAddPlayer.equalsIgnoreCase("yes")) 
        {
            System.out.print("What is the name to be added? ");
            playerName = input.next();
            heat.addAPlayer(playerName);
            
            System.out.print("Add one more play to heats? (yes/no) : ");
            ifAddPlayer = input.next();
        }

        //construct team spurs
        
        //start of my code
        System.out.println("Creat the NBA team of Spurs...... ");
        NBATeam spursName = new NBATeam("Spurs");
        System.out.print("Add a play to Spurs? (yes/no): "); //asking to add player
        ifAddPlayer = input.next();

        while (ifAddPlayer.equalsIgnoreCase("yes")) 
        {
            System.out.print("What is the name to be added?: "); //asks name to add for Spurs if yes
            playerName = input.next();
            spursName.addAPlayer(playerName);
            System.out.print("Add one more play to Spurs? (yes/no) : "); //asking to add more players if yes
            ifAddPlayer = input.next();
        }

        System.out.println(" Game on now ...");

         for (int i = 0; i <= 6; i++) 
         {
            double x = Math.random(); //randomly choosing who wins games
            
            if (x > 0.5) 
            {
                heat.win();
                spursName.lose();
            } 
            else 
            {
                heat.lose();
                spursName.win(); ///if team wins 4 games, then they win the series
            }
         }
         
         if (heat.winNumber() > spursName.winNumber() || spursName.winNumber() > heat.winNumber()) 
         {
            if (heat.winNumber() > spursName.winNumber()) 
            {
                System.out.println(heat.teamName() + " ***WIN the series***");
            } 
            else 
            {
                System.out.println(spursName.teamName() + " ***WIN the series***");
            }
        }
        //end of my code
        
        System.out.println(heat.toString());
        System.out.println(spursName.toString());
    }
}
