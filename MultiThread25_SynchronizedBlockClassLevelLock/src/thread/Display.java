package thread;

public class Display {
	
	public void wish(String name) {
		//;;;;;;; 1 lakh of lines
		
		System.out.println("Before synchronized Block");
		
		synchronized (Display.class) {
			
			for (int i = 0; i < 10; i++) {
				
				System.out.print("Good Moring: ");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(name);
			}
		
		}
				
		System.out.println("After synchronized Block");
		
		//;;;;;; 1 lakh of lines
	}
}
