package example;

public class MyThread {

	public static void main(String[] args) {
		try {

			int a = 10;
			int b = 0;

			double c = a / b;

			int[] arr = new int[5];
			arr[5] = 22;

			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("I'm always here");
		}

	}

}
