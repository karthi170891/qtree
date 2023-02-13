package multilevel;

public class grandchild extends child {

	public static void main(String[] args) {
		
		// parent<=> child <=> grandchild
		// grandchild=> own methods, child methods,parent methods
		
		grandchild.gs();
		grandchild g= new grandchild();
		g.gns();
		
		// child methods
		
		grandchild.cs();
		g.cn();
		
		//parent methods
		grandchild.ps();
		g.pn();
		
	}
	
	public static void gs()
	{
		System.out.println("grandchild static method");
	}
	
	
	public  void gns()
	{
		System.out.println("grandchild nonstatic method");
	}
	
}
