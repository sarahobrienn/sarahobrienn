package Labs_OBrien;

public class Exchange 
{
	private String country;
	private String year;
	private String major;
	private double gpa;
	
	
	public Exchange(String inMajor, double inGpa, String inCountry, String inYears)
	{
		major = inMajor;
		gpa = inGpa;
		country = inCountry;
		year = inYears;
		
	}

	public String getYear()
	{
	    return year;
	}
	
	public String getCountry()
	{
	    return country;
	}

	public double getGPA() 
	{
		return gpa;
	}
	
	public String getMajor()
	{
		return major;
	}
	}

