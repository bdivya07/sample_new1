package sample;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	
	public static void main(String[] args) {
		Thread t = new Sample1() {
			public void run()
			{
				System.out.println("Test");
			}
		};
		t.start();
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "a");
		map.get(1);
	}

}

 class Sample1 extends Thread{
	
	Sample1()
	{
		System.out.println("hiiii");
	}
	
	public void run()
	{
		System.out.println("run thread");
	}
	
	public void run(String s)
	{
		System.out.println("String");
	}
	
	public static void main(String[] args) {}

}
