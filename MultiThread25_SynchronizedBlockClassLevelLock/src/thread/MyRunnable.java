package thread;

public class MyRunnable implements Runnable {

	private Display d;
	private	String name;
	
	public MyRunnable(Display d, String name) {
		super();
		this.d = d;
		this.name= name;
	}


	@Override
	public void run() {
		d.wish(name);
	}

}
