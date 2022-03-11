
public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Hello java " + i);
				Thread.sleep(2000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
