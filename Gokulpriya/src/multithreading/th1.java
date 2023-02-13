package multithreading;

public class th1  extends Thread{
	// multithreading: performing multiple task at a time
	// thread: process
	
	// thread class
	// Runnable interface 
	
	// thread class 
	// inherits with thread class

	public static void main(String[] args) {
		
		th1 ob= new th1();
		ob.start();// create thread and start running the process 
	}
	
	public void run()
	{
		System.out.println("task started");
	}
}
