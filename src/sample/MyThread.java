package sample;

public class MyThread extends Thread{
	
	MyThread()
	{
		
	}
	MyThread(MyRunnable n)
	{
		super(n);
	}
	
	public void run()
	{
		System.out.println("Mythread");
	}

}
