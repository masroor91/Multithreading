package thread;

public class B {
	
	public synchronized void d2(A a) {
		
		System.out.println("Thread2 starts the execution of d2 method");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread2 trying to call A's last method");
		a.last();
		
	}
	
	
	public synchronized void last() {
		System.out.println("Inside B's last method");
	}

}
