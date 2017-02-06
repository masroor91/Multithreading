package thread;

public class Mythread extends Thread {
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}	
		
		System.out.println("This line is executed by thread " + Thread.currentThread().getName());
		
	}

}
