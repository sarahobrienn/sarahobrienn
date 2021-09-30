package Labs_OBrien;

public class Lab1_OBrien 
{
	public static void print()
	{
		for (int i = 0; i < 5; i++)
		{
			for (int j = 5; j >= 5-i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		print();
	}
}
