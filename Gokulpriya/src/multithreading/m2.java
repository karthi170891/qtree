package multithreading;

public class m2 implements Runnable {

	public static void main(String[] args) {
		m2 ob= new m2();
		Thread t= new Thread(ob);
		
		m2 ob1= new m2();
		Thread t1= new Thread(ob1);
		
		t1.start();
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("task");
	}

}
