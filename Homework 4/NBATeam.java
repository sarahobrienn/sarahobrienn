package Labss_OBrien;

import java.util.*;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: NBATeam.java
 * Date: 03/29/2021
 * 
 * This program executes the NBA code, and determines who wins the game.
 * Then determines on how many wins and losses each team gets.
 * Finally, the program prints out the winning team.  
 * 
 */

public class NBATeam 
{
    private String sTeamName;
    private int nWin;
    private int nLoss;
    
    private String [] playerArray = new String[1];
    
    //start of my code
    private String [] str = new String[1];
    private int counts = 0;

  
    public NBATeam(String name) 
    {
        sTeamName = name; //creating sTeamName as a name for the team such as Spurs or Heat
    }
  
    public String teamName()
    {
        return sTeamName; //returning sTeamName
    }
    
    public void addAPlayer(String playerName)
    {
    	counts++;
        if(counts == 1) //for the first player, the count starts for each name
        {
        	playerArray [counts-1] = playerName;
        
        	for(int i = 0; i <= playerArray.length - 1; i++) 
        	{
        		str[i] = playerArray[i]; //start the array of names
        	}
        } 
        else 
        {
        	playerArray = new String[counts];
        	
        	for(int i = 0; i <= str.length - 1; i++) 
        	{
        		playerArray[i] = str[i];
        	}
        	
        	playerArray[counts-1] = playerName;
        	str = new String[counts];
        	
        	for(int i = 0; i <= playerArray.length - 1; i++) 
        	{
        		str[i] = playerArray[i]; //setting up the player array
        	}
        } 
    }
  
    public void win()
    {
        nWin++; //count the amount of wins
    }
  
    public int winNumber() 
    {
        return nWin; //returns amount of wins
    }
  
    public void lose()
    {
        nLoss++; //counts the amount of losses
    }
  
    public String toString() 
    {
       return sTeamName +" "+ Arrays.toString(str) + " win #: " + nWin + " los : " + nLoss; //returns the array of names for the teams, and how many losses and wins
    }
    
    //end of my code
}