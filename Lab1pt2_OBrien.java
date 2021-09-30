package Labs_OBrien;

import java.util.Scanner;

public class Lab1pt2_OBrien 
	{
	
	public static void main(String[] args)
		{
			System.out.print("Enter the number for array size: ");
			Scanner scan = new Scanner(System.in);
			int y = scan.nextInt();
			int[]o = new int[y];
			
			for (int x = 0; x < o.length; x++)
			{
				System.out.println("Type number " + (x + 1) + " : ");
				o[x] = scan.nextInt();
			}
			
			boolean sort = isSorted(o);
			System.out.println("This value is sorted: " + sort);
			
		}

	public static boolean isSorted (int[] arr)
			{
			boolean sort = true;
		
				for (int i = 0; i < arr.length-1; i++)
				{
					if(arr[i]<arr[i+1])
					{
						sort = true;
					}
					if(arr[i]>arr[i+1])
					{
						sort = false;
					}
					i++;
				}
				return sort;
			}
		}
