package Labss_OBrien;

public class Circle 
{
	 private int radius;
	 public Point center;
	   
	   public Circle(Point center, int radius) 
	   { 
	       this.radius = radius;
	       this.center = center;
	   }
	  
	   public int getRadius() 
	   {
	       return radius;
	   }
	   
	   public Point getCenter() 
	   {
	       return center;
	   }
	   
	   public String toString() 
	   {
	       return "Circle[center=(" + center + "), radius=" + radius + "]";
	   }
	  
	   public boolean contains(Point p) 
	   {
	       if(Point.distance(center, p) <= radius)
	       {
	           return true;
	       }
	       else
	       {
	           return false;
	       }
	   }
}
