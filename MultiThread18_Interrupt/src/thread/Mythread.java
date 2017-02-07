package thread;

public class Mythread extends Thread {
	
	
	@Override
	public void run() {
		try{
		
			for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			Thread.sleep(2000);
			
			}
		
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
	}

}
