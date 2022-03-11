package demo;

public class ExampleJoin extends Thread {

	public void run() {
		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("Hello Join " + i);
		}
	}
}
