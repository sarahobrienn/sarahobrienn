package lab2pt1_obrien;

/*
 * Sarah O'Brien 
 * CSC 2720 Lab 2 Part 1
 * 09/02/2021
 */

public class lab2pt1_obrien 
{
	public static void main(String[] args) 
	{       
		//array list
        int [] arr = new int [] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};     
        
        System.out.println("This is an array given below: ");    
        System.out.print("[");
        
        for (int x = 0; x <= arr.length-1; x++) 
        {    
        	//prints out each array number
            System.out.print(arr[x] + " ");    
        }    
          
        //prints out last bracket 
        System.out.println("]");
        
        //for loop taking each number and sorting them 
        for (int i = 1; i <= arr.length-1; i++) 
        {
            if (arr[i] < arr[i - 1]) 
            {
            	arr[i] = arr[i] + arr[i - 1];
            	arr[i - 1] = arr[i] - arr[i - 1];
            	arr[i] = arr[i] - arr[i - 1];
            	i = 0;
            }
         }
        //printing out the rearranged array
        System.out.println("Write a Java Program that re-arranges this given array exactly as shown below: ");    
        System.out.print("[");
        
        for (int x = 0; x <= arr.length-1; x++) 
        {     
        	//printed out array list in ascending order
            System.out.print(arr[x] + " ");    
        } 
        //printing out last bracket
        System.out.println("]");
    }   
	
}
