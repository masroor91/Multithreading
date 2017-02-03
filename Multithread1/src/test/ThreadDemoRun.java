package test;

import thread.Mythread;

public class ThreadDemoRun {

	public static void main(String[] args) {
		Mythread t= new Mythread();
		
		t.run();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}

}
