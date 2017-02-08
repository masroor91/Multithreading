package test;

import thread.MyThread;

public class DeadLockDemo {

	public static void main(String[] args) {

		MyThread t= new MyThread();
		
		t.m1();
	}

}
