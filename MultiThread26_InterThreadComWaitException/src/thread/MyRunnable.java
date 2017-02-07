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
		for (int i = 1; i <=100000; i++) {
			total+=i;
		}
		this.notify();
		System.out.println("Child: " + this.getTotal());
	}
}
