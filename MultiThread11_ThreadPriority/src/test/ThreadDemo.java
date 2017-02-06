package test;

import thread.Mythread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Default main Thread priority "	+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		
		//Thread.currentThread().setPriority(15);
		
		Thread.currentThread().setPriority(7);
		
		System.out.println("Main Thread priority after setting to new Priority "	+ Thread.currentThread().getPriority());
		
		Mythread t = new Mythread();
		
		System.out.println("Child Thread priority "	+ t.getPriority());
		
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	
		
		
	}

}
