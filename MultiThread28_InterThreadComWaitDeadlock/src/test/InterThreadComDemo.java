package test;

import thread.MyRunnable;

public class InterThreadComDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyRunnable r= new MyRunnable();
		
		Thread t= new Thread(r);
		
		t.start();
		
		Thread.sleep(10000);
		
		synchronized (t) {
			System.out.println("main thread trying to call wait method");
			
			t.wait();
			
			System.out.println("main thread got notification");
			System.out.println("Main: " + r.getTotal());
		}
		
	}

}
