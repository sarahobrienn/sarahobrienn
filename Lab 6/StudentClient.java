package Labs_OBrien;

public class StudentClient 
{
	public static void main(String[] args)
	{
		Undergraduate Alex = new Undergraduate("CS",3.9,54);
        System.out.println("Alex ");
        System.out.println("Major: " + Alex.getMajor());   
        System.out.println("GPA: " + Alex.getGPA());  
        System.out.println("Year: " + Alex.getYear());
        
        if (Alex.isHonors())
        {
           System.out.println("Honors student: FALSE");
        }
        else
        {
           System.out.println("Honors student: TRUE");
        }
        
        Graduatee Mary = new Graduatee("Masters", "Data Science", 1, "Computer Science", 3.91, 0);
        System.out.println("\nMary ");
       
        System.out.println("Major: " + Mary.getDegree());   
        System.out.println("Concentartion: " + Mary.getConcentration());  
        System.out.println("Years spent in graduate school: " + Mary.getYears());

        
        Exchange YingShu = new Exchange("Computer Science",4.10,"Tiawan","Fall 2020");
        System.out.println("\nYingShu ");
       
        System.out.println("Major: " + YingShu.getMajor());   
        System.out.println("GPA: " + YingShu.getGPA());  
        System.out.println("Country: " + YingShu.getCountry());
       
	}

}
