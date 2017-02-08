package thread;

public class MyRunnable implements Runnable {

	private int total=0;
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public void run() {
		
		synchronized (this) {
			System.out.println("Child Thread starts calculation");
			for (int i = 1; i <=100000; i++) {
				total+=i;
			}
			
			System.out.println("Child thread trying to give notification");
			
			this.notify();			
		}	
		
		System.out.println("Child: " + this.getTotal());
	}
}
