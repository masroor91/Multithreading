package test;

import thread.Display;
import thread.MyRunnable;

public class SynchrinizedBlockDemo {

	public static void main(String[] args) {
		
		Display d1 = new Display();
		Display d2 = new Display();
		
		MyRunnable r1= new MyRunnable(d1, "Yuvraj");
		MyRunnable r2= new MyRunnable(d2, "Dhoni");
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();
		t2.start();
		
	}
	
}
