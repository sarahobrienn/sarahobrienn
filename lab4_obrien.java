package lab4_obrien;

import java.util.Scanner;

/*
 * Sarah O'Brien
 * CSC 2720 Lab 4 Pt 1
 * 09/17/2021
 */

public class lab4_obrien 
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
	        //{11, 21, 21, 33, 40, 40, 40, 50, 50};
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
	    public static int removeDuplicates(int array[], int num)
	    {
	    	//if number is seen once or none then returns number
	        if (num == 1 || num == 0)
	        {
	            return num;
	        }
	        
	        
	        int[] temp = new int[num];
	        int x = 0;
	        for (int y = 0; y < num - 1; y++)
	            
	        	//if array number plus one doesnt equal the number then counts it as duplicate
	            if (array[y + 1] != array[y])
	                temp[x++] = array[y];
	        		temp[x++] = array[num - 1]; 
	            
	         //sets temp array to array
	        for (int a = 0; a < x; a++)
	        {
	            array[a] = temp[a];
	        }
	        return x;
	    }
	}
}
/*
* Time complexity: O(n)
* Space complexity: O(n)
* If you input an input that is not a number the program will not work, only asking for ints
* If you input one number, it will printout one number
*/