package Labs_OBrien;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: ChrisTree
 * Date: 02/02/2021
 * 
 * The program creates a christmas tree with the preset section number and height number.
 * Then, the program has methods of createTop and createBottom to make the top and bottom halves of the tree.
 * Finally, the code consists of for loops to use the height and sections given to create each part of the tree to make it corresponding. 
 */

public class ChrisTree 
	{
		public static void main(String[] args)
			{
			//preset height and sections for tree
				int section = 5;
				int height = 4;
				
			//calling the top and bottom of the christmas tree
				createTop(section, height);
				createBottom(section, height);
			}	
		
		public static void createTop(int section, int height)
			{
				//prints out top half of tree
				int updateSection = (2 * section - 3);
				int updateHeight = (2 * height);
				int stars = updateSection + updateHeight;
				
				for(int j = 1; j < section; j++)
					{
						for(int k = 1; k <= height; k++)
							{
								String stars2 = "";
								
								int starLength = (2 * k + 2 * j - 3);
								for (int l = 0; l < starLength; l++)
									{
										stars2 = (stars2 + "*");
									}
								
							int starHeight = stars - (height + k + j);
							for (int m = 0; m <= starHeight; m++)
								{
									stars2 = (" " + stars2);
								}
								System.out.println(stars2);
				
							}
					}
			}
		
		public static void createBottom(int section, int height)
			{	
			//prints out bottom half of tree and base of tree
			int baseHeight = (2 * height);
			for(int a = 1; a <= baseHeight; a++)
				{
					System.out.print("\s");
				}
				System.out.print("\s*");
				System.out.println("");
			for(int a = 0; a <= baseHeight; a++)
				{
					System.out.print("\s");
				}
				System.out.print("*");
				System.out.println("");
			for(int a = 0; a <= height; a++)
				{
					System.out.print("\s");
				}
			for (int a = 0; a <= baseHeight; a++)
				{
					System.out.print("*");
				}
			}
		}
	

