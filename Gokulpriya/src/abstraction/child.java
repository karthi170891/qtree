package abstraction;

public class child extends parent{

	public static void main(String[] args) {
		
		child c= new child();
		c.nm();//calling nrml method of abstract class
		c.abs();//calling abstract method of abstract class
		
		
		//parent p= new parent(); we cannot create object for abstract class
	}

	@Override
	public void abs() {
		
		System.out.println("abstract method");
		
	}
}
