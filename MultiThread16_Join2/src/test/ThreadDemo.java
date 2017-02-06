package test;

import thread.Mythread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Mythread.mt= Thread.currentThread();
		
		Mythread t= new Mythread();
		
		
		t.start();
			
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
	}

}
