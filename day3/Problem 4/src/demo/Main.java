package demo;

public class Main {

	public static void main(String[] args) {
		ExampleJoin t1 = new ExampleJoin();
		ExampleJoin t2 = new ExampleJoin();
		ExampleJoin t3 = new ExampleJoin();

		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
