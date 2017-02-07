package thread;

public class Mythread extends Thread {
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Child Thread");	
		}
		
		
		System.out.println("Entering into sleeping state");
		try{
		
			Thread.sleep(5000);
		
		}catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
	}

}
