
public class PracticeOverloading {
		
	    public int PracticeOverloading(int x, int y)
	    {
	        return (x + y);
	    }
	  
	    // Overloaded sum(). This sum takes three int parameters
	    public int PracticeOverloading(int x, int y, int z)
	    {
	        return (x + y + z);
	    }
	  
	    // Overloaded sum(). This sum takes two double parameters
	    public double PracticeOverloading(double x, double y)
	    {
	        return (x + y);
	    }
	  

	    public static void main(String args[])
	    {
	    	PracticeOverloading s = new PracticeOverloading();
	        System.out.println(s.PracticeOverloading(10, 20));
	        System.out.println(s.PracticeOverloading(10, 20, 30));
	        System.out.println(s.PracticeOverloading(10.5, 20.5));
	    }

	}



