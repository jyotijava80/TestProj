package Thread;

public class ThreadDemo1 extends Thread {
	private Thread t;
	private String threadName;

	public ThreadDemo1(String threadName) {
		super();

		this.threadName = threadName;

		System.out.println("creating thread-->" + threadName);
	}

	public void run() {

		int j = 0;
		int k = 0;

		if (threadName.equals("Thread-1")) {
			// System.out.println(threadName);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>" + threadName);

			for (j = 0; j < 50; j++) {
				System.out.println(threadName + "----inside 1st " + j);

			}

		}

		if (threadName.equals("Thread-2")) {
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>" + threadName);

			for (k = 50; k < 100; k++) {
				System.out.println(threadName + "----inside 2nd " + k);

			}

		}

		// System.out.println("Thread " + threadName + " exiting.");

	}

	/*
	 * public void start(){
	 * 
	 * System.out.println("Starting-->"+threadName); if (t == null) { t = new
	 * Thread (this, threadName); // t.start (); } }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo1 R1 = new ThreadDemo1("Thread-1");
		R1.start();

		try {
			R1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadDemo1 R2 = new ThreadDemo1("Thread-2");
		R2.start();

	}

}
