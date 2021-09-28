package lab5_obrien;

import java.util.Scanner;

/*
 * Sarah O'Brien
 * CSC 2720 Lab 5 Pt 1
 * 09/23/2021
 */

public class lab5pt1_obrien 
{
	public static class Main
	{
		public static void main (String[] args)
	    {
			//asking user to input the size of the array
			Scanner scan = new Scanner(System.in);
	        System.out.print("Input size of array (can only be an int): ");
	        
	        //setting the array size as what the user inputs
	        int size = scan.nextInt();
	        int[] array = new int[size];
	        
	        //asking the user to input the array values, sorted
	        System.out.println("Input values in array (can only be an int): ");
	        
	        //if user does not put in an int
	        while(size <= 0)
	        {
	        	System.out.println("Input a number");
	        	Scanner sc = new Scanner(System.in);
	        	size = scan.nextInt();
	        }
	        
	        for (int i = 0; i < array.length; i++)
	        {
	        	//setting the array size as the length
	        	//adding values into array
	            array[i] = scan.nextInt();
	        }
	        
	        //executing function for selection sort
	        selectionSort(array);
	           
	        //{11, 21, 21, 31, 40, 40, 40, 50, 50};
	        int num = array.length;
	         
	        //executing removeDuplicates
	        num = removeDuplicates(array, num);
	    
	        //printing out array removing duplicates
	        System.out.println("^^ Array before removing duplicates");
	        System.out.println("Array after removing duplicates and sorting using selection sort: ");
	        System.out.print("ARRAY[]= [");
	        
	        
	        //prints out brackets and commas if it isnt the end number
	        for (int x = 0; x < num; x++)
	        {
	           System.out.print(array[x]);
	        
	           if(num - 1 != x)
	           {
	        	   System.out.print(",");
	           }
	        }
	        System.out.print("]");
	    }
		

		//function for selection sort
		public static void selectionSort(int[] array) 
		{
		    for (int x = 0; x < array.length; x++) 
		    {
		    	//setting minimum to x
		        int minimum = x;
		        
		        for (int y = x + 1; y < array.length; y++) 
		        {
		        	//if minimum is bigger than array y 
		            if (array[minimum] > array[y]) 
		            {
		            	//minimum then equals y
		                minimum = y;
		            }
		        }

		        //temp array is key
		        int key = array[x];
		        //set key array to array x
		        array[x] = array[minimum];
		        //minimum is then assigned to the temp array
		        array[minimum] = key;
		    }
		}
		
		//function of removing duplicates
	    public static int removeDuplicates(int array[], int num)
	    {
	        if (num == 1 || num == 0)
	        {
	        	//return nums
	            return num;
	        }
	       
	        //setting x to 0
	        int x = 0;
	        for (int y = 0; y < num - 1; y++)
	        {
	        	//if y + 1 doesnt equal the array with the y value
	            if (array[y + 1] != array[y])
	            {
	                array[x++] = array[y];
	            }
	        }
	        //adding x to array subtracting the duplicate
	        array[x++] = array[num - 1];
	      
	        return x;
	    }
	    
	    }
	}

/*
* Time complexity for sort: O(n^2)
* Space complexity for sort: O(1)
* Time complexity for de-duplication: O(n)
* Space complexity for de-duplication: O(1)
* If you input an input that is not a number the program will not work, only asking for ints
* If you input one number, it will printout one number
* This code is more condensed and more effective, and the time complexity is changed from the 
* Selection sort
*/


