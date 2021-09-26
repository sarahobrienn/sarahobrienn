package lab2pt1_obrien;

/*
 * Sarah O'Brien 
 * CSC 2720 Lab 2 Part 2
 * 09/02/2021
 */
   
public class lab2pt2_obrien
{ 
	public int sum(int[] arr, int n)
    {
        int i = n;
        //if the array number is less or equal to 8
        if (arr[i] <= 8) 
        {
        	//returns the array plus 1
            return arr[i] = arr[i] + 1;
        }
           
        arr[i] = 0;
        i--;
        
        //returns the sum of the new array
        return sum(arr, i);
    }
    public static void main(String[] args)
    {
    	//setting a new object (had to use class name to set it)
        lab2pt2_obrien obj = new lab2pt2_obrien();
          
        //three spaces in the array
        int num = 3;
        int arr[] = {1, 9, 8, 9};
        //numbers of the array
        
        //setting the array sum 
        obj.sum(arr, num);
        
        //setting the 0 index to a number, if its greater than 0, then prints out the
        //other numbers
        if (arr[0] > 0)
        {
        	
            System.out.print(arr[0] + "");
        }
        
        // a for loop that prints out the array finally
        for (int i = 1; i <= num; i++) 
        {
            System.out.print(arr[i]);
   
            if (i < num)
            {
                System.out.print("");
            }
        }
    }
    
   
}
