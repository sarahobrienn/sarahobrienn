package Labs_OBrien;

public class Graduatee extends Student 
{
	private String degree;
	private int years;
	private String concentration;
	
	public Graduatee(String inMajor, String inConcentration, int inYears, String inDegree, double inGpa, int inCreditHours) 
	{
		super (inMajor, inGpa, inCreditHours);
		degree = inDegree;
		concentration = inConcentration;
		years = inYears;
	}
	
	
	public int getYears()
	{
		return years;
	}
	
	public String getConcentration()
		{
			return concentration;
		}
	
	public String getDegree()
	{
		return degree;
	}
	}

