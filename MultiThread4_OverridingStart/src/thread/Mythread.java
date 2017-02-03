package thread;

public class Mythread extends Thread {
	
	@Override
	public synchronized void start() {
		System.out.println("start method");
	}
	
	
	@Override
	public void run() {
		
			System.out.println("run method");
		
	}

}
