package lab4_obrien;

import java.util.Scanner;

/*
 * Sarah O'Brien
 * CSC 2720 Lab 4 Pt 2
 * 09/17/2021
 */

public class lab4pt2_obrien 
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
	        System.out.println("Input values in array sorted (can only be an int): ");
	        
	        for (int i = 0; i < array.length; i++)
	        {
	        	//setting the array size as the length
	        	//adding values into array
	            array[i] = scan.nextInt();
	        }
	        //{11, 21, 21, 31, 40, 40, 40, 50, 50};
	        int num = array.length;
	         
	        //executing removeDuplicates
	        num = removeDuplicates(array, num);
	  
	        //printing out array removing duplicates
	        System.out.println("^^ Array before removing duplicates");
	        System.out.println("Array after removing duplicates: ");
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
		
		//function of removing duplicates
	    static int removeDuplicates(int array[], int num)
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
* Time complexity: O(n)
* Space complexity: O(1)
* If you input an input that is not a number the program will not work, only asking for ints
* If you input one number, it will printout one number
* This code is more condensed and more effective
*/
