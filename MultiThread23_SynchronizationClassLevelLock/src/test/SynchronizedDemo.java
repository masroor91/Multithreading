package test;

import thread.Display;
import thread.MyRunnable1;
import thread.MyRunnable2;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d = new Display();
		
		MyRunnable1 r1= new MyRunnable1(d);
		MyRunnable2 r2= new MyRunnable2(d);
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();
		t2.start();
		
		
	}

}
