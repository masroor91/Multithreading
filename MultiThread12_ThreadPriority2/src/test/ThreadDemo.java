package test;

import thread.Mythread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Default main Thread priority "	+ Thread.currentThread().getPriority());
		
		Mythread t = new Mythread();
		
		t.setPriority(10);
		
		System.out.println("Child Thread priority "	+ t.getPriority());
		
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}	
		
	}

}
	