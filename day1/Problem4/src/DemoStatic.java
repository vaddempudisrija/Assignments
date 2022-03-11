
public class DemoStatic {

	//try with example 1

	  static int id = 20; 
	public static void main(String[] args) 
	 { 
	
		DemoStatic s = new DemoStatic();  
	     int x = s.id; 
	    System.out.println(x);  
	    System.out.println(DemoStatic.id); 
	  } 
//	
//	  static int x = 0; // It will get memory only once and retain its value. 
//	  DemoStatic() 
//	  { 
//	     x++; // It will increment the static variable by 1 for each object creation. 
//	  } 
//	void display() 
//	{ 
//	   System.out.println(x); 
//	} 
//	public static void main(String[] args) 
//	{ 
//		DemoStatic c1 = new DemoStatic(); 
//	     c1.display(); 
//	     DemoStatic c2 = new DemoStatic(); 
//	     c2.display(); 
//	     DemoStatic c3 = new DemoStatic(); 
//	     c3.display(); 
//	  } 
	}
	
	
	
	
