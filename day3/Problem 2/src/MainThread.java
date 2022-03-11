
public class MainThread {

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t1 = new Thread(rd);

		t1.start();

	}

}
