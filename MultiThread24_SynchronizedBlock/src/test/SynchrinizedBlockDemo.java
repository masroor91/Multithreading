package test;

import thread.Display;
import thread.MyRunnable;

public class SynchrinizedBlockDemo {

	public static void main(String[] args) {
		
		Display d = new Display();
		
		MyRunnable r1= new MyRunnable(d, "Yuvraj");
		MyRunnable r2= new MyRunnable(d, "Dhoni");
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r2);
		
		t1.start();
		t2.start();
		
	}
	
}
