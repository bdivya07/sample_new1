package sample;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomictest {
	private static AtomicInteger c=new AtomicInteger(0);
	
	static class D extends Thread
	{
		public void run()
		{
			c.decrementAndGet();
		}
	}
	
	static class A extends Thread
	{
		public void run()
		{
			c.incrementAndGet();
		}
	}
	   public static void main(String[] args)  
	   { 
	     for(int i=0;i<5;i++)
	     {
	    	 new A().start();
	    	 new D().start();
	     }
	     System.out.println(c);
	   } 

}
