package polymorphism;

public class child extends parent{

	
	public static void main(String[] args) {
		
		
		//call overriden method(parent)
		
		parent p= new parent();
		p.area();
		
		
		//call overriding method(child)
		
		child c=new child();
		c.area();
	}
	
	
	//overriding method
	public void area()
	{
		int l=90;
		int b=9;
		System.out.println("Area of rectangle is "+ l*b);
	}
}
