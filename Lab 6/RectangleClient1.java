package Labs_OBrien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class RectangleClient1 
{
	public static void main(String[] s)
	{
		List<Rectangle> newList = new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <= 9; i++) 
        {
            int width = random.nextInt(100);
            int height = random.nextInt(100);
            newList.add(new Rectangle(width, height, new Point(random.nextInt(width), random.nextInt(height)), height));
        }
        System.out.println("Unsorted list: ");
        for (Rectangle other : newList) 
        {
            System.out.println(other);
        }

        System.out.println("Sorted list: ");
        Collections.sort(newList);
        for (Rectangle other : newList)
        {
            System.out.println(other);
        }

    }
}

