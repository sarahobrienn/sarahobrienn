package Labss_OBrien;

public class Square 
{
	   int x;
	   int y;
	   int sideLength;
	  
	   public Square(int x,int y)
	   {
	       this.x = x;
	       this.y = y;
	       this.sideLength = 5;
	   }
	  
	   public Square(int length)
	   {
	       this.x = 0;
	       this.y = 0;
	       this.sideLength = length;
	   }
	  
	   public Square()
	   {
	       this.x = 0;
	       this.y = 0;
	       this.sideLength = 0;
	   }
	}


