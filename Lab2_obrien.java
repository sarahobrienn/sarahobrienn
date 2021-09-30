package Labs_OBrien;

import java.util.Scanner;

public class Lab2_obrien 
	{
		public static void main (String[] args)
			{	
				Scanner scan = new Scanner(System.in);
				int arr[] = new int[10];
				for (int i = 0; i < arr.length; i++) 
					{
					System.out.println("Enter a number: ");
					arr[i] = scan.nextInt();	
					}
			
					System.out.print("Here the array in reverse: ");
					printReverse(arr);
			
					System.out.print("The highest valued element: ");
					System.out.println(getLargest(arr));
			
					System.out.print("The array with two times each element: ");
					int[] doubled = computeTwice(arr);
					System.out.print("[");
					for (int i = 0; i < doubled.length; i++)
						{
							System.out.print(doubled[i] + ",");
						}
							System.out.print(doubled[9]);
							System.out.print("]");
			
			
	}
		
		public static void printReverse(int[] inArray)
		{
			for(int i = inArray.length - 1; i >=1; i--)
				{
					System.out.print(inArray[i] + " , ");
				}
					System.out.print(inArray[0]);
					System.out.println(" ");
				}
		
		public static int getLargest(int[] inArray)
		{
			int maximum = inArray[0];
			for (int i = 0; i <= 9; i++)
			{
				if(maximum < inArray[i])
				{
					maximum = inArray[i];

				}
			}
			return maximum;
		}
		
		public static int[] computeTwice(int[] inArray)
		{
			for (int i = inArray.length - 1; i >= 0; i--)
			{
				inArray[i] = inArray[i] * 2;
			}
			return inArray;
		}
		
		
}
