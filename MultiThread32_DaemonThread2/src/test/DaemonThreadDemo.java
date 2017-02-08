package test;

import thread.MyRunnable;

public class DaemonThreadDemo {

	public static void main(String[] args) {

		MyRunnable r= new MyRunnable();
		Thread t= new Thread(r);
		
		t.setDaemon(true);
		
		t.start();
		
		System.out.println("End of main");
	}
}
