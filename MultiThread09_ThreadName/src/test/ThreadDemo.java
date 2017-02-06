package test;

import thread.Mythread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Mythread t = new Mythread();
		
		Thread t1= new Thread(t); //r= runnable Target
		
		System.out.println(t1.getName());
		
		Thread.currentThread().setName("AK");
		
		System.out.println(Thread.currentThread().getName());
		
		t1.setName("SRK");
		
		System.out.println(t1.getName());
		
		t1.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	
		System.out.println(10/0);
	}

}
