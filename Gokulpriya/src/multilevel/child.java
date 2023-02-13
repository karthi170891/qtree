package multilevel;

public class child extends parent {
public static void main(String[] args) {
	
	// calling its own method
	child.cs();
	child c= new child();
	c.cn();
	
	// after inheritance
	child.ps();
	c.pn();
}

public static void cs()
{
	System.out.println("child static method");
}

public  void cn()
{
	System.out.println("child non static method");
}
}
