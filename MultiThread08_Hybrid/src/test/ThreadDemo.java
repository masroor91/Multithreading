package test;

import thread.Mythread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		Mythread t = new Mythread();
		
		Thread t1= new Thread(t); //r= runnable Target
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	
	}

}
