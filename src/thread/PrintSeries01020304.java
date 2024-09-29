package thread;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintSeries01020304 {
	public static void main(String[] args) throws InterruptedException {
	    PrintNum printNum =  new PrintNum();

	    Thread zero = new Zero(printNum);
	    zero.start();

	    Thread odd = new Odd(printNum);
	    odd.start();

	    Thread even = new Even(printNum);
	    even.start();
	  }
	}

	class PrintNum{
	  private  int i = 1;
	  private int max = 20;
	  private Boolean stateZero = true;
	  private Boolean stateOdd = false;
	  private Boolean stateEven = false;

	  synchronized void printZero() throws InterruptedException {
	    while (i<max){
	      if (stateZero){
	        System.out.println(0);
	        stateZero = false;
	        if(i % 2 == 0){
	          stateEven = true;
	        }
	        else {
	          stateOdd = true;
	        }
	        
	        notifyAll();
	      }
	      wait();
	    }
	  }

	  synchronized void printOdd() throws InterruptedException {
	    while (i<max){
	      if(stateOdd){
	        System.out.println(i);
	        i++;
	        stateZero = true;
	        
	        notifyAll();
	      }
	      wait();
	    }
	  }

	  synchronized void printEven() throws InterruptedException {
	    while (i<max){
	      if(stateEven){
	        System.out.println(i);
	        i++;
	        stateZero = true;
	        notifyAll();
	      }
	      wait();
	    }
	  }
	}

	class Zero extends Thread{
	  private final PrintNum printNum;
	  Zero(PrintNum printNum){
	    this.printNum = printNum;
	  }

	  @Override
	  public void run() {
	    try {
	      printNum.printZero();
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}


	class Odd  extends Thread{
	  private final PrintNum printNum;
	  Odd(PrintNum printNum){
	    this.printNum = printNum;
	  }

	  @Override
	  public void run() {
	    try {
	      printNum.printOdd();
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}


	class Even  extends Thread{
	  private final PrintNum printNum;
	  Even(PrintNum printNum){
	    this.printNum = printNum;
	  }

	  @Override
	  public void run() {
	    try {
	      printNum.printEven();
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	
}
