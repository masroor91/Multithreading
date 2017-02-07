package test;

import thread.MyRunnable;

public class InterThreadComDemo {

	public static void main(String[] args) {
		
		MyRunnable r= new MyRunnable();
		
		Thread t= new Thread(r);
		
		t.start();
		
		try {
			t.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main: " + r.getTotal());
		
	}

}
