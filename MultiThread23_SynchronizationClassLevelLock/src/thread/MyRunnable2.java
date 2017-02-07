package thread;

public class MyRunnable2 implements Runnable {

	private Display d;
		
	public MyRunnable2(Display d) {
		super();
		this.d = d;
	}


	@Override
	public void run() {
		d.displayC();

	}

}
