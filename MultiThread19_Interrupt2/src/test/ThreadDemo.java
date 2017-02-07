package test;

import thread.Mythread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Mythread t= new Mythread();
		
		t.start();
		
		t.interrupt();
		
		System.out.println("End of main Thread");
			
	}

}
