package thread;

public class Mythread extends Thread {
	
	@Override
	public synchronized void start() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Start Method");
		}
		
		super.start();
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
		
	}

}
