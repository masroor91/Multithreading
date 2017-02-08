package test;

import thread.MyRunnable;

public class DeprecatedStopDemo {

	public static void main(String[] args) {

		MyRunnable r= new MyRunnable();
		Thread t= new Thread(r);
		
		t.start();
		
		System.out.println("End of main");
	
		t.stop();
	}

}
