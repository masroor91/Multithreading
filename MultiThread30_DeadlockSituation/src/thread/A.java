package thread;

public class A {
	
	public synchronized void d1(B b) {
		System.out.println("Thread1 starts the execution of d1 method");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread1 trying to call B's last method");
		b.last();
		
	}
	
	public synchronized void last() {
		
		System.out.println("Inside A's Last Method");
	}
	
}
