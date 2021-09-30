package Labs_OBrien;

public class Undergraduate extends Student

{	
	private boolean honors;
	
	public boolean isHonors()
	{
		return honors;
	}
	
	public Undergraduate(String inMajor, double inGpa, int creditHours) 
	{
		super(inMajor, inGpa, creditHours);
		this.honors = honors;
	}

	
}
