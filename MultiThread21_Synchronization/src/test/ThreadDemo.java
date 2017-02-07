package test;

import thread.Display;
import thread.MyThread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Display d= new Display();
		Display d2= new Display();
		MyThread t1= new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d2, "Yuvraj");
		
		t1.start();
		t2.start();
		
	}

}
