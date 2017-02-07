package thread;

public class MyRunnable1 implements Runnable {
	
	private Display d;
	
	
	public MyRunnable1(Display d) {
		super();
		this.d = d;
	}


	@Override
	public void run() {
		d.displayN();
		
	}

}
