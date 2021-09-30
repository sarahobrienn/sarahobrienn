package Labs_OBrien;

import java.util.Scanner;

// Sarah O'Brien
// LAB 4
// CSC 1302
// 02/09/21

public class lab4_obrien 
	{
		public static void main(String[] args)
			{
				Scanner scan = new Scanner (System.in);
				System.out.println("How many elements: ");
				int length = scan.nextInt();
				int arr[] = new int[length];
				System.out.println("Enter the numbers: ");

				for (int i = 0; i <= arr.length-1; i++)
					{
						arr[i]= scan.nextInt();
					}
				System.out.println("Minimum Gap is: " + minGap(arr));
			}

	public static int minGap(int[] array)
		{
			int min = 100;
			int difference = 0;
		
			if(array.length <= 1)
				{
					return (0);
				}
			else
				{   
				for (int i = 0; i < array.length-1; i++)
					{
						difference = array[i]-array[i+1];
					
						if(difference <= 0)
							{
								difference = (difference * -1);
							}
						if(difference < min) 
							{
								min = difference;
							}
					}
					return (min);
				}   
		}
}