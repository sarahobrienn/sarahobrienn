package Labs_OBrien;

public class Rectangle implements Comparable <Rectangle>
{
	private Point topCorner;
	private int width;
    private int height;


    public Rectangle(int width, int height, Point topCorner, int random) 
    {
        this.width = width;
        this.height = height;
        this.topCorner = topCorner;
    }
    public int getWidth() 
    {
        return width;
    }
    public void setWidth(int width) 
    {
        this.width = width;
    }

    public int getHeight() 
    {
        return height;
    }
    public void setHeight(int height) 
    {
    	this.height = height;
    }
    public Point getTopCorner() 
    {
    	return topCorner;
    }
    public void setTopCorner(Point topCorner) 
    {
    	this.topCorner = topCorner;
    }
    public String toString() 
    {
    	return "Width: " + width + "     " + "Height: " + height + "     " + topCorner;
    }
    public int compareTo(Rectangle other) 
    {
    	if (height != other.height) 
    	{
    		return height - other.height;
    	} 
    	else 
    	{
    	if (width != other.width) 
    	{
    		return width - other.width;
    	} 
    	else 
    	{
    		return topCorner.compareTo(other.topCorner);
    	}
      }
    }
   }


