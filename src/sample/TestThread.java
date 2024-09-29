package sample;

public class TestThread  extends Thread{
	
	private static int x;
	public synchronized void do1()
	{
		int c =x;
		c++;
		x=c;
	}
	
	public void run()
	{
		do1();
	}
	
	public static void main(String[] args) {
		TestThread t= new TestThread();
		t.start();
	}

}
