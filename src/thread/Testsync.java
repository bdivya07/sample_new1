package thread;

public class Testsync {
	public static void main(String[] args) {
		MyThread1 t1 =new MyThread1();
		t1.setName("t1");
		MyThread1 t2 =new MyThread1();
		t2.setName("t2");
		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	Object obj = new Object();

	public void run() {
		synchronized (obj) {
			if(Thread.currentThread().getName().equals("t1"))
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
				System.out.println(Thread.currentThread().getName());

		}
	}
}
