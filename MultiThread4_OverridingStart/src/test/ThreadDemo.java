package test;

import thread.Mythread;

public class ThreadDemo {

	public static void main(String[] args) {
		Mythread t= new Mythread();
		
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
