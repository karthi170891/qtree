package hierrarchial;

public class child2 extends parent{

	public static void main(String[] args) {
		
		child2.c2s();
		child2 ob= new child2();
		ob.c2ns();
		
		//afterinheritance
		
		ob.pn();
		child2.ps();
		
		
		//parent<=> child
		//parent<=> child2
	}
	
	public static void c2s()
	{
		System.out.println("child static method");
	}
	
	public void c2ns()
	{
		System.out.println("child non static method");
	}
}
