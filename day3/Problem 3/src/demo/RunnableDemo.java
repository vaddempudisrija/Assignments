package demo;

public class RunnableDemo implements Runnable {
	
	@Override
	public void run() {
		try {
		int a=10;
		int b=0;
		
		int[] arr = new int[5];
		arr[5]=7;
		System.out.println(arr[5]);
		
		double c = a / b;
		System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally executes");
		}
		
	}
}
