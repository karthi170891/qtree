package multithreading;

public class m1 extends Thread{
	public static void main(String[] args) {
		m1 ob= new m1();
		m1 ob2= new m1();
		
		ob.start();
		ob2.start();
		
	}
	
	public void run()
	{
		System.out.println("task 1");
	}

}
