package sample;

public class MyRunnableTest {
	public static void main(String[] args) {
		MyThread t= new MyThread();
		t.start();
		new MyThread(new MyRunnable()).start();
	}

}
