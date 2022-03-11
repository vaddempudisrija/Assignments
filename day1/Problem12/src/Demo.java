import java.util.Scanner;

public class Demo {
	
	public static int getCityByCode(int val) {
		int code = 1;
	
	switch(val)
	{
	case 1: System.out.println("DELHI");
		break;
		
	case 2: System.out.println("NOIDA");
		break;
		
	case 3: System.out.println("GUARGAON");
	break;
	
	case 4: System.out.println("BANGLORE");
		break;
		
	default: System.out.println("Invalid choice..");
		break;
	}
	return code;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city code from 1 to 4");
		int result = sc.nextInt();
		int returnCodeVal = Demo.getCityByCode(result); 
		
	}
}
	

