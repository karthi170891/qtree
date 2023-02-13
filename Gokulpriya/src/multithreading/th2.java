package multithreading;

public class th2 implements Runnable {
	
	public static void main(String[] args) {
		
		th2 ob= new th2();
		Thread o= new Thread(ob);
		o.start();
	}

	@Override
	public void run() {
		
		System.out.println("task started ");
		
	}

}
