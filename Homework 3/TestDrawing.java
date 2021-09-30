package Labs_OBrien;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

/*
 * Name: Sarah O'Brien
 * Class: Computer Science Principles 2
 * Project: TestDrawing
 * Date: 03/02/2021
 * 
 * The program uses 2d objects and creates an image with circles and squares
 * The program uses drawline, drawrect, etc to make circles within squares however many times they are inputed.
 * Finally, the program uses the x and y coordinates to help create equal and symmetrical drawings of circles in squares. 
 */

public class TestDrawing extends JFrame 
{
	public static void main(String[] args) 
	{
	   TestDrawing picture = new TestDrawing(0,0);
       picture.Display();
	}
	public int newx;//making the integers public of x and y for the whole program
	public int newy;
	
	public TestDrawing(int x, int y)
	{
		//test drawing 
       this.newy = y;
       this.newx = x;
	}
	
   public void Display()
   {
	   //display is showing the panel of circles and squares 
	   TestDrawing panel = new TestDrawing(400 + newx,400 + newy);
	   panel.setBackground(Color.CYAN);
       setVisible(true);
       setLocationByPlatform(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);         
   }
   public void paint(Graphics color)
   {
	   //giving the graphics the colors
       drawSquaresD(color, "ONE", 0, 0, 100, 5, 1, 1); //top left
       drawSquaresD(color, "TWO", 10, 120, 24, 4, 5, 5); //bottom left
       drawSquaresD(color, "THREE", 150, 20, 40, 5, 6, 6); //top right
       drawSquaresD(color, "FOUR", 130, 275, 36, 3, 3, 3); //bottom right
   }
  
   public void drawSquaresD(Graphics color, String p, int x, int y, int size, int n, int r, int c)
   {
       int a;
       int t;
       int e;
       //learned back in hs to use case for graphics, each case of drawingpanel will execute the square to go to a specific place
       switch(p)
       {
           case "BotLef":
               y = getHeight()-(y+(size*r))-newy;
               break;
               
           case "TopRig":
               x = getWidth()-(x+(size*c))-newx;
               break;
               
           case "BotRig":
               x = getWidth()-(x+(size*c))-newx;
               y = getHeight()-(y+(size*r))-newy;
               break;
               
           case "TopLef": 
               break;
       }
       x += newx;
       y += newy;
          
       for(a = 0; a <= r - 1; a++)
       {
           for(t = 1; t <= c-1; t++)
           {
        	   //setting up rows and columns
               color.setColor(Color.GREEN);
               int x1 = (x + (t * size));
               int y1 = (y + (a * size));
               int d = 0;
               color.fillRect(x1, y1, size, size);
             
               for(e = n; e >= 1; e--)
               {
            	   //drawing yellow inside the square
                   int sizec=((size / n) * e);
                   int newc=(((size / 2) / n) * d);
                   color.setColor(Color.YELLOW);
                   color.fillOval((x1 + newc), (y1 + newc), sizec, sizec);
                   color.setColor(Color.BLACK);
                   color.drawOval((x1 + newc), (y1 + newc), sizec, sizec);
                   d++;
               }
               //setting the color of the lines within and around the squares
               color.drawRect(x1, y1, size, size);
               color.setColor(Color.BLACK);

               //draws the lines vertically and horizontally in each tiny square
               color.drawLine((x1 + (c*size)), y1 + ((size/2) + (r*size)), x1 + (c*size) + size, y1 + ((size/2) + (r*size)));
               color.drawLine((x1 + (size/2) + (c*size)), (y1 + (r*size)), x1 + ((c*size)+(size/2)), (y1+(r+1)*size));
               
               //draws all the bigger lines around the photo
               color.drawLine(x1 + size, y1, x1, y1 + size);
               color.drawLine(x1, y1, x1 + size, y1 + size);
               
           }
       }
   }
  
   
}
