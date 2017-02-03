package thread;

public class Mythread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("no-arg run");
		}
	}
	
	public void run(int i) {
		for (i = 0; i < 10; i++) {
			System.out.println("int-arg run");
		}
	}

}
