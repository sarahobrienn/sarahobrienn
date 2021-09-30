package Labs_OBrien;

public class Student 
{
	private String major;
	private double gpa;
	private int creditHours;
	
	
	public Student(String inMajor, double inGpa, int inCreditHours)
	{
		major = inMajor;
		gpa = inGpa;
		creditHours = inCreditHours;
	}

	public String getMajor()
	{
		return major;
	}
	
	public double getGPA()
	{
		return gpa;
	}
	
	public int getCreditHours()
	{
		return creditHours;
	}

	public String getYear()
	{
		if (creditHours < 32)
			{
				return "freshman";
			}
		else if (creditHours >= 32 && creditHours < 64)
			{
				return "sophomore";
			}
		else if (creditHours >= 64 && creditHours < 96)
			{
	          return "junior";
			}
		else  
			{
			  return "senior";
			}
	}
}
