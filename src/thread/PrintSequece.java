package thread;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintSequece {
	
	

	public static void main(String args[]) throws InterruptedException {
		PrintSequece t = new PrintSequece();
		final AtomicInteger sharedOutput = new AtomicInteger(0);
		My t1 = new My(0,sharedOutput);
		My t2 = new My(1,sharedOutput);
		My t3 = new My(2,sharedOutput);

		Thread ts1 = new Thread(t1);
		Thread ts2 = new Thread(t2);
		Thread ts3 = new Thread(t3);
		ts1.setName("Thread1");
		ts2.setName("Thread2");
		ts3.setName("Thread3");
		ts1.start();
		ts2.start();
		ts3.start();

	}
}
 class My implements Runnable {
	 private Object object = new Object();
		private final int threadPosition;
		AtomicInteger sharedOutput;
		public My(int threadPosition,AtomicInteger sharedOutput) {
			super();
			this.threadPosition = threadPosition;
			this.sharedOutput=sharedOutput;
		}

		@Override
		public void run() {
			while (sharedOutput.get() < 9) {

				synchronized (object) {

					if (sharedOutput.get() % 3 == this.threadPosition) {

						if (sharedOutput.get() < 9)
							System.out.println(Thread.currentThread() + "  " + sharedOutput.incrementAndGet());
					}
				}
			}
		}
	

}
