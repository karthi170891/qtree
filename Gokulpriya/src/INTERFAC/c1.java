package INTERFAC;

public class c1 implements Intro{
	public static void main(String[] args) {
		
		
		c1 ob= new c1();
		ob.ab();
		ob.nm();
	}

	@Override
	public void ab() {
		
		System.out.println("abstract method");
	}

}
