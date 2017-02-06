package thread;

public class Mythread extends Thread {
	
	public static Thread mt;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			try {
				mt.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Child Thread");
		}
	}

}
